package multithreadingConcepts;

public class ThreadingByImplements implements Runnable{
	
	private int threadnumber;
	
	public ThreadingByImplements(int threadnumber) {
		this.threadnumber = threadnumber;
		
	}
	
	// need to override run method in the thread class
	@Override
	public void run() {
		
		for (int i=0; i<=5; i++) {
			System.out.println(i + " from ThreadNumber " + threadnumber );
			
			if (threadnumber ==3) {
				//throw new RuntimeException();	
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
