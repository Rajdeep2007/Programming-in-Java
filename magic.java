import java.util.Scanner;
public class magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, m, s, d;
        System.out.println("Enter number to check : ");
        n = sc.nextInt();
        m=n;
        d=n;
        //digit extraction recursively
        while(d>9){
            s=0;
            while(m>0){
                s = s+ (m%10);
                m/=10;
            }
            d=s;
            m=d;
            s=0;
        }
        if(d==1)
            System.out.println("It is magic number");
        else
            System.out.println("It is not magic number");
    }
}
