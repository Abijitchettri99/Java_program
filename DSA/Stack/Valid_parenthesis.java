package DSA.Stack;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Valid_parenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='{'||ch=='('||ch=='[')
                st.push(ch);
            else {
                if (st.isEmpty())
                    return false;
                else{
                    if(ch=='}'&& st.peek()=='{' ||ch==')'&& st.peek()=='(' ||ch==']'&& st.peek()=='[')
                        st.pop();
                    else
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
}
