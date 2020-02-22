
public class Process2 implements Runnable
{ 
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	private String fileName;
	private String inputData;
	public Process2(int id ,String fileName,String inputData)
	{
		this.id=id;
		this.fileName=fileName;
		this.inputData=inputData;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			 fileName="D:\\"+"file_"+fileName+".txt";
			milestone_1.systemCall2(inputData, fileName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}