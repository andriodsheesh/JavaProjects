import java.util.Scanner;

public class vendingMachine{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");
        int price = scan.nextInt();

       
        int money = 100;

        int totalchange = money - price;

        int quarters = totalchange / 25;
        totalchange = totalchange % 25;

        int dimes = quarters / 10;
        totalchange = totalchange % 10;

        int nickel = totalchange / 5;
        
        System.out.println("You bought an item for " + price + "cents and gave me a dollar, so your change is: \n"
         + quarters + " quarters," + "\n" 
         + dimes + " dimes, and\n" 
         + nickel + " nickels" );

         scan.close();
    }
}