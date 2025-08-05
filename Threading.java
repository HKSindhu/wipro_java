package test1;

public class Threading {
	public static void main(String[] args) {
	        Thread t1 = new Thread() {
	            public void run() {
	                System.out.println("Thread name: " + Thread.currentThread().getName());
	            }
	        };
	        t1.setName("Scooby");

	        Thread t2 = new Thread() {
	            public void run() {
	                System.out.println("Thread name: " + Thread.currentThread().getName());
	            }
	        };
	        t2.setName("Shaggy");

	        t1.start();
	        t2.start();
	    }
}


