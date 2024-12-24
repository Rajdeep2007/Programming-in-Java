import java.util.Scanner;
class Hamming{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, p=2, n;
        boolean result = true;  //assuming the result to be true
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        if(num < 0){
            System.out.println("NEGATIVE NUMBER ENTERED. INVALID INPUT");
        }
        n = num;
        System.out.print(num + " = ");
        while(n > 1){
            while(n % p == 0){
                System.out.print(p);
                n /= p;
                if(n > 1)
                    System.out.print(" x ");
                switch(p){
                case 2:
                    break;
                case 3:
                    break;
                case 5:
                    break;
                default:
                    result = false;
                }
            }
            p++;
        }
        if(result == true)
            System.out.println("\n" + num + " IS A HAMMING NUMBER");
        else
            System.out.println("\n" + num + " IS NOT A HAMMING NUMBER");
    }
}