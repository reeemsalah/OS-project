import java.io.File;
import java.util.Random;

public class Process5 implements Runnable
{
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	private int lowerNumber;
	private int upperNumber;
	
	public Process5 (int id,int lowerNumber,int upperNumber)
	{
		this.id=id;
		this.lowerNumber=lowerNumber;
		this.upperNumber=upperNumber;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			
			
			int fileNumber=(int)(Math.random()*10000+1);
			String fileName="D:\\"+"file_"+fileNumber+".txt";
			File myFile=new File(fileName);
			myFile.createNewFile();
			for(int i=lowerNumber;i<=upperNumber;i++)
			{
				String tmp=""+i;
				milestone_1.systemCall2(tmp, fileName);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}