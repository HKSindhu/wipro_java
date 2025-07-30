package String;

public class SameDataString {

	public static void main(String[] args) {
		String columnist1 = "Sin"; 
        String columnist2 = "Sin"; 
        String columnist3 = "Sun"; 
        // Are any of the above Strings equal to one another? 
        boolean equals1 = columnist1.equals(columnist2); 
        boolean equals2 = columnist1.equals(columnist3); 
        // Display the results of the equality checks. 
        System.out.println("\"" + columnist1 + "\" equals \"" + 
            columnist2 + "\"? " + equals1); 
        System.out.println("\"" + columnist1 + "\" equals \"" + 
            columnist3 + "\"? " + equals2);
	}

}
