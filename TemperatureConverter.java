import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);

        float temperature;
        String from, to;
        float result;

        System.out.println("=====TEMPERATURE CONVERTER=====");

        System.out.print("Enter Temperature: ");
        temperature = scan.nextFloat();

        System.out.print("Enter from Conversion: ");
        from = scan.next().toUpperCase();
        System.out.print("Enter Convertion to: ");
        to = scan.next().toUpperCase();

        switch (from){
            case "C":
                if (to.equals("F")){
                result = (temperature * 9 / 5) + 32;
                System.out.println("Temperature: " + result + "F");
            } else if (to.equals("C")){
                System.out.println("Temperature: " + temperature + "C");
            } else{
                System.out.println("Invalid Conversion!");
            } break;
            case "F": 
                if (to.equals("C")){
                result = (temperature - 32) * 5 / 9;
                System.out.println("Temperature: " + result + "C");
                } else if (to.equals("F")){
                    System.out.println("Temperature: " + temperature + "F");
                } else{
                    System.out.println("Invalid Conversion!");
                }break;
            default:
                System.out.println("Invalid Input!");
        }
        scan.close();
    }
}
