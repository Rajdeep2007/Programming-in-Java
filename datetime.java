import java.util.Scanner;
public class datetime {
    public static boolean leap(int y){
        boolean r = true;
        if(y%400 == 0){
            r = true;
        }
        else{
            r = false;
        }
        return r;
    }
    public static String dayMonth(int y, int d)
    {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String month[] = {"Jan", "feb", "march", "april", "may", "june", "july", "august", "september", "october",
                        "november", "december"};
        boolean a = leap(y);
        if(a==true){
            days[1] = 29;
        }
        int i, daysum =0;
        for(i=0; i<days.length; i++){
            daysum += days[i];
            if(daysum >= d){
                break;
            }
        }
        int day = d + days[i] - daysum;
        //convert to string
        String st = day + " " + month[i] + ", " + y;
        return(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1="", str2="";
        System.out.println("Enter year :");
        int y = sc.nextInt();
        System.out.println("Enter the day :");
        int d = sc.nextInt();
        System.out.println("Enter Future Additional day number :");
        int n = sc.nextInt();
        if(leap(y)==false){
            if(d>0 && d<366){
                str1 = dayMonth(y, d);
            }
            if(n>0 && n<=100){
                int a = d+n;
                if(a>365){
                    str2 = dayMonth(y+1, (a-365));
                }
                else{
                    str2 = dayMonth(y, a);
                }
            }
        }
        else{
            if(d>0 && d<=366){
                str1 = dayMonth(y, d);
            }
            if(n>0 && n<=100){
                int a = d+n;
                if(a>366){
                    str2 = dayMonth(y+1, (a-366));
                }
                else{
                    str2 = dayMonth(y, a);
                }
            }
        }
        //displaying the output
        System.out.println("First Date : " + str1);
        System.out.println("Fture Date : " + str2);
    }
}
