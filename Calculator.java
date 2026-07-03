package myfirstproject;
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("======== SIMPLE CALCULATOR ========");

        System.out.println("Enter your 1st number:- ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter your 1st number:- ");
        double num2 = sc.nextDouble();

        System.out.println("\n Enter your operation:- ");
        System.out.println("1. Addition (+)");  
        System.out.println("2. Subtraction (-)");
        System.out.println("3. multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("4. Modulus (%)");

         System.out.println("Enter your choice (1-5):- ");
         int choice = sc.nextInt();

         double result;

         switch(choice){
         case 1:
             result = num1 + num2;
             System.out.println(num1 + " + " + num2 + " = " + result);
             break;

         case 2:
             result = num1 - num2;
               System.out.println(num1 + " - " + num2 + " = " + result);
             break;
        
        case 3:
             result = num1 * num2;
               System.out.println(num1 + " * " + num2 + " = " + result);
             break;

         case 4:
            if (num2 != 0){
             result = num1 / num2;
               System.out.println(num1 + " / " + num2 + " = " + result);
            }else {
               System.out.println("Error: Division by zero is not allowed");
            }
             break;

        case 5:
              if (num2 != 0){
             result = num1 % num2;
               System.out.println(num1 + " % " + num2 + " = " + result);
            }else {
               System.out.println("Error: Modulus by zero is not allowed");
            }
             break;
        default:
               System.out.println("invalid choice !!!!! ");
         }
  
    }
}
