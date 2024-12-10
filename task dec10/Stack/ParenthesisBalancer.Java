import java.util.Stack;

public class ParenthesisBalancer {

    // Function to check if the parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            // If it's an opening parenthesis, push it onto the stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            // If it's a closing parenthesis, check for a match
            else if (current == ')' || current == '}' || current == ']') {
                // If stack is empty or the top of the stack doesn't match the current closing parenthesis, return false
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((current == ')' && top != '(') || 
                    (current == '}' && top != '{') || 
                    (current == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, the parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "(a + b) * {c + [d - e]}";
        String expression2 = "(a + b) * {c + [d - e]";
        
        System.out.println("Expression 1 is balanced: " + isBalanced(expression1));
        System.out.println("Expression 2 is balanced: " + isBalanced(expression2));
    }
}
