import java.util.Scanner;
public class arr_rotate_270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter row size");
        int n = sc.nextInt();
        System.out.println("Enter coloumn size:");
        int m = sc.nextInt();
        if(n>2 && n<10 && m>2 && m<10){
            int x[][] = new int[n][m];
            int y[][] = new int[m][n];
            //accepting values into x[][]
            for(i=0; i<n; i++){
                for(j=0; j<m; j++){
                    System.out.println("Enter values  :");
                    x[i][j] = sc.nextInt();
                }
            }
            //priting the orginal
            int sum=0;
            for(i=0; i<n; i++){
                for(j=0; j<m; j++){
                    if(x[i][j]%2 != 0){
                        sum = sum + x[i][j];
                    }
                    System.out.print(x[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Sum of the odd elements : " + sum);
            System.out.println();
            //priting the rotated
            int c=n-1;
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    y[i][j] = x[c][i];
                    c--;
                    System.out.print(y[i][j] + "\t");
                }
                c=2;
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
