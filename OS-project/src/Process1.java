
import java.io.*;
import java.util.ArrayList;
public class Process1 implements Runnable
{	
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	
	public Process1 (int id)
	{
		this.id=id;
		
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try
		{
	
			String fileName=OS.systemCall4();
			 fileName="D:\\"+fileName+".txt";
			ArrayList<String> res=OS.systemCall1(fileName);		
			for(String s:res)
				OS.systemCall3(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}