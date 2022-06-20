/*Given a String containing just the chars (), {}, and [] determine
 * if the input string is valid 
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets
 * 2. Open brackets must be closed in the correct order
 */
import java.util.*;

// ((()[]))

class Solution {
    public boolean isValid(String s) {
        //generate a Stack 
        Stack<Character> stack = new Stack<>();
        //generate a HashMap which maps every closing parentheses with it's oepning parentheses
        HashMap<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put(')', '(');
        parenthesesMap.put( ']', '[');
        parenthesesMap.put('}', '{');
        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            //check if the current char is a closing bracket
            if (parenthesesMap.containsKey(currentChar)){
                //now we gotta ensure the stack is not empty and that the top element is the converse
                if (!(stack.empty()) && stack.peek() == parenthesesMap.get(currentChar)){
                    System.out.println(stack.peek());
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(currentChar); 
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}


