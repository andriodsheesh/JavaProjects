import java.util.Scanner;
public class oddEvenChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter number: ");

        if(scan.hasNextInt()){
            Integer checker = scan.nextInt();
            String result = (checker % 2 == 0) ? "Even" : "Odd";
            System.out.println(result);
        }
        else{
            System.out.println("Invalid Input");
        }

    scan.close();
    }
     
}
