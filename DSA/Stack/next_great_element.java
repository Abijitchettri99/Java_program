package DSA.Stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class next_great_element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        while(T-->0){
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            print(arr,n);
        }
    }
    private static void print(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] arr1 = new int[n];
        for(int i=n-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                arr1[i]=-1;
            else
                arr1[i]=st.peek();
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
