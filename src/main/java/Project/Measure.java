package Project;

import java.util.ArrayList;

public class Measure  {
	
	public  ArrayList<ArrayList<Double>> speed() {
		ArrayList<Double> userSpeed = new ArrayList();
		UserInput userInput = new UserInput();
		userInput.userInputs();

		for (int i=0; i<userInput.time.size(); i++) {
			
			double distance=userInput.userDetails.get(0).get(i);
			double time=userInput.userDetails.get(1).get(i);
			double speed = distance/time;
			userSpeed.add(speed);
		}
		userInput.userDetails.add(userSpeed);
		
		return userInput.userDetails;
	}


}
