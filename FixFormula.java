package logicalbuilding;
public class FixFormula {

    public static int fixTheFormula(String input1) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder operators = new StringBuilder();
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.append(ch);
            }
        }
        int[] numArray = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            numArray[i] = numbers.charAt(i) - '0';
        }
        int result = numArray[0];
        for (int i = 0; i < operators.length(); i++) {
            char op = operators.charAt(i);
            int nextNum = numArray[i + 1];

            switch (op) {
                case '+':
                    result = result + nextNum;
                    break;
                case '-':
                    result = result - nextNum;
                    break;
                case '*':
                    result = result * nextNum;
                    break;
                case '/':
                    if (nextNum != 0) {
                        result = result / nextNum;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(fixTheFormula("Fo+23the3*like2+")); 
        System.out.println(fixTheFormula("we8+you2-7to/*32")); 
        System.out.println(fixTheFormula("i*-t5s-t8h1e4birds")); 
    }
}
