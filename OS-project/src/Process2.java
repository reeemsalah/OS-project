
public class Process2 implements Runnable
{ 
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	
	public Process2(int id )
	{
		this.id=id;
		
	}

	@Override
	public void run() {
		
		try {
			
			String fileName=OS.systemCall4();
			String inputData=OS.systemCall4();
			 fileName=fileName+".txt";
			OS.systemCall2(inputData, fileName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}