
import java.util.Scanner;
object Problem2 {
 def main(args: Array[String]) {
  var num1 = 0;
  var num2 = 0;
  var sum = 0;
  var diff = 0;
  var prod = 0;
  var quot = 0;

  var sc = new Scanner(System.in);
  print("Enter value of num1: ");
  num1 = sc.nextInt();
  print("Enter value of num2: ");
  num2 = sc.nextInt();
  sum = num1 + num2;
  diff = num1 - num2;
  prod = num1 * num2;
  quot = num1 / num2;

  println();
  println("Sum is "  + sum);
  println("Difference is "  + diff);
  println("Product is "  + prod);
  println("Quotient is "  + quot);
 }
}


