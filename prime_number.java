    import java.util.Scanner;
    class prime_number{
        boolean isPrime(int n){
            int i, c=0;
            for(i=1; i<n; i++){
                if(n%i==0)
                    c++;
            }
            if(c==1)
                return true;
            else    
                return false;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            prime_number obj = new prime_number();
            int n;
            System.out.println("Enter number to check :");
            n = sc.nextInt();
            boolean a = obj.isPrime(n);
            if(a){
                System.out.println("Prime Number positive");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }