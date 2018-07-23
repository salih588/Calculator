import java.util.Scanner;

class Calculator{
  public static void main(String[] args){
    int sum;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first number for calculation");
    int a = s.nextInt();
    System.out.println("enter operator for calculation");
    char c = s.next().charAt(0);
    System.out.println("Enter second number for calculation");
    int b = s.nextInt();
    switch(c){
       case '+' :
          sum = a+b; 
          System.out.println("Addition = "+sum);
          break;
       case '-' :
          sum = a-b;
          System.out.println("Substraction = "+sum);
          break;
       case '*' :
          sum = a*b;
          System.out.println("Multiplication = "+sum);
          break;
       case '/' :
          if( !(b==0) ){
           sum = a/b;
           System.out.println("Division = "+sum);
           break;
          }else{
           System.out.println("You cannot devided by zero");
          }
       default :
          System.out.println("You entered invalid operator");
    }
  }
}