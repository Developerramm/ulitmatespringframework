import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Ram");
        stack.push("rohig");
        stack.push("sarita");
        stack.push("java");
        stack.push("cpp");
        stack.push("c sharp");

        System.out.println(stack);

        System.out.println(stack.empty());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack);

        System.out.println(stack.search("java"));

        for (String item : stack) {
            System.out.print(item + " ");
        }
    }

}
