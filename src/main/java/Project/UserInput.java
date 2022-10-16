package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

	ArrayList<Double> distance = new ArrayList<Double>();
	ArrayList<Double> time = new ArrayList<Double>();
	ArrayList<ArrayList<Double>> userDetails = new ArrayList();
	Scanner sc = new Scanner(System.in); 	
	
	public  ArrayList<ArrayList<Double>> userInputs() {
		int counter=1;
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
            System.out.println("Please enter distance of user"+counter+  " ");
            distance.add(sc.nextDouble());
            System.out.println("Please enter time of user"+counter+  " ");
            time.add(sc.nextDouble());
            counter++;
			if (counter==11) {
				break;
			}	
		}
		userDetails.add(distance);
        userDetails.add(time);
		return userDetails;
	}
}
