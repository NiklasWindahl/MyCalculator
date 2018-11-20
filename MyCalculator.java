import java.util.Scanner;

public class MyCalculator {

  private double num1;
  private double num2;
  private double answer;
  private String operation;

  Scanner scan = new Scanner(System.in);

    private void add(double num1, double num2){
      answer = num1 + num2;
    }
    private void sub(double num1, double num2){
      answer = num1 - num2;
    }
    private void mult(double num1, double num2){
      answer = num1 * num2;
    }
    private void div(double num1, double num2){
      answer = num1 / num2;
    }
    private void enterDouble(){
      num1 = scan.nextDouble();
    }
    private void enterOperator(){
      operation = scan.next();
    }
    private void enterDoubleAgain(){
      num2 = scan.nextDouble();
    }

    private void printResult(){
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
