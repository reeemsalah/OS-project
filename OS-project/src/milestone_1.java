import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class milestone_1 {

	/**
	 * @param args
	 */
	private static int count = 0;

	public milestone_1() {

	}

	public static void systemCall1() {

	}

	public static void systemCall2(String input, String fileName) throws IOException {

		String fileNameString=fileName;
		File file = new File(fileNameString); 
		FileWriter f = new FileWriter(fileNameString, true);
		BufferedWriter bw = new BufferedWriter(f);
		bw.write(input);
		bw.write("\n");
		bw.flush();
		bw.close();

	}

	public static void systemCall3() {

	}

	public static void systemCall4() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		
		 
		  
		 int i =sc.nextInt();
		 int j =sc.nextInt();
		 count++; 
		 Process5 p1 = new Process5(count, i, j); 
		 p1.run();

		  
		 
		 String f2 = sc.nextLine();
		 String s = sc.nextLine();
		count++; 
		Process2 p2 = new Process2(count, f2 , s);
		p2.run();
		 
		 
		
		 String f1 = sc.nextLine();
		 count++; 
		Process1  p3 = new Process1(count, f1);
		p3.run();
		 

	}

}
