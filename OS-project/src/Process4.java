
public class Process4 implements Runnable
{
	private int id;
	private ProcessState state= ProcessState.RUNNING;
	public Process4(int id)
	{
		this.id=id;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=500 ; i<=1000 ; i++)
		{
			milestone_1.systemCall3(i);
		}
	}
	
}