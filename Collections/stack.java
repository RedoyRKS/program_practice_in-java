import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();

        ss.push(1);
        ss.push(2);
        ss.push(5);
        System.out.println(ss);

        System.out.println(" Top element " + ss.peek());
        System.out.println(ss.pop());
    }
}
