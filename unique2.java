import java.util.Scanner;
public class unique2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, l, j, flg=0;
        String str;

        //accepting the number from the user
        System.out.println("Enter number to check : ");
        n = sc.nextInt();
        str = Integer.toString(n);
        l = str.length();
        for(i=0; i<l-1; i++){
            for(j=i+1; j<l; j++){
                if(str.charAt(i) == str.charAt(j)){
                    flg=1;
                    break;
                }
            }
        }
        //displaying the message
        if(flg==0){
            System.out.println("The number is Unique Number.");
        }
        else{
            System.out.println("The number is not unique");
        }
    }
}