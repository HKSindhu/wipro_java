package Assessment;

public class Largest3No {

	public static void main(String[] args) {
		int a=25;
		int b=14;
		int c=21;
		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Largest number is: " + max);
	}

}
