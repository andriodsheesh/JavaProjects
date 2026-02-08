import java.util.Scanner;

public class finalPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int originalPrice, markupPrice, salesTax;

        System.out.print("Enter orignal price: ");
        originalPrice = scan.nextInt();

        System.out.print("Enter price of the marked up price:");
        markupPrice = scan.nextInt();

        System.out.print("Enter sales tax rates: ");
        salesTax = scan.nextInt();

        //formula 
        int sellingPrice = originalPrice + markupPrice;
        float taxRate = (salesTax / 100.0f) * sellingPrice;
        float finalPrice = sellingPrice + taxRate;

        //output
        System.out.println("\nOrignal Price: " + originalPrice);
        System.out.println("Marked-up Percentage: " + markupPrice);
        System.out.println("Selling Price: " + sellingPrice);
        System.out.println("Tax rate: " + salesTax + "%");
        System.out.printf("Final Price: " + finalPrice , ".2f%");

        scan.close();





    }
    
}
