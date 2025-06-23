package modifier.Method;

//Methods can only be accessed by one thread or object at a time

public class Synchronized {
	
	 public static void main(String[] args) {
		 Learn cnt = new Learn(); // Shared resource-

	        // Thread 1 to increment counter
	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                cnt.inc();
	            }
	        });

	        // Thread 2 to increment counter
	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                cnt.inc();
	            }
	        });

	        // Start both threads
	        t1.start();
	        t2.start();

	        // Wait for threads to finish
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print final counter value
	        System.out.println("Counter: " + cnt.get());
	    }
	 

	

}
 class Learn {
	 private int c = 0; // Shared variable

	    // Synchronized method to increment counter
	    public synchronized void inc() {
	        c++;
	    }

	    // Synchronized method to get counter value
	    public synchronized int get() {
	        return c;
	    }
}