package pgms;
import java.util.*;

public class SudokuValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];

        // Read 9 rows as strings (with digits or '.')
        for (int i = 0; i < 9; i++) {
            String line = sc.next();  // each row
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        System.out.println(isValid(board));
        sc.close();
    }

    static boolean isValid(char[][] b) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = b[i][j];
                if (c != '.') {
                    if (!set.add(c + "row" + i) ||
                        !set.add(c + "col" + j) ||
                        !set.add(c + "box" + (i / 3) + (j / 3))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
