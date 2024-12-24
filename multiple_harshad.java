import java.util.Scanner;
public class multiple_harshad {
    
    public static int sumDigit(int n){
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check :");
        n = sc.nextInt();
        while(n>1){
            int a = sumDigit(n);
            System.out.println(a +"\t"+ n);
            if(n%a!=0){
                break;
            }
            while(n%a==0){
                n = n/a;
                System.out.println(n);
                break;
            }
        }
        if(n==1){
            System.out.println("Multiple Harshad Number");
        }
        else{
            System.out.println("Not a Mlutiple hrshad number");
        }
    }
}
