import java.io.File;
import java.util.Random;

public class Process5 implements Runnable
{
	private Object lowerNumber;
	private Object upperNumber;
	
	public Process5 (Object lowerNumber,Object upperNumber)
	{
		this.lowerNumber=lowerNumber;
		this.upperNumber=upperNumber;
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			int lowerNumber=(int)(this.lowerNumber);
			int upperNumber=(int)(this.upperNumber);
			Random rand= new Random();
			int fileNumber= rand.nextInt()*10000+1;
			String fileName="file_"+fileNumber+".txt";
			File myFile=new File(fileName);
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