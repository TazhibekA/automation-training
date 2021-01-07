import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 8765;

        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stackRes = new Stack<Integer>();
        while (number > 0) {
            stack.push( number % 10 );
            number = number / 10;
        }
        while (!stack.isEmpty()) {
            stackRes.push(stack.pop());
        }
        while (!stackRes.isEmpty()) {
            System.out.println(stackRes.pop());
        }

    }
}
