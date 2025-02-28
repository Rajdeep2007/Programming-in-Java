import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is NOT an Automorphic Number.");
        }
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        
        // Check if the square ends with the original number
        return squareStr.endsWith(numStr);
    }
}
