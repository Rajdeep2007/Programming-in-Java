import java.util.Scanner;
class vampire{
    public static boolean fact_digitCount(int n, int c){
        //digit counting process starts
        int i, cdf=0;
        for(i=n; i>0; i/=10){
            cdf++;
        }
        if(cdf == (c/2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean reduction(int f, int g, int num, int c){
        //both values cannot end with zero
        //all digits need to form the orignal number without repetition of the digits
        int arrdigit1[] = new int[c];
        int arrmain[] = new int[c];
        int i, a=0, k=0, j, b=0;
        //digit extraction begins here
        while(f>0){
            arrdigit1[a] = f%10;
            a++;
            f/=10;
        }
        while(g>0){
            arrdigit1[a] = g%10;
            a++;
            g/=10;
        }
        while(num>0){
            arrmain[k] = num%10;
            k++;
            num/=10;
        }
        for(i=0; i<c; i++){
            for(j=0; j<c; j++){
                if(arrmain[i] == arrdigit1[j]){
                    b++;
                    break;
                }
            }
        }
        if(b == c){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, c=0, k=0, f=0, j=0, g=0;
        boolean a;
        System.out.println("enter number to chcek : ");
        n = sc.nextInt();
        int fact[] = new int[n];
        int newfact[] = new int[n];
        int comb1[] = new int[n];
        int comb2[] = new int[n];
        //let's count the number of digits
        for(i=n; i>0; i/=10){
            c++;
        }
        if(c%2==0){
            for(i=2; i<n; i++){
                if(n%i==0){
                    fact[k] = i;
                    k++;
                }
            }
        }
        for(i=0; i<k; i++){
            a = fact_digitCount(fact[i], c);
            if(a==true){
                newfact[f] = fact[i];
                f++;
            }
        }
        //printing all the factors
        for(i=0; i<k; i++){
            System.out.print(fact[i] + "\t");
        }
        System.out.println();
        System.out.println();
        //printing all the new factors required as per the question
        for(i=0; i<f; i++){
            System.out.print(newfact[i] + "\t");
        }

        //now lets check random multiplication between the new and final factors
        for(i=0; i<f; i++){
            for(j=0; j<f; j++){
                if((newfact[i]*newfact[j])==n){
                    comb1[g] = newfact[i];
                    comb2[g] = newfact[j];
                    g++;
                }
            }
        }
        System.out.println();
        System.out.println();
        //printing resultant products
        for(i=0; i<g; i++){
            System.out.print(comb1[i] + "\t");
        }
        System.out.println();
        //printing resultant products
        for(i=0; i<g; i++){
            System.out.print(comb2[i] + "\t");
        }
    }
}