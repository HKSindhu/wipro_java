package test1;
import java.util.Random;
public class Thread1 {
	public static void main(String[] args) {
	        ColourTask task = new ColourTask();
	        Thread t = new Thread(task);
	        t.start();
	    }
	}

	class ColourTask implements Runnable {
	    public void run() {
	        String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
	        Random rand = new Random();
	        while (true) {
	            int index = rand.nextInt(colours.length);
	            String colour = colours[index];
	            System.out.println(colour);
	            if (colour.equals("red")) {
	                break;
	            }
	        }
	    }
}

