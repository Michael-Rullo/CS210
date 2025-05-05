public class InfixConverter {

    StackADT stack;

    public InfixConverter(StackADT operatorStack) {
        this.stack = operatorStack;
    }

    public int operator(String op) {
        return switch (op) {
            case "+" -> 1;
            case "-" -> 1;
            case "*" -> 2;
            case "/" -> 2;
            default -> 0;
        };
    }

    public String toPostfix(String statement) {
        String postfix = "";
        String[] chars = statement.split(" ");
        Boolean space = false;

        for (int i = 0; i < chars.length; i++) {
            String character = chars[i];

            if (Character.isDigit(character.charAt(0))) {
                if (space) {
                    postfix += " ";
                }
                postfix += character;
                space = true;
            } else if (character.equals("(")) {
                stack.push(character);
            } else if (character.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    if (space) {
                        postfix += " ";
                    }
                    postfix += stack.pop();
                    space = true;
                }
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && !stack.peek().equals("(") && operator(character) <= operator(stack.peek())) {
                    if (space) {
                        postfix += " ";
                    }
                    postfix += stack.pop();
                    space = true;
                }
                stack.push(character);
            }

        }

        while (!stack.isEmpty()) {
            if (space) {
                postfix += " ";
            }
            postfix += stack.pop();
            space = true;
        }

        return postfix;
    }
}
