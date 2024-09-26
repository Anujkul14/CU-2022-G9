package lec49;
import java.util.Stack;

public class BalancedParenthsis {
    public static void main(String[] args) {
        System.out.println(balancedString("(){}"));       // -1
        System.out.println(balancedString("(}"));         // 1
        System.out.println(balancedString("({})"));       // -1
        System.out.println(balancedString("({}){"));      // 5
        System.out.println(balancedString("({}){(})"));   // 6
    }
    static int balancedString(String code) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);

            if (current == '(' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == '}') {
                if (stack.isEmpty()) {
                    return i;
                }

                char lastOpened = stack.pop();
                if ((current == ')' && lastOpened != '(') ||
                        (current == '}' && lastOpened != '{')) {
                    return i;
                }
            }
        }

        if (!stack.isEmpty()) {
            return code.length();
        }

        return -1;
    }
}

