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

	public static void systemCall3(int x)
	{
		System.out.println(x);
	}
	public static String systemCall4()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count++;
		Process1 p1= new Process1(count,"filetest_final");
		count++;
		Process2 p2=new Process2(count,"filetest_final","data entered");
		count++;
		Process3 p3=new Process3(count);
		count++;
		Process4 p4=new Process4(count);
		count++;
		Process5 p5=new Process5(count,400,700);
		p1.run();
		p2.run();
		p3.run();
		p4.run();
		p5.run();
		
		
		 

	}

}
