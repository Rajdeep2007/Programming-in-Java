import java.util.Scanner;
public class circular_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, c=0, m, d, r, q, s, k=0, p=0, f=0;
        System.out.println("Enter number to check : ");
        n = sc.nextInt();
        m = n;
        //counting the number of digits
        for(i=m; i>0; i/=10, c++);
        d = c;
        int arr[] = new int[c];
        s = n;
        while(d>0){
            r = s%10;
            q = s/10;
            s = r*(int)Math.pow(10,c-1) + q;
            System.out.println(s + "\t");
            arr[k] = s;
            k++;
            d--;
        }
        //printing all the numbers
        for(i=0; i<c; i++){
             System.out.print(arr[i] + "\t");
        }
        //checking whether they are prime or not
        for(i=0; i<c; i++){
            for(j=2; j<arr[i]; j++){
                if(arr[i]%j==0){
                    p++;
                }
            }
            if(p==0){
                continue;
            }
            else{
                f=1;
                break;
            }
        }
        //finally announcing the result
        if(f==1){
            System.out.println("Not a Circular prime");
        }
        else{
            System.out.println("Circular prime");
        }
    }
}
