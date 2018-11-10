package linkedList;
import java.util.Stack;

/*
- The assumption is an arithmetic expression without the parenthesis omitted
 */
public class Evaluate {
  private static String arithmeticStr = "(1+((2+3)*(4*5)))";

  public static void main(String[] args){
    Stack<String> operators = new Stack<>();
    Stack<Double> numbers = new Stack<>();

    for (int i=0; i<arithmeticStr.length(); i++){
      String s = String.valueOf(arithmeticStr.charAt(i));
      switch (s) {
        case "(":
          break;
        case "+":
        case "-":
        case "*":
        case "/":
        case "sqrt":
          operators.push(s);
          break;
        case ")":
          doCalculate(operators, numbers);
          break;
        default:
          numbers.push(Double.parseDouble(s));
          break;
      }
    }
    System.out.println(numbers.pop());
  }

  private static void doCalculate(Stack<String> operators, Stack<Double> numbers) {
    String op = operators.pop();
    double v =numbers.pop();
    switch (op) {
      case "+":
        v = numbers.pop() + v;
        break;
      case "-":
        v = numbers.pop() - v;
        break;
      case "*":
        v = numbers.pop() * v;
        break;
      case "/":
        v = numbers.pop() / v;
        break;
      case "sqrt":
        v = Math.sqrt(v);
        break;
    }
    numbers.push(v);
  }

}
