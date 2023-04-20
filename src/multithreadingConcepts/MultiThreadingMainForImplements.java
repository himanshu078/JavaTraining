package multithreadingConcepts;

public class MultiThreadingMainForImplements {

	@SuppressWarnings("deprecation")
	
	/*
	 * implementing runnable is better than extending as in Java we can extend only one class.
	 * so if we use extend, we cannot extend any other class
	 * if using implements, we can extend another class and use
	 */
	
	public static void main(String[] args) {
		
		
		//Create object of the class created
		ThreadingByImplements multi = new ThreadingByImplements(1);
		ThreadingByImplements multi2 = new ThreadingByImplements(2);
		
		// if implementing runnable need to create object of thread and pass the object of runnable class
		Thread myThread = new Thread(multi);
		Thread myThread2 = new Thread(multi2);
		System.out.println("Before starting thread = " + myThread.isAlive());
		System.out.println("Before starting thread2 = " + myThread2.isAlive());
		myThread.start();
		myThread2.start();
		System.out.println("While thread is running= " +  myThread.isAlive());
		System.out.println("While thread is running2= " +  myThread2.isAlive());
	//	myThread2.stop();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After thread completion= " + myThread.isAlive());
		System.out.println("After thread completion2= " + myThread2.isAlive());
		
		
		
		
		

	}

}
