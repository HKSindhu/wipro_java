package logicBuilding;
public class UserIdGenerations {

    public static String generateUserId(String firstName, String lastName, String pin, int n) {
        String smaller, longer;
        if (firstName.length() < lastName.length()) {
            smaller = firstName;
            longer = lastName;
        } else if (firstName.length() > lastName.length()) {
            smaller = lastName;
            longer = firstName;
        } else {
            if (firstName.compareToIgnoreCase(lastName) < 0) {
                smaller = firstName;
                longer = lastName;
            } else {
                smaller = lastName;
                longer = firstName;
            }
        }

        char lastCharSmaller = smaller.charAt(smaller.length() - 1);
        char digitFromLeft = pin.charAt(n - 1);
        char digitFromRight = pin.charAt(pin.length() - n);

        String userId = "" + lastCharSmaller + longer + digitFromLeft + digitFromRight;

        StringBuilder toggled = new StringBuilder();
        for (char ch : userId.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
        String userId = generateUserId("Raj", "Kumar", "123456", 3);
        System.out.println("User ID = " + userId);
    }
}

