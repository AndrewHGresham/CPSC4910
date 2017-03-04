package SurveyFrame;

import javax.swing.JOptionPane;

public class Feedback {
	
	private Integer userResponse;
	
	Feedback() {}	
	
	// Stores yes response as 0, no response as 1
	public Integer getFeedback() {
		
		userResponse = JOptionPane.showConfirmDialog(null, "Did you enjoy your route?");
		
		if (userResponse == 0 || userResponse == 1) {
			JOptionPane.showMessageDialog(null, "Thank you for your feedback!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Thank you for testing the app!");
		}
		
		return userResponse;
	}
	
}









/*
package SurveyFrame;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
			
		Feedback f = new Feedback();
		
		
		// Only call when route is finished  
		// I do not know the proper syntax for checking if the route is finished yet */	
		// if (route.isFinished == true) {	
		Integer answer = f.getFeedback();
        //}
	}
}
*/
