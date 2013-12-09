//package edu.utah.dcc.e4.application.core.user.objects;
//
//import javax.inject.Inject;
//
//import org.apache.log4j.Logger;
//
//
///**
// * Object to handle looking up users, verifying their
// * existence, and setting up their administrative status
// * in the application.
// * 
// * @author mdean
// *
// */
//public class UserChecker {
//	private User user = null;
//	@Inject Logger logger;
//
//	public UserChecker(String accountName) {
//		logger.debug("Checking that user account "+ accountName + " exists");
//		this.user = tryToRetrieveUserFromDatabase(accountName);
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public Boolean accountExists() {
//		if (user != null) {
//			return true;
//		} else
//			return false;
//	}
//	
//	public Boolean userIsAdministrative(){
//		if (user.getAdministrativeRights()){
//			logger.debug("User has administrative rights");
//			return true;
//		} else return false;
//	}
//	
//	public String getPassword(){
//		if (user != null){
//			return user.getPasswordDigest();
//		} else return null;
//	}
//
//	private User tryToRetrieveUserFromDatabase(String accountName) {
//		logger.debug("Retrieving "+accountName+ " from database");
//		IUserDAO userDAO = DAOFactory.instance(DAOFactory.HIBERNATE)
//				.getUserDAO();
//		userDAO.getSession().beginTransaction();
//		User user = (User) userDAO.getSession()
//				.getNamedQuery(User.GETUSERBYACCOUNTNAME)
//				.setString("accountName", accountName).uniqueResult();
//		userDAO.getSession().getTransaction().commit();
//		return user;
//	}
//}
