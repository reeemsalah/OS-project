import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class milestone_1  {

	/**
	 * @param args
	 */
	public milestone_1()
	{
		
	}
	public static void systemCall1()
	{
		
	}
	public static void systemCall2(String input,String fileName) throws IOException
	{
		
			FileWriter f=new FileWriter(fileName,true);
			BufferedWriter bw=new BufferedWriter(f);
			bw.write(input);
			bw.write("\n");
			bw.flush();
			bw.close();
			
		
	}
	public static void systemCall3()
	{
		
	}
	public static void systemCall4()
	{
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process5 p=new Process5 (1,10);
		p.run();

	}


	

}
