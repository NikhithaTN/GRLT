package Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVWriter;

public class ShowResults {
	
	public static void writeDataLineByLine(String filePath) {
		// first create file object for file placed at location
		// specified by filepath
		File file = new File(filePath);
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);

			// adding header to csv
			String[] header = { "User", "Distance", "Time", "Speed" };
			writer.writeNext(header);
			Measure measure = new Measure();
			ArrayList<ArrayList<Double>> userDetails;
			userDetails = measure.speed();
			System.out.println(userDetails);
			double counter=0;
			for (int i = 0; i <10; i++) {
				counter++;
				Double[] data1 = { counter, userDetails.get(0).get(i), userDetails.get(1).get(i),
						userDetails.get(2).get(i) };
				int size = data1.length;
				String[] str = new String[size];

				for (int j = 0; j < size; j++) {
					str[j] = data1[j].toString();

				}
				
				writer.writeNext(str);
			}
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeDataLineByLine("./result.csv");
	
	}

}
