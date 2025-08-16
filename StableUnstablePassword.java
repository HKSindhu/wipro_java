package logicBuilding;
public class StableUnstablePassword {

    private static boolean isStable(int num) {
        String str = String.valueOf(num);
        int[] freq = new int[10];
        for (char ch : str.toCharArray()) {
            freq[ch - '0']++;
        }
        int expectedFreq = 0;
        for (int f : freq) {
            if (f > 0) {
                expectedFreq = f;
                break;
            }
        }
        for (int f : freq) {
            if (f > 0 && f != expectedFreq) {
                return false;
            }
        }
        return true;
    }

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] numbers = {input1, input2, input3, input4, input5};
        int sumStable = 0;
        for (int num : numbers) {
            if (isStable(num)) {
                sumStable += num;
            }
        }
        return sumStable;
    }

    public static void main(String[] args) {
        int result = findPassword(12, 1313, 122, 678, 898);
        System.out.println("Password = " + result);
    }
}