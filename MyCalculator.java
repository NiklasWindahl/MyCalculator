import java.util.Scanner;

public class MyCalculator {

  private static double num1 = 0;
  private static double num2 = 0;
  private static double answer = 0;
  private static String operation = "-1";

  Scanner scan = new Scanner(System.in);

    private static void add(double num1, double num2){
      answer = num1 + num2;
    }
    private static void sub(double num1, double num2){
      answer = num1 - num2;
    }
    private static void mult(double num1, double num2){
      answer = num1 * num2;
    }
    private static void div(double num1, double num2){
      answer = num1 / num2;
    }
    private static void enterDouble(){
      num1 = scan.nextDouble();
    }
    private static void enterOperator(){
      operation = op.next();
    }
    private static void enterDoubleAgain(){
      num2 = scan.nextDouble();
    }

    private static void printResult(){
      System.out.println("Your answer is: " + answer);
    }
    private static void printInstructions(){
      System.out.println("Hello, welcome to MasterGitCalculator");
      System.out.println("please choose number, operator, number");

    }


  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    MyCalculator myC = new MyCalculator();

    myC.printInstructions();
    myC.enterDouble();
    myC.enterOperator();
    myC.enterDoubleAgain();
    myC.printResult();



  }
}
