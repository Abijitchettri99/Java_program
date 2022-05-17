package DSA.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;

public class stack_array{
    int[]arr;
    int top;

    public stack_array(int size){
        this.arr = new int[size];
        this.top=-1;
        System.out.println("Stack is created of size :"+ size);
    }
    public void push(int data){
        if(isFull())
            System.out.println("Stack already full");
        else{
            arr[top+1]=data;
            top++;
        }
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack already empty nothing to pop!");
            throw new EmptyStackException();
        }else{
            int res = arr[top];
            top--;
            return res;
        }
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return arr[top];
    }
    public void minimum(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        int n =sc.nextInt();
        stack_array s = new stack_array(n);
        System.out.println("Enter "+ n+" element of stack: ");
        for(int i=0;i<n;i++) {
            s.push(sc.nextInt());
            s.minimum();
        }
        System.out.println("Element popped out: "+s.pop());
        System.out.println("Top of stack: "+s.peek());
        System.out.println("is stack full: "+s.isFull());
        System.out.println("Is stack empty: "+s.isEmpty());
    }
}