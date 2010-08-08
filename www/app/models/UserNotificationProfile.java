package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.data.validation.Required;

/**
 * Represents the UserNotificationProfile Entity in the Database and it's relations with other entities.
 * 
 * @author Amr Tj.Wallas
 * @see models.ProjectNotificationProfile
 */
@Entity
public class UserNotificationProfile extends SmartModel {
		
	@ManyToOne
	public User user;
	@ManyToOne
	public Project project;
	public boolean deleted;
	// *********** List Of Action Types Below ***********
	public boolean setMeeting;
	public boolean setSprint;
	public boolean addRole;
	public boolean addProductRole;
	public boolean editProductRole;
	public boolean deleteProductRole;	
	public boolean reportImpediment;
	public boolean onCreateComponent;
	public boolean onEditComponent;
	public boolean onDeleteComponent;
	public boolean addColumn;
	public boolean deleteColumn;
	public boolean assignStoryToSprint;
	public boolean RequestToBeReviewer;
	public boolean AcceptToBeReviewerRequest;
	public boolean RejectToBeReviewerRequest;
	public boolean deletedFromProject;
	// *********** List Of Action Types Ended ***********

	/**
	 * Creates a new UserNotificationProfile for a specific
	 * user "user" in a specific project "project" with the default notification
	 * options as set in the ProjectNotificationProfile of that project.
	 * 
	 * @author Amr Tj.Wallas
	 * @param user An object User that the User Notification Profile belongs to.
	 * @param project An object Project that the User Notification Profile belongs to.
	 * @see models.ProjectNotificationProfile
	 * @see models.Project
	 * @see models.User
	 */
	public UserNotificationProfile (@Required User user, @Required Project project) {
		this.user = user;
		this.project = project;
		this.setMeeting = project.notificationProfile.setMeeting;
		this.setSprint = project.notificationProfile.setSprint;
		this.addRole = project.notificationProfile.addRole;
		this.addProductRole = project.notificationProfile.addProductRole;
		this.editProductRole = project.notificationProfile.editProductRole;
		this.deleteProductRole = project.notificationProfile.deleteProductRole;		
		this.reportImpediment = project.notificationProfile.reportImpediment;
		this.onCreateComponent = project.notificationProfile.onCreateComponent;
		this.onEditComponent = project.notificationProfile.onEditComponent;
		this.onDeleteComponent = project.notificationProfile.onDeleteComponent;
		this.addColumn=project.notificationProfile.addColumn;
	    this.deleteColumn=project.notificationProfile.deleteColumn;
	    this.assignStoryToSprint = project.notificationProfile.assignStoryToSprint;
		this.RequestToBeReviewer= project.notificationProfile.RequestToBeReviewer;
		this.AcceptToBeReviewerRequest= project.notificationProfile.AcceptToBeReviewerRequest;
		this.RejectToBeReviewerRequest= project.notificationProfile.RejectToBeReviewerRequest;
		this.deletedFromProject=project.notificationProfile.deletedFromProject;
	}

	/**
	 * Takes the action & returns the boolean variable of this action whether it's true or false
	 * 
	 * @author Moataz_Mekki 
	 * @param action
	 *             the string that describes the action
	 * @return boolean
	 */
	public boolean checkAction(String action) {
		if (action.equalsIgnoreCase("setMeeting"))
			return setMeeting;
		else if (action.equalsIgnoreCase("setSprint"))
			return setSprint;
		else if (action.equalsIgnoreCase("addRole"))
			return addRole;
		else if (action.equalsIgnoreCase("addProductRole"))
			return addProductRole;
		else if (action.equalsIgnoreCase("editProductRole"))
			return editProductRole;
		else if (action.equalsIgnoreCase("deleteProductRole"))
			return deleteProductRole;		
		else if (action.equalsIgnoreCase("reportImpediment"))
			return reportImpediment;
		else if (action.equalsIgnoreCase("onCreateComponent"))
			return onCreateComponent;
		else if (action.equalsIgnoreCase("onEditComponent"))
			return onEditComponent;
		else if (action.equalsIgnoreCase("onDeleteComponent"))
			return onDeleteComponent;
		else if (action.equalsIgnoreCase("addColumn"))
			return addColumn;
		else if (action.equalsIgnoreCase("deleteColumn"))
			return deleteColumn;
		else if (action.equalsIgnoreCase("assignStoryToSprint"))
			return assignStoryToSprint;
		else if (action.equalsIgnoreCase("RequestToBeReviewer"))
			return RequestToBeReviewer;
		else if (action.equalsIgnoreCase("AcceptToBeReviewerRequest"))
			return AcceptToBeReviewerRequest;
		else if (action.equalsIgnoreCase("RejectToBeReviewerRequest"))
			return RejectToBeReviewerRequest;
		else if (action.equalsIgnoreCase("deletedFromProject"))
			return deletedFromProject;
		else
			return false;
	}

}
