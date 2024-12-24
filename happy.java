import java.util.Scanner;
public class happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, s, d;
        System.out.println("Enter number to check : ");
        n = sc.nextInt();
        while(n>0){
            
        }
        d=m;
        while(d>9){
            s=0;
            while(m>0){
                s = s+ (m%10);
                m/=10;
            }
            d=s; 
            m=d;
        }
        if(d==1)
            System.out.println("happy number");
        else
            System.out.println("not happy number");
    }
}
