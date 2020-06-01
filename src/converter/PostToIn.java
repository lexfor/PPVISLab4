package src.converter;

import java.util.List;
import java.util.Stack;

public class PostToIn {

    public static String convert(List<String> operands){

        Stack<String> stack = new Stack<>();
        for (int i = 0; i <operands.size() ; i++) {
            String operand = operands.get(i);

            if(operand.equals("+") || operand.equals("-") || operand.equals("*") || operand.equals("/") || operand.equals("%")){
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = "("+s2+operand+s1+")";
                stack.push(temp);
            }
            else if(operand.equals("!")) {
                String s1 = stack.pop();
                String temp = "sin("+s1+")";
                stack.push(temp);
            }
            else if(operand.equals("@")) {
                String s1 = stack.pop();
                String temp = "cos("+s1+")";
                stack.push(temp);
            }
            else if(operand.equals("#")) {
                String s1 = stack.pop();
                String temp = "tan("+s1+")";
                stack.push(temp);
            }
            else if(operand.equals("$")) {
                String s1 = stack.pop();
                String temp = "cot("+s1+")";
                stack.push(temp);
            }
            else {
                stack.push(operand);
            }
        }

        String result=stack.pop();
        return result;
    }
}