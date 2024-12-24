import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k=1;
        int x[][] = new int[4][4];
        int y[] = new int[4*4];
        //taking input into the 2D array
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                x[i][j] = k;
                k++;
            }
        }
        //printing the original matrix
        System.out.println();
        System.out.println();
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        //first part 4 elements
        for(i=0; i<1; i++){
            for(j=0; j<4; j++){
                y[j] = x[i][j];
            }
        }
        //second part 3 elments
        int v = 3;
        for(i=1; i<4; i++){
            y[i+3] = x[i][v];
        }
        //third part 3 elements
        int a = 7;
        for(i=2; i>=0; i--){
            y[a] = x[v][i];
            a++;
        }
        //fourth part 2 elements
        int b = 10;
        for(i=2; i>0; i--){
            y[b] = x[i][0];
            b++;
        }
        //fifth part 2 elements
        int c = 12;
        for(i=1; i<3; i++){
            y[c] = x[1][i];
            c++;
        }
        //sixth part 2 elements
        int d = 14;
        for(i=2; i>0; i--){
            y[d] = x[2][i];
            d++;
        }
        //printing the spiral SDA
        System.out.println();
        System.out.println();
        for(i=0; i<(4*4); i++){
            System.out.print(y[i] + "\t");
        }
    }
}
