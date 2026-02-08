import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int smallPrice = 0, largePrice = 0;
        double total = 0;

        System.out.println("STARBUCKS MENU:");
        System.out.println("  MENU                  Small   Large ");
        System.out.println("Hot Brewed Coffee       75      95");
        System.out.println("Cold Brew               65      90");
        System.out.println("Caffe Americano         160     180");
        System.out.println("Caffe Mocha             150     185");
        System.out.println("Caramel Macchiato       162     190");
        System.out.println("\n");

        // User input
        System.out.print("Enter Order: ");
        String order = scan.nextLine().toLowerCase();

        System.out.print("Enter Size (S/L): ");
        char size = scan.next().toUpperCase().charAt(0);

        System.out.print("Enter Quantity (Max 3): ");
        int quant = scan.nextInt();

        switch (order) {
            case "hot brewed coffee":
                smallPrice = 75;
                largePrice = 95;
                break;

            case "cold brew":
                smallPrice = 65;
                largePrice = 90;
                break;

            case "caffe americano":
                smallPrice = 160;
                largePrice = 180;
                break;

            case "caffe mocha":
                smallPrice = 150;
                largePrice = 185;
                break;

            case "caramel macchiato":
                smallPrice = 162;
                largePrice = 190;
                break;

            default:
                System.out.println("INVALID ORDER");
                scan.close();
                return; 
                
        }

        if (size == 'S' || size == 's') {
            total = smallPrice * quant;
        } else if (size == 'L' || size == 'l') {
            total = largePrice * quant;
        } else {
            System.out.println("INVALID SIZE");
            scan.close();
            return;
        }
        System.out.println("Total Price: " + total);
            
        scan.close();
    }
}
