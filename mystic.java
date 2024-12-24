import java.util.Scanner;

public class mystic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isMysticNumber(num)) {
            System.out.println(num + " is a Mystic Number.");
        } else {
            System.out.println(num + " is NOT a Mystic Number.");
        }
    }

    public static boolean isMysticNumber(int num) {
        int sum = num;
        
        // Reduce to a single digit
        while (sum > 9) {
            sum = digitSum(sum);
        }
        
        return sum == 1;
    }

    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
