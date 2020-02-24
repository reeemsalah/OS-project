import java.io.File;
import java.util.Random;

public class Process5 implements Runnable
{
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	
	public Process5 (int id)
	{
		this.id=id;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			
			int lowerNumber=Integer.parseInt(OS.systemCall4());
			int upperNumber=Integer.parseInt(OS.systemCall4());
			int fileNumber=(int)(Math.random()*10000+1);
			String fileName="D:\\"+"file_"+fileNumber+".txt";
			File myFile=new File(fileName);
			myFile.createNewFile();
			for(int i=lowerNumber;i<=upperNumber;i++)
			{
				String tmp=""+i;
				OS.systemCall2(tmp, fileName);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}