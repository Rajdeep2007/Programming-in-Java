import java.util.Scanner;
public class disarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, c=0, m, s=0;
        System.out.println("Enter number to check :");
        n = sc.nextInt();
        m=n;
        //counting the number of digits
        for(i=n; i>0; i/=10){
            c++;
        }
        //extracting the digits
        while(m>0){
            s = s+ (int)Math.pow(m%10, c);
            m/=10;
            c--;
        }
        System.out.println(s);
        if(s==n)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
    }
}
