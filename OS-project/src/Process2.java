
public class Process2 implements Runnable
{
	private Object fileName;
	private Object inputData;
	public Process2(Object fileName,Object inputData)
	{
		this.fileName=fileName;
		this.inputData=inputData;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			String fileName=(String)(this.fileName);
			String inputData=(String)(this.inputData);
			milestone_1.systemCall2(inputData, fileName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}