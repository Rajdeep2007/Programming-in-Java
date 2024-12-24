import java.util.Scanner;
class perfect{
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int i, n, s=0;
        System.out.println("Enter number to check : ");
        n = c.nextInt();
        for(i=1; i<n; i++){
            if(n%i==0){
                s = s+i;
            }
        }
        if (s==n)
            System.out.println("Perfect number");
        else
            System.out.println("Not Perfect number");
    }
}
