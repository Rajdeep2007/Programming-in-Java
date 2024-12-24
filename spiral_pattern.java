import java.util.Scanner;
public class spiral_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, m, j, k=0, t;
        System.out.println("Enter the no. of rows and coloumns : ");
        m = sc.nextInt();   //for rows  
        n = sc.nextInt();   //for coloumns
        //declaring the array
        int arr[][] = new int[m][n];
        //taking values into the array
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.println("Enter value");
                arr[i][j] = sc.nextInt();
            }
        }
        //declaring a SDA for storing all the elements of the matrix
        int x[] = new int[m*n];
        //printing the original array
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(arr[i][j] + "\t");
                x[k] = arr[i][j];
                k++;
            }
            System.out.println();
        }
        //for 3x3 matrix - spiral matrix formation
        if(m==3 && n==3){
            //swapping the values for the first part of the SDA
            for(i=((m*n)/2)-1; i>0; i--){
                t = x[i];
                x[i] = x[i-1];
                x[i-1] = t;
            }
            //swapping the values for the second part of the SDA
            for(j=((m*n)/2)+1; j<(m*n)-1; j++){
                t = x[j];
                x[j] = x[j+1];
                x[j+1] = t;
            }
            //swapping the exact preceding and succeding element of the mid location
            t = x[((m*n)/2)-1];
            x[((m*n)/2)-1] = x[((m*n)/2)+1];
            x[((m*n)/2)+1] = t;
            //printing the new SDA
            for(i=0; i<(m*n); i++){
                System.out.print(x[i] + "\t");
            }
            //punching values into DDA
            k = 0;
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    arr[i][j] = x[k];
                    k++;
                }
            }
            //printing the new DDA
            System.out.println();
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
        //for 4x4 matrix
        if(m==4 && n==4){
            //swapping values for the first part of the SDA
            for(i=((m*n)/4); i>0; i--){
                t = x[i];
                x[i] = x[i-1];
                x[i-1] = t;
            }
            //swapping the values for the last part of the SDA
            for(j=((m*n)/1)-4; j<(m*n)-1; j++){
                t = x[j];
                x[j] = x[j+1];
                x[j+1] = t;
            }
            //printing the new SDA
            for(i=0; i<(m*n); i++){
                System.out.print(x[i]+ "\t");
            }
        }
    }
}
