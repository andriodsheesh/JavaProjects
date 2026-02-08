import java.util.Scanner;

public class hoursMins {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter minutes: ");
        int input = scan.nextInt();

        int hours = input / 60;
        int minutes = input % 60;
        
        
        String hourLabel = (hours == 1 ) ?  "hour" : "hours";
        String minutelabel = (minutes == 1 ) ? "minute" : "minutes";

        System.out.println("Time: " + hours + " " + hourLabel + ", " + minutes + " " + minutelabel);

        scan.close();
        
    }
}
