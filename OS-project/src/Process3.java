
public class Process3 implements Runnable
{
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	public Process3(int id)
	{
		this.id=id;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=300 ; i++)
		{	
		OS.systemCall3(""+i);
		}
	}
	
}