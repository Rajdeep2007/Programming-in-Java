import java.util.Scanner;
public class markov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        double s1=0, s2=0;
        boolean r1=true, r2=true, r3=true;
        System.out.println("Enter range : ");
        int n = sc.nextInt();
        double x[][] = new double[n][n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.println("Enter value : ");
                x[i][j] = sc.nextDouble();
            }
        }
        if(n<3 || n>9){
            System.out.println("Invalid Range");
            System.exit(0);
        }
        //printing the original matrix
        System.out.println("FROMED MATRIX ::");
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        //checking elements
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(x[i][j]<0){
                    r1 = false;
                }
            }
        }
        //row-wise
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                s1 += x[i][j];
            }
            System.out.print(s1 + "\t");
            if(s1 != 1.0){
                r2 = false;
                break;
            }
            s1=0;
        }
        System.out.println();
            for(j=0; j<n; j++){
                i=0;
                while(i<3){
                    s2 += x[i][j];
                    i++;
                }
                System.out.print(s2 + "\t");
                if(s2 != 1.0){
                    r3 = false;
                    break;
                }
                s2=0;
            }
            
        //printng
        if(r1==true && r2==true && r3==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
