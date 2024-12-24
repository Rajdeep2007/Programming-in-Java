import java.util.Scanner;
public class harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, s=0;
        System.out.println("Enter a number to check :");
        n = sc.nextInt();
        //to check harshad number
        while (n>0) {
            s+= (n%10);
            n/=10;
        }
        //System.out.println(s);
    }
}
