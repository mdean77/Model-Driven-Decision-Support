/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 * 
 * $Id: Tutorial.java,v 1.4 2010/11/11 10:28:15 mtaal Exp $
 */

package teneo.samples;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import application.ApplicationFactory;
import application.ApplicationPackage;
import application.ClinicalDecision;
import application.IntensiveCareUnit;
import application.Patient;
import application.Person;
import application.StatusType;
import application.User;


/**
 * Quick Start Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class Tutorial {

	private static IntensiveCareUnit picu;
	//static org.hsqldb.server.Server server;

	/** The main method */
	public static void main(String[] args) {

		// To configure Hibernate, supply properties describing the JDBC driver,
		// URL, username/password and SQL dialect.
		// By default the properties are obtained from the file
		// "hibernate.properties" at the classpath root.
		//
		// Alternatively, you can set the properties programmatically:
		//
		// For more information see <a
		// href="http://www.hibernate.org/hib_docs/v3/reference/en/html/session-configuration.html#configuration-programmatic">
		// section 3.1 of the Hibernate manual</a>.
		//
		Properties hibernateProperties = new Properties();
		//
		// 1) From a ".properties" file or stream.
		// InputStream in = ...
		// hibernateProperties.load(in);
		//
		// 2) or populated manually:
		 hibernateProperties.setProperty(Environment.DRIVER,
		 "com.mysql.jdbc.Driver");
		 hibernateProperties.setProperty(Environment.USER, "root");
		 hibernateProperties.setProperty(Environment.URL,
		 "jdbc:mysql://127.0.0.1:3306/decisions");
		 hibernateProperties.setProperty(Environment.PASS, "root");
		 hibernateProperties.setProperty(Environment.DIALECT,
		 org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());
		 hibernateProperties.setProperty(Environment.HBM2DDL_AUTO, "create");
		 hibernateProperties.setProperty(Environment.SHOW_SQL, "false");
		 hibernateProperties.setProperty(Environment.FORMAT_SQL, "false");
		 hibernateProperties.setProperty(Environment.USE_SQL_COMMENTS, "false");
		 hibernateProperties.setProperty(Environment.C3P0_MIN_SIZE, "5");
		 hibernateProperties.setProperty(Environment.C3P0_MAX_SIZE, "20");
		 hibernateProperties.setProperty(Environment.C3P0_TIMEOUT, "1800");
		 hibernateProperties.setProperty(Environment.C3P0_MAX_STATEMENTS, "50");
		 //hibernateProperties.setProperty(Environment.GENERATE_STATISTICS, "true");

		 


		// hibernateProperties.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
		// hibernateProperties.setProperty(Environment.USER, "sa");
		// hibernateProperties.setProperty(Environment.URL, "jdbc:hsqldb:mem:library");
		// hibernateProperties.setProperty(Environment.PASS, "");
		// hibernateProperties.setProperty(Environment.DIALECT,
		// org.hibernate.dialect.HSQLDialect.class.getName());

//		// NEW properties from Mike Dean's original stuff - will not run if there is not already a running server!
//		hibernateProperties.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
//		hibernateProperties.setProperty(Environment.USER, "sa");
//		hibernateProperties.setProperty(Environment.URL, "jdbc:hsqldb:mem:library");
//		//hibernateProperties.setProperty(Environment.URL, "jdbc:hsqldb:hsql://localhost:9001"); // main difference is here
//		hibernateProperties.setProperty(Environment.PASS, "");
//		hibernateProperties.setProperty(Environment.DIALECT, org.hibernate.dialect.HSQLDialect.class.getName());

		// set a specific option
		// see this page
		// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");

		// use the joined inheritance mapping

		// hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");

		// use an annotations file as an example
		// this lets the library use a special table
		// hibernateProperties.setProperty(PersistenceOptions.PERSISTENCE_XML,
		// "edu/utah/cdmcc/e4/glucose/model/examples/annotations.xml");

		//startServer();

		// Create the DataStore.
		final String dataStoreName = "GlucoseDataStore";
		final HbDataStore dataStore = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);
		dataStore.setDataStoreProperties(hibernateProperties);

		// Configure the EPackages used by this DataStore.
		dataStore.setEPackages(new EPackage[] { ApplicationPackage.eINSTANCE });

		// Initialize the DataStore. This sets up the Hibernate mapping and, in
		// turn, creates the corresponding tables in the database.
		try {
			dataStore.initialize();
		} finally {
			// print the hibernate mapping
			System.err.println(dataStore.getMappingXML());
		}

		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{
			// Open a new Session and start transaction.
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Retrieve the intensive care unit and its child objects.
			// Note that you must use the EClass name in the HQL query.
			Query query = session.createQuery("FROM IntensiveCareUnit");
			List<?> intensiveCareUnits = query.list();
			if (intensiveCareUnits.isEmpty()) {
				picu = ApplicationFactory.eINSTANCE.createIntensiveCareUnit();
			} else {
				picu = (IntensiveCareUnit) intensiveCareUnits.get(0);
			}

			// Make it persistent.
			session.save(picu);
			addFakeData();

			// Commit the changes to the database.
			session.getTransaction().commit();
			// Close the session.
			session.close();
		}

		{
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Retrieve the intensive care unit and its child objects.
			// Note that you must use the EClass name in the HQL query.
			Query query = session.createQuery("FROM IntensiveCareUnit");
			List<?> intensiveCareUnits = query.list();
			picu = (IntensiveCareUnit) intensiveCareUnits.get(0);

			
			// Obtain the first user and patient
			User user = picu.getUsers().get(0);
			System.out.println("First user ==> " + user.getName());
			Patient patient = picu.getPatients().get(0);
			System.out.println("First patient ==> " + patient.getName());
			System.out.println();

			// Verify that the eContainer and references are set correctly.
			assert (patient.eContainer() == picu);
			assert (patient.getCreatedBy() == user);

			System.out.println("List of all persons in database:");
			query = session.createQuery("From Person");
			List<?> persons = query.list();
			for (Iterator<?> it = persons.iterator(); it.hasNext();) {
				Person person = (Person) it.next();
				System.out.println(person.getName());
			}
			System.out.println("The number of persons is " + persons.size());
			System.out.println();

			System.out.println("List of all persons details in database:");
			query = session.createQuery("From Person");
			for (Iterator<?> it = persons.iterator(); it.hasNext();) {
				Person person = (Person) it.next();
				System.out.println(person.toString());
			}
			System.out.println("The number of persons is " + persons.size());
			System.out.println();
			
			System.out.println("List of all PATIENTS in database:");
			EList<Patient> patients = picu.getPatients();
			for (Iterator<?> it = patients.iterator(); it.hasNext();) {
				patient = (Patient) it.next();
				System.out.println(patient.getName());
			}
			System.out.println("The number of patients is " + patients.size());
			System.out.println();

			System.out.println("List of all PATIENTS details in database:");
			for (Iterator<?> it = patients.iterator(); it.hasNext();) {
				patient = (Patient) it.next();
				System.out.println(patient.toString());
			}
			System.out.println("The number of patients is " + patients.size());
			System.out.println();
			// Commit.
			session.getTransaction().commit();
			session.close();
			
//			try {
//				stopServer();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

		//
		// try {
		// String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=" + dataStoreName;
		// final URI uri = URI.createURI(uriStr);
		// ResourceSet resourceSet = new ResourceSetImpl();
		// final Resource res = resourceSet.createResource(uri);
		//
		// res.load(Collections.EMPTY_MAP);
		// Iterator<?> it = res.getContents().iterator();
		// Library libTest;
		// while (it.hasNext()) {
		// libTest = (Library) it.next();
		// System.out.println(libTest.getName());
		// }
		//
		// Library libNew = GlucoseFactory.eINSTANCE.createLibrary();
		// libNew.setName("My Second Library");
		//
		// // create a writer
		// Writer writerNew = GlucoseFactory.eINSTANCE.createWriter();
		// writerNew.setName("I. Asimov");
		// writerNew.setFirstName("Isaac");
		// writerNew.setLastName("Asimov");
		//
		// // and one of his books
		// Book bookNew = GlucoseFactory.eINSTANCE.createBook();
		// bookNew.setAuthor(writerNew);
		// bookNew.setPages(305);
		// bookNew.setTitle("Foundation and Empire");
		// bookNew.setCategory(BookCategory.SCIENCE_FICTION);

		// add the writer/book to the library.
		// libNew.getWriters().add(writerNew);
		// libNew.getBooks().add(bookNew);
		//
		// // now add the top-level object to the resource
		// res.getContents().add(libNew);
		//
		// res.save(null);
		// } catch (IOException e) {
		// throw new Error("IOException", e);
		// }

	}

	private static void addFakeData() {

		// Create the objects
		Patient patient1 = ApplicationFactory.eINSTANCE.createPatient();
		picu.getPatients().add(patient1);
		User user1 = ApplicationFactory.eINSTANCE.createUser();
		picu.getUsers().add(user1);
		Patient patient2 = ApplicationFactory.eINSTANCE.createPatient();
		picu.getPatients().add(patient2);
		User user2 = ApplicationFactory.eINSTANCE.createUser();
		picu.getUsers().add(user2);
//		User user3 = ApplicationFactory.eINSTANCE.createUser();
//		picu.getUsers().add(user3);
		ClinicalDecision decision1 = ApplicationFactory.eINSTANCE.createClinicalDecision();
		ClinicalDecision decision2 = ApplicationFactory.eINSTANCE.createClinicalDecision();
		ClinicalDecision decision3 = ApplicationFactory.eINSTANCE.createClinicalDecision();
		ClinicalDecision decision4 = ApplicationFactory.eINSTANCE.createClinicalDecision();
		patient1.getDecisions().add(decision1);
		patient1.getDecisions().add(decision2);
		patient2.getDecisions().add(decision3);
		patient2.getDecisions().add(decision4);

		// Give the object fields some values
		GregorianCalendar birthdate1 = new GregorianCalendar(2000, 5, 25);
		GregorianCalendar birthdate2 = new GregorianCalendar(2010, 5, 25);
		GregorianCalendar decisionDates1 = new GregorianCalendar(2000, 5, 26);
		GregorianCalendar decisionDates2 = new GregorianCalendar(2000, 5, 27);
		GregorianCalendar decisionDates3 = new GregorianCalendar(2010, 5, 26);
		GregorianCalendar decisionDates4 = new GregorianCalendar(2010, 5, 27);
		initializePatientValues(patient1, "Dean", "Mike", birthdate1, 125., 55.6, "CHOM0099", "12-34-56");
		initializePatientValues(patient2, "Zuspan", "Sally", birthdate2, 114.6, 35.6, "CHLA9099", "34-56-78");
		initializePersonValues(user1, "Welkie", "Katy");
		initializePersonValues(user2, "Maloney", "Chris");
	}

	private static void initializePatientValues(Patient patient, String last, String first, GregorianCalendar birthdate,
			Double height, Double weight, String studyID, String medRecNum) {
		patient.setBirthdate(birthdate);
		initializePersonValues(patient, last, first);
		patient.setHeight(height);
		patient.setWeight(weight);
		patient.setMedRecNum(medRecNum);
		patient.setStudyID(studyID);
		patient.setStatus(StatusType.SAMPLE);

	}

	private static void initializePersonValues(Person person, String last, String first) {
		person.setFirstName(first);
		person.setLastName(last);
	}

//	public static void startServer() {
//		String[] args1 = { "-database", "glucoseData", "-port", String.valueOf(9001), "-no_system_exit", "true" };
//		if (server == null) server = new Server();
//		Server.main(args1);
//		server.start();
//	};
//	
//	public static void stopServer() throws SQLException{
//		if (server != null){
//			Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost:9001","sa","");
//		String sql = "SHUTDOWN";
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate(sql);
//		stmt.close();
//		server = null;
//		}
	
		
//	}

}
