import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number you want to check: ");
        int inputNumber = scan.nextInt();

        if (isIncreasing(inputNumber) || isDecreasing(inputNumber) || inputNumber < 101) {
            System.out.println(inputNumber + " is not a bouncy number.");
        } else {
            System.out.println(inputNumber + " is a bouncy number.");
        }
    }

    // Check if the number is an increasing number
    private static boolean isIncreasing(int num) {
        String str = String.valueOf(num);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Check if the number is a decreasing number
    private static boolean isDecreasing(int num) {
        String str = String.valueOf(num);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
