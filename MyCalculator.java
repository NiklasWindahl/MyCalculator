import java.util.Scanner;

public class MyCalculator {

  private double num1;
  private double num2;
  private double answer;

  private String operation = "-1";

  Scanner op = new Scanner (System.in);

  Scanner scan = new Scanner(System.in);

      private  void printInstructions(){


      System.out.println("Hello, welcome to MasterGitCalculator");
      System.out.println("please choose number, operator, number");




          num1 = scan.nextDouble();

          operation = op.next();

          num2 = scan.nextDouble();

      if (operation == "+");
      {
          System.out.println("ditt svar ar" + (num1 + num2));
      }
      if  (operation == "-");
      {
          System.out.println("ditt svar ar" + (num1 - num2));
      }


      if(operation == "/");
      {
          System.out.println("ditt svar ar" + (num1 / num2));
      }
      if (operation == "*")
      {
          System.out.println("ditt svar ar" + (num1 * num2));
      }



 }


  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    MyCalculator myC = new MyCalculator();

    myC.printInstructions();




  }
}
