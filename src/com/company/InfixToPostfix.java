package com.company;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static class Test {

        static int Prec(char ch) {
            return switch (ch) {
                case '+', '-' -> 1;
                case '*', '/' -> 2;
                case '^' -> 3;
                default -> -1;
            };
        }

        private static String infixToPostfix(String exp) {
            String result = new String("");

            // initializing empty stack
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < exp.length(); ++i) {
                char c = exp.charAt(i);
                if (Character.isLetterOrDigit(c))
                    result += c;

                else if (c == '(')
                    stack.push(c);
                else if (c == ')') {
                    while (!stack.isEmpty() &&
                            stack.peek() != '(')
                        result += stack.pop();

                    stack.pop();
                } else // an operator is encountered
                {
                    while (!stack.isEmpty() && Prec(c)
                            <= Prec(stack.peek())) {

                        result += stack.pop();
                    }
                    stack.push(c);
                }

            }
            while (!stack.isEmpty()) {
                if (stack.peek() == '(')
                    return "Invalid Expression";
                result += stack.pop();
            }
            return result;

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String exp = sc.next();
            System.out.println(infixToPostfix(exp));

        }

    }
}