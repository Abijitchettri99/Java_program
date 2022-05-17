package DSA.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;

public class reverse_string {
    char[] arr;
    int topOfStack;

    public reverse_string(int size){
        this.arr = new char[size];
        this.topOfStack=-1;
        System.out.println("Stack is created of size :"+ size);
    }
    public boolean isFull(){
        return topOfStack == arr.length-1;
    }
    public boolean isEmpty(){
        return topOfStack==-1;
    }
    public void push(char data){
        if(isFull())
            System.out.println("Stack is already full");
        else{
            arr[topOfStack+1]=data;
            topOfStack++;
        }
    }
    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        else{
            int res = arr[topOfStack];
            topOfStack--;
            return res;
        }
    }
    public void print(){
        System.out.println("Element present in stack: \n"+ (String) Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the length of string.");
        //int n =sc.nextInt();
        String s = sc.nextLine();
        reverse_string r = new reverse_string(s.length());
        for(int i=0;i<s.length();i++)
            r.push(s.charAt(i));
        r.print();
        System.out.println(r.isFull());
        for(int i=0;i<s.length();i++)
            System.out.print((char)r.pop()+" ");
        //System.out.println(r.reverse_str(s));
    }

}
