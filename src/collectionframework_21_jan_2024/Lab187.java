package src.collectionframework_21_jan_2024;
import java.util.Stack;

public class Lab187 {
    public static  void main(String[] args) {

        // Stack
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        //stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());//peek not delete any thing
        System.out.println(stack);
        System.out.println(stack.pop());


    }
}
