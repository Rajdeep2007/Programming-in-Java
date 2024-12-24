import java.util.Scanner;

public class ShortBinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to convert to binary: ");
        double number = scanner.nextDouble();

        String binaryString = Integer.toBinaryString((int) number) + ".";

        double fractionalPart = number - (int) number;
        int precision = 10; // Adjust for desired precision
        for (int i = 0; i < precision && fractionalPart != 0.0; i++) {
            fractionalPart *= 2;
            binaryString += (fractionalPart >= 1) ? "1" : "0";
            fractionalPart -= Math.floor(fractionalPart); // More efficient truncation
        }

        System.out.println("Binary equivalent: " + binaryString);

        scanner.close();
    }
}
