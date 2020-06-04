import java.util.*;
class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
             if (input.length() % 2 != 0 ){
                System.out.println("false");
             } else {
               if(checkParentheses(input)){
                    System.out.println("true");
               } else {
                   System.out.println("false");
               }
             } 
        }
        
    }
    public static boolean checkParentheses(String s) {
                Stack<Character> stack = new Stack<Character>();
                for (int i = 0; i < s.length(); i++){
                    if (s.charAt(i) == '(') 
                        stack.push('(');
                    else if (s.charAt(i) == '{')
                        stack.push('{');
                    else if (s.charAt(i) == '[')
                        stack.push('[');
                    else if (s.charAt(i) == ')') {
                        if (stack.isEmpty()) 
                            return false;
                        if (stack.pop() != '(') 
                            return false;
                    }
                    else if (s.charAt(i) == '}') {
                        if (stack.isEmpty()) 
                            return false;
                        if (stack.pop() != '{') 
                            return false;
                    }
                    else if (s.charAt(i) == ']') {
                        if (stack.isEmpty()) 
                            return false;
                        if (stack.pop() != '[') 
                            return false;
                    }
                }
       return stack.isEmpty();
   }

}



