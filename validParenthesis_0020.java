/**
 * @ClassName validParenthesis_0020
 * @Description TODO
 * @Author ZH
 * @Date 2020-06-19 22:49
 * @Version 1.0
 **/

import java.util.Stack;

/**
 * 有效的括号
 * @author
 * @create 2020-06-19 22:49
 * @version 1.0
 **/
public class validParenthesis_0020 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("{}()[]"));

    }
    public static class Solution {
        public boolean isValid(String s) {
           // System.out.println(s.length());
            if((s.length()%2) == 1){
                return false;
            }

            //无法通过{}()[]，只适用对称的，╮(╯▽╰)╭
            /*boolean o=true;
            String one = s.substring(0,s.length()/2);
            String two = s.substring(s.length()/2,s.length());

            two = new StringBuffer(two).reverse().toString();

            for (int i = 0; i < one.length(); i++) {
                if(one.charAt(i) =='{' && two.charAt(i) !='}' ){
                    return o=false;
                }
                if(one.charAt(i) =='[' && two.charAt(i) !=']' ){
                    return o=false;
                }
                if(one.charAt(i) =='(' && two.charAt(i) !=')' ){
                    return o=false;
                }
            }*/
            //正解
            Stack<Character> stack = new  Stack<>();
            for (Character character : s.toCharArray()) {

                if(character == '{' || character == '[' || character == '(' ){
                    stack.push(character);
            }
                if(character == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return  false;
                    }
                }
                if(character == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return  false;
                    }
                }
                if(character == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return  false;
                    }
                }
            }
            return  stack.isEmpty();
            //return  o;
        }
    }
}
