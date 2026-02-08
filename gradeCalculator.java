import java.util.Scanner;

public class gradeCalculator{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=====GRADE CALCULATOR=====");

        int grade;

        System.out.print("Enter Score: ");
        grade = scan.nextInt();

        switch (grade / 10){
            case 10:
            case 9:
                System.out.println("A"); break;
            case 8: 
                System.out.println("B"); break;
            case 7: 
                System.out.println("C"); break;
            case 6:
                System.out.println("D"); break;
            default: 
                System.out.println("F");
            if(grade <0 || grade >100){
                System.out.println("Please Enter a valid grade!");
            }
        }
        scan.close();
    }
}