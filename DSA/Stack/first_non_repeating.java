package DSA.Stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class first_non_repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        while(T-->0){
            String str = sc.next();
            print_non_repeating(str);
        }
    }

    private static void print_non_repeating(String str) {
        Stack<Character> st = new Stack<>();
        int[] arr = new int[1];
        for(int i=0;i<str.length()-1;i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        int[] arr1 = new int[1];
        for(int i=0;i<arr.length;i++){
            if(!st.isEmpty() && st.peek()==(char)(arr[i])){
                st.pop();
            }
            if(st.isEmpty())
                arr1[i]=((char)(arr[i]));

            st.push((char)arr[i]);
        }
    }
}
