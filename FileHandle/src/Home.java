import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * @author Ahmed mansour
 *
 */
public class Home {

	
	public static void main(String[] args) {
		File data_file = new File("G:\\exported data\\iti\\Java & UML Programming\\Day 3\\test"+
	LocalDate.now()+LocalTime.now().getMinute()+LocalTime.now().getSecond()+".txt");
		try {
			System.out.println(data_file.getName());
			data_file.createNewFile();
			FileWriter fileWriter = new FileWriter(data_file,true);
			BufferedWriter data_writer = new  BufferedWriter(fileWriter);
			InputStreamReader systemreader = new InputStreamReader(System.in);
			BufferedReader consoleReader = new BufferedReader(systemreader);
			System.out.println("enter data");
			String line = consoleReader.readLine();
		     do {
		    	data_writer.write(line); 
				System.out.println("data is "+line);
				System.out.println("enter data");
				line = consoleReader.readLine();
		     }while(!line.equals("stop"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
