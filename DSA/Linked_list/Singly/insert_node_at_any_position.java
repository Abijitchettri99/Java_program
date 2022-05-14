package DSA.Linked_list.Singly;

import java.util.Scanner;

public class insert_node_at_any_position {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void print(){
        ListNode p = head;
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.print("NULL");
    }
    public void inset_at_given_pos(){
        Scanner sc = new Scanner(System.in);
        ListNode newNode = new ListNode(80);
        newNode.next=null;
        ListNode s = head;
        int c =0;
        System.out.println("\nEnter position number to add new node: ");
        int pos =sc.nextInt();
        while (s!=null){
            s=s.next;
            c++;
        }
        if(pos<=c) {

            if (pos == 1) {
                newNode.next = head;
                head = newNode;
            } else {
                ListNode p = head;
                ListNode pre;
                int count = 1;
                while (count < pos - 1) {
                    p = p.next;
                    count++;
                }
                pre = p.next;
                p.next = newNode;
                newNode.next = pre;
            }
        }
        else
            System.out.println("\nEnter valid position....");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        insert_node_at_any_position d1 = new insert_node_at_any_position();
        d1.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third  = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth  = new ListNode(50);
        ListNode sixth  = new ListNode(60);

        d1.head.next = second;
        second.next=third;
        third.next = fourth;
        fourth.next=fifth;
        fifth.next=sixth;

        System.out.println("\nBefore adding new node: ");
        d1.print();
        d1.inset_at_given_pos();
        System.out.println("After adding new node: ");
        d1.print();

    }

}
