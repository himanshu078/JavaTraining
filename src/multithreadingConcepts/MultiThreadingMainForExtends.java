package multithreadingConcepts;

public class MultiThreadingMainForExtends {

	public static void main(String[] args) {
		
		
		//Create object of the class created
		ThreadingByExtending multi = new ThreadingByExtending(7);
		ThreadingByExtending multi2 = new ThreadingByExtending(6);
		
		// to run a thread need to use start()
		multi.start();
		multi2.start();
		
		//create multiple threads
		for (int i=0; i<=5; i++) {
			ThreadingByExtending multi3 = new ThreadingByExtending(i);
			multi3.start();
		}
		
		

	}

}
