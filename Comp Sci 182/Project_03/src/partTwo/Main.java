/**
 * @author RoryGlenn
 */
package partTwo;


public class Main {

    public static void main(String[] args) {
        /*
        Design and implement a class called PostfixCalculator. 
        Use the algorithm given on page 374 to evaluate postfix expressions, 
        as entered into the calculator. Use only the operators +, -, *, %, and /. 
        Assume that the postfix expressions have single digit numbers in the expression 
        and are syntactically correct. This means that the expressions will have already 
        been converted into correct postfix form. The PostfixCalculator should not 
        convert from infix to postfix form. In order to test the PostfixCalculator,
        it will be necessary to manually convert your test expressions into postfix
        form before entering them into the PostfixCalculator.
         */

        //  Infix -> Postfix
        //  (a+b) -> ab+
        Stack stack = new Stack();

        String ch = "12+";

        for (int i = 0; i < ch.length(); i++) {
            char toBePushed = ch.charAt(i);
            if (isOperator(toBePushed) == false) {
                stack.push(toBePushed);
            }
            else {
                int operand2 = Character.getNumericValue(stack.pop());
                int operand1 = Character.getNumericValue(stack.pop());

                int result = -1;
                if (toBePushed == '+') {
                    result = operand1 + operand2;
                }
                if (toBePushed == '-') {
                    result = operand1 - operand2;
                }
                if (toBePushed == '*') {
                    result = operand1 * operand2;
                }
                if (toBePushed == '/') {
                    result = operand1 / operand2;
                }
                if (toBePushed == '%') {
                    result = operand1 % operand2;
                }
                else {

                }

                char value = (char) result;
                stack.push(value);
            }

        }

        //System.out.println("result is " + Character.valueOf(stack.pop()));
        System.out.println("result is " + (int) stack.pop());

    }

    private static boolean isOperator(char a) {
        return (a == '+' || a == '-' || a == '%' || a == '*' || a == '/');
    }

}
