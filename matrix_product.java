import java.util.Scanner;
public class matrix_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int m = 2;
        int n = 2;
        int a = 2;
        int b = 2;

        int x[][] = new int[m][n];
        int y[][] = new int[a][b];
        int z[][] = new int[m][b];
        //accepting values into the array
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.println("Enter values for 1st array : ");
                x[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<a; i++){
            for(j=0; j<b; j++){
                System.out.println("Enter values for 2nd array : ");
                y[i][j] = sc.nextInt();
            }
        }
        //matrix multiplication
        for(i=0; i<m; i++){
            for(j=0; j<b; j++){
                z[i][j] = 0;
                for(k=0; k<2; k++){
                     z[i][j] += x[i][k] * y[k][j];  
                }
            }
        }
        //printing the result
        System.out.println();
        System.out.println();
        for(i=0; i<m; i++){
            for(j=0; j<b; j++){
                 System.out.print(z[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
