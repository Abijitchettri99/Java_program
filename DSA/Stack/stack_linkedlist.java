package DSA.Stack;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class stack_linkedlist {
    private ListNode top;
    private int length;
    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data= data;
            this.next=null;
        }
    }
    public void push(int data){
        if(isFull())
            throw new ArrayIndexOutOfBoundsException();
        else {
            ListNode temp = new ListNode(data);
            temp.next = top;
            top = temp;
            length++;
        }
    }
    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        else{
            int res = top.data;
            top=top.next;
            length--;
            return res;
        }
    }
    public boolean isEmpty(){
        return length==0;
    }
    public boolean isFull(){
        return length==5;
    }
    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        else
            return top.data;
    }
    public void minimum(){
       if(top.data<top.next.data){
           push(top.data);
           System.out.println(top.data);
       }
       else{
           push(top.next.data);
           System.out.println(top.next.data);
       }
    }
    public void print(){
        ListNode p = top;
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack_linkedlist s = new stack_linkedlist();
        System.out.println("Enter the size of stack: ");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++)
            s.push(sc.nextInt());
        System.out.println("\nElement present in stack(LIFO) are: ");
        s.print();
        System.out.println("Element popped out is: "+s.pop());
        System.out.println("Element present at top of stack is: "+s.peek());
        System.out.println("Is Stack empty: "+s.isEmpty());
        System.out.println("Is Stack Full: "+s.isFull());
        //s.minimum();
    }

}
