package com.training.corejava;

/**
 * Class for Class vs Object
 * 
 * @author Chinna.Putha
 *
 */
public class TestSample {

	// Variables
	String trainingName = "TestAutomation";
	int duration = 30;
	
	
	/**
	 * This method display the details
	 */
	public void displayTrainingDetails() {
		System.out.println("Training Name " + trainingName);
		System.out.println("Training Duration " + duration);
		
	}

	public static void main(String[] args) {
		
		TestSample ts= new TestSample();//create the object of the class
		ts.displayTrainingDetails();
		
		

	}

}
