import java.util.Scanner;

public class MyCalculator {

  public static void main(String[] args) {

    double num1, num2;
    String operation;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    num1 = input.nextDouble();

    System.out.print("Enter second number: ");
    num2 = input.nextDouble();

    Scanner op = new Scanner(System.in);

    System.out.print("Välj: +  -  *  / ");
    operation = op.next();


    if (operation.equals("+"))
       {
           System.out.println("Your Answer is "+(num1 + num2));
       }
       else if (operation.equals("-"))
       {
           System.out.println("Your Answer is "+(num1 - num2));
       }
       else if (operation.equals("*"))
       {
           System.out.println("Your Answer is "+(num1 * num2));
       }
       else if (operation.equals("/"))
       {
           System.out.println("Your Answer is "+(num1 / num2));
       }


  }
}
