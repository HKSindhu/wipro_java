package Assessment;

public class Bitwise {

	public static void main(String[] args) {
		 int a = 5;   // 0101 in binary
	     int b = 3;   // 0011 in binary

	        System.out.println("a & b: " + (a & b));  // Bitwise AND => 0001 = 1
	        System.out.println("a | b: " + (a | b));  // Bitwise OR  => 0111 = 7
	        System.out.println("a ^ b: " + (a ^ b));  // Bitwise XOR => 0110 = 6
	        System.out.println("~a: " + (~a));        // Bitwise NOT => ...1010 (in 32-bit) = -6
	        System.out.println("a << 1: " + (a << 1)); // Left shift => 1010 = 10
	        System.out.println("a >> 1: " + (a >> 1)); // Right shift => 0010 = 2
	    

	}

}
