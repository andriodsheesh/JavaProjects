import java.util.Scanner;

public class calculator{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=====CALCULATOR=====");

        System.out.print("Enter 1st Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = scan.nextInt();
        System.out.print("Select Operation (+,-,*,/): ");
        char operation = scan.next().charAt(0);

        switch (operation){
            case '+': System.out.println("Result: " + (num1 + num2)); break;
            case '-': System.out.println("Result: " + (num1 - num2)); break;
            case '*': System.out.println("Result: " + (num1 * num2)); break;
            case '/': 
                    if (num2 != 0){
                        System.out.println("Result: " + ((double)num1 / num2));
                    }else{
                        System.out.println("Error! Cannot Divide by Zero");
                    } break;
            default: System.out.println("Invalid Operation");
        }
        scan.close();
    }
}