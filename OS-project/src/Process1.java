
import java.io.*;
public class Process1 implements Runnable
{	
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	private String fileName;
	public Process1 (int id,String fileName)
	{
		this.id=id;
		this.fileName=fileName;
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try
		{
	
		 
			String fileNameString="D:\\"+fileName.toString()+".txt";
			File file = new File(fileNameString); 
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}