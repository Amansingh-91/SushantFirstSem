import java.util.Stack;

public class InfixToPostfix {
    // Function to check if the character is an operand
	static boolean isalpha(char c)
	{
		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}

	// Function to check if the character is digit
	static boolean isdigit(char c)
	{
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}

	// Function to check if the character is an operator
	static boolean isOperator(char c)
	{
		return (!isalpha(c) && !isdigit(c));
	}

	// Function to get priority of operators
	static int getPriority(char C)
	{
		if (C == '-' || C == '+')
			return 1;
		else if (C == '*' || C == '/')
			return 2;
		else if (C == '^')
			return 3;

		return 0;
	}
    // Function to remove spaces from the Expression/equation
    public static String removeSpaces(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
    // Function to convert infix to postfix expression
	static String infixToPostfix(String infix1)
	{
        infix1 = removeSpaces(infix1);
		String infix = '(' + String.valueOf(infix1) + ')';

		int l = infix.length();
		Stack<Character> char_stack = new Stack<>();
		String output = "";

		for (int i = 0; i < l; i++) {

			// If the scanned character is an
			// operand, add it to output.
			if (isalpha(infix.charAt(i))
				|| isdigit(infix.charAt(i))){
                    output += infix.charAt(i);
                }
				

			// If the scanned character is an
			// ‘(‘, push it to the stack.
			else if (infix.charAt(i) == '('){
                char_stack.add('(');
            }

			// If the scanned character is an
			// ‘)’, pop and output from the stack
			// until an ‘(‘ is encountered.
			else if (infix.charAt(i) == ')') {
				while (char_stack.peek() != '(') {
					output += char_stack.peek();
					char_stack.pop();
				}

				// Remove '(' from the stack
				char_stack.pop();
			}

			// Operator found
			else {
				if (isOperator(char_stack.peek())) {
					while (
						(getPriority(infix.charAt(i))
						< getPriority(char_stack.peek()))
						|| (getPriority(infix.charAt(i))
								<= getPriority(
									char_stack.peek())
							&& infix.charAt(i) == '^')) {
						output += char_stack.peek();
						char_stack.pop();
					}

					// Push current Operator on stack
					char_stack.add(infix.charAt(i));
				}
			}
		}
		while (!char_stack.empty()) {
			output += char_stack.pop();
		}
		return output;
	}
    public static void main(String[] args) {
        String infix = "(a + b) * ( c + d )";
        System.out.println(infixToPostfix(infix));
    }

}
