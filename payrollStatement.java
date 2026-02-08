import java.util.Scanner;

public class payrollStatement {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        String name = "";
        float hoursWorked, hourlyPayRate, federalTax, stateTax;

        System.out.print("Enter employee's name: ");
        name = scan.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        hoursWorked = scan.nextFloat();

        System.out.print("Enter hourly pay rate: ");
        hourlyPayRate = scan.nextFloat();

        System.out.print("Enter federal tax withholding rate: ");
        federalTax = scan.nextFloat();

        System.out.print("Enter state tax withholding rate: ");
        stateTax = scan.nextFloat();

        //paking formula
        float grossPay = hoursWorked * hourlyPayRate;
        float federalWithholding = grossPay * federalTax;
        float stateWithholding = grossPay * stateTax;
        float totalDeduction = federalWithholding + stateWithholding;
        float netPay = grossPay - totalDeduction;

        //output 
        System.out.printf("\nEmployee Name: " + name);
        System.out.printf("\nHours Worked: " + "$%.2f" ,hoursWorked);
        System.out.printf("\nPay Rate: " + "$%.2f" ,hourlyPayRate);
        System.out.printf("\nGross Pay: " + "$%.2f" ,grossPay);
        System.out.println("\nDeductions");
        System.out.printf("Federal Withholding: " + "$%.2f" ,federalWithholding);
        System.out.printf("\nState Withholding: " + "$%.2f", stateWithholding);
        System.out.printf("\nTotal deduction: " + "$%.2f" , totalDeduction);
        System.out.printf("\nNet Pay: " + "$%.2f" ,netPay);

        scan.close();
    }
}
