package homework_week_6;

import java.util.Scanner;

public class Programme_13_AverageOfNumber {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number : ");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number : ");
        double z = scanner.nextDouble();
        avarageOfThreeNumbers(x , y ,z);
        //closing the scanner object
        scanner.close();
    }
    //Calculation the average of three numbers
    public static void  avarageOfThreeNumbers(double a , double b , double c){
        double average = ( a + b + c) / 3 ;
        System.out.println("The average of " + a +  " , " + b + " and " + c + " is :" + average);
    }

}
