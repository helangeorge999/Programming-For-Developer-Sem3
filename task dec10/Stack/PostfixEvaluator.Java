import java.util.Stack;

public class PostfixEvaluator {

    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        // Traverse the expression token by token
        for (int i = 0; i < expression.length(); i++) {
            char token = expression.charAt(i);
            
            // If token is a digit, push it onto the stack
            if (Character.isDigit(token)) {
                stack.push(token - '0'); // Convert char to integer
            } else if (token == '+' || token == '-' || token == '*' || token == '/') {
                // If token is an operator, pop two operands and perform the operation
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                int result = 0;
                switch (token) {
                    case '+': result = operand1 + operand2; break;
                    case '-': result = operand1 - operand2; break;
                    case '*': result = operand1 * operand2; break;
                    case '/': result = operand1 / operand2; break;
                }
                stack.push(result); // Push the result back to the stack
            }
        }
        
        // The final result will be at the top of the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "34+5*";  // Example postfix expression
        System.out.println("Result of postfix evaluation: " + evaluatePostfix(expression));
    }
}
