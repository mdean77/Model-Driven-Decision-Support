 
package edu.utah.dcc.e4.application.core.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;

//import application.IntensiveCareUnit;
import edu.utah.dcc.e4.hsqldb.osgi.HsqldbService;

public class AddFakePatientsHandler {
//	private static IntensiveCareUnit picu;
	@Execute
	public void execute(HsqldbService hsqlService) {
		System.out.println("In add fake patients handler");
		if(hsqlService.isRunning()){
			System.out.println("HSQLDB Server is running");
			System.out.println("The database name is --> " + hsqlService.getDatabase());
			System.out.println("The database path is --> " + hsqlService.getDatabasePath());
		} else {
			System.out.println("HSQLDB Server is NOT running");
		}
//		Properties hibernateProperties = new Properties();
//		hibernateProperties.setProperty(Environment.HBM2DDL_AUTO, "create");
//		hibernateProperties.setProperty(Environment.SHOW_SQL, "false");
//		hibernateProperties.setProperty(Environment.FORMAT_SQL, "false");
//		hibernateProperties.setProperty(Environment.USE_SQL_COMMENTS, "false");
//		hibernateProperties.setProperty(Environment.C3P0_MIN_SIZE, "5");
//		hibernateProperties.setProperty(Environment.C3P0_MAX_SIZE, "20");
//		hibernateProperties.setProperty(Environment.C3P0_TIMEOUT, "1800");
//		hibernateProperties.setProperty(Environment.C3P0_MAX_STATEMENTS, "50");
//		hibernateProperties.setProperty(Environment.DRIVER,
//				"org.hsqldb.jdbcDriver");
//		hibernateProperties.setProperty(Environment.USER, "sa");
//		hibernateProperties.setProperty(Environment.URL,
//				"jdbc:hsqldb:hsql://localhost/coreDecisions"); 
//		hibernateProperties.setProperty(Environment.PASS, "");
//		hibernateProperties.setProperty(Environment.DIALECT,
//				org.hibernate.dialect.HSQLDialect.class.getName());
//		
//		hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
//		
//		final String dataStoreName = "CoreDecisionDataStore";
//		final HbDataStore dataStore = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);
//		dataStore.setDataStoreProperties(hibernateProperties);
//
//		// Configure the EPackages used by this DataStore.
//		dataStore.setEPackages(new EPackage[] { ApplicationPackage.eINSTANCE });
//		try {
//			dataStore.initialize();
//		} finally {
//			// print the hibernate mapping
//			System.err.println(dataStore.getMappingXML());
//		}
//		
//		final SessionFactory sessionFactory = dataStore.getSessionFactory();
//		{
//			// Open a new Session and start transaction.
//			final Session session = sessionFactory.openSession();
//			session.beginTransaction();
//
//			// Retrieve the intensive care unit and its child objects.
//			// Note that you must use the EClass name in the HQL query.
//			Query query = session.createQuery("FROM IntensiveCareUnit");
//			List<?> intensiveCareUnits = query.list();
//			if (intensiveCareUnits.isEmpty()) {
//				picu = ApplicationFactory.eINSTANCE.createIntensiveCareUnit();
//			} else {
//				picu = (IntensiveCareUnit) intensiveCareUnits.get(0);
//			}
//
//			// Make it persistent.
//			session.save(picu);
//			addFakeData();
//
//			// Commit the changes to the database.
//			session.getTransaction().commit();
//			// Close the session.
//			session.close();
//		}
//		
//		
	}
//	
//	private static void addFakeData() {
//
//		// Create the objects
//		Patient patient1 = ApplicationFactory.eINSTANCE.createPatient();
//		picu.getPatients().add(patient1);
//		User user1 = ApplicationFactory.eINSTANCE.createUser();
//		picu.getUsers().add(user1);
//		Patient patient2 = ApplicationFactory.eINSTANCE.createPatient();
//		picu.getPatients().add(patient2);
//		User user2 = ApplicationFactory.eINSTANCE.createUser();
//		picu.getUsers().add(user2);
////		User user3 = ApplicationFactory.eINSTANCE.createUser();
////		picu.getUsers().add(user3);
//		ClinicalDecision decision1 = ApplicationFactory.eINSTANCE.createClinicalDecision();
//		ClinicalDecision decision2 = ApplicationFactory.eINSTANCE.createClinicalDecision();
//		ClinicalDecision decision3 = ApplicationFactory.eINSTANCE.createClinicalDecision();
//		ClinicalDecision decision4 = ApplicationFactory.eINSTANCE.createClinicalDecision();
//		patient1.getDecisions().add(decision1);
//		patient1.getDecisions().add(decision2);
//		patient2.getDecisions().add(decision3);
//		patient2.getDecisions().add(decision4);
//
//		// Give the object fields some values
//		GregorianCalendar birthdate1 = new GregorianCalendar(2000, 5, 25);
//		GregorianCalendar birthdate2 = new GregorianCalendar(2010, 5, 25);
//		GregorianCalendar decisionDates1 = new GregorianCalendar(2000, 5, 26);
//		GregorianCalendar decisionDates2 = new GregorianCalendar(2000, 5, 27);
//		GregorianCalendar decisionDates3 = new GregorianCalendar(2010, 5, 26);
//		GregorianCalendar decisionDates4 = new GregorianCalendar(2010, 5, 27);
//		initializePatientValues(patient1, "Dean", "Mike", birthdate1, 125., 55.6, "CHOM0099", "12-34-56");
//		initializePatientValues(patient2, "Zuspan", "Sally", birthdate2, 114.6, 35.6, "CHLA9099", "34-56-78");
//		initializePersonValues(user1, "Welkie", "Katy");
//		initializePersonValues(user2, "Maloney", "Chris");
//	}
//
//	private static void initializePatientValues(Patient patient, String last, String first, GregorianCalendar birthdate,
//			Double height, Double weight, String studyID, String medRecNum) {
//		patient.setBirthdate(birthdate);
//		initializePersonValues(patient, last, first);
//		patient.setHeight(height);
//		patient.setWeight(weight);
//		patient.setMedRecNum(medRecNum);
//		patient.setStudyID(studyID);
//		patient.setStatus(StatusType.SAMPLE);
//
//	}
//
//	private static void initializePersonValues(Person person, String last, String first) {
//		person.setFirstName(first);
//		person.setLastName(last);
//	}
	
	@CanExecute
	public boolean canExecute(MPerspective myPerspective) {
		System.out.println(myPerspective.getElementId());
		if (myPerspective.getElementId().equals("edu.utah.dcc.e4.application.core.perspective.superuser"))
		return true;  
		return false;
	}
		
}