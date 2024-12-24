import java.util.Scanner;
public class magicsq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k=1;
        //System.out.println();
        int x[][] = new int[4][4];
        int y[][] = new int[4][4];
        //accepting values into the array
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                x[i][j] = k;
                k++;
            }
        }
        System.out.println();
        System.out.println();
        //printing the original matrix
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        //left and right daigonal transformation
        int v=3;
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                if(i==j){
                    y[v][v] = x[i][j];
                }
                else if((i+j)==3){
                    y[j][i] = x[i][j];
                }
                else{
                    y[i][j] = x[i][j];
                }
            }
            v--;
        }
        System.out.println();
        System.out.println();
        //printing the magic matrix
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
