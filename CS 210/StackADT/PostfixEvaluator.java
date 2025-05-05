public class PostfixEvaluator {
    
    private StackADT stack;

    public PostfixEvaluator(StackADT valuestack) {
        this.stack = valuestack;
    }

    public int evaluate(String postfix) {
        String[] chars = postfix.split(" ");

        for (int i = 0; i < chars.length; i++) {
            String character = chars[i];

            if (Character.isDigit(character.charAt(0))) {
                stack.push(character);
            } else {
                int operand2 = Integer.parseInt(stack.pop());
                int operand1 = Integer.parseInt(stack.pop());

                int result = 0;
                if (character.equals("+")) {
                    result = operand1 + operand2;
                } else if (character.equals("-")) {
                    result = operand1 - operand2;
                } else if (character.equals("*")) {
                    result = operand1 * operand2;
                } else if (character.equals("/")) {
                    result = operand1 / operand2;
                }

                stack.push(String.valueOf(result));
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
