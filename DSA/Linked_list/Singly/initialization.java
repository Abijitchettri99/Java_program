package DSA.Linked_list.Singly;

import java.util.Scanner;

public class initialization {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        public int size;

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
        System.out.print("null");
    }
    public void insert_at_first(){
        ListNode first = new ListNode(-10);
        first.next=head;
        head = first;
    }
    public void insert_at_last(){

        ListNode last = new ListNode(50);
        if(head==null) {
            head = last;
        }
        ListNode p = head;
        while(p.next!=null){
            p=p.next;
        }
        p.next = last;
    }

    public void insert_at_any_given_pos(int pos){
        ListNode node =new ListNode(35);
        if(pos==1){
            node.next=head;
            head=node;
        }
        else {
            ListNode p = head;
            ListNode pre;
            int count =1;
            while(count<pos-1){
                p=p.next;
                count++;
            }
            pre=p.next;
            p.next = node;
            node.next=pre;
        }
    }

    public void del_first_node(){
        //ListNode p = head;
        if(head == null)
            System.out.println("Linked list already empty");
        ListNode p = head;
        head = head.next;
        p=null;
    }
    public void del_last_node(){
        if(head==null)
            System.out.println("Linked list already empty");
        ListNode p = head;
        ListNode pre = null;
       while(p.next!=null){
           pre=p;
           p=p.next;
       }
        pre.next=null;
    }
    public void del_at_any_pos(int pos){
        if(head == null)
            System.out.println("Linked list already null");
        else if(pos==1)
            head = head.next;
        else {
            ListNode pre = head;
            ListNode p;
            int count = 1;
            while (count < pos - 1) {
                pre = pre.next;
                count++;
            }
            p= pre.next;
            pre.next= p.next;
        }
    }
    public void search_element(int src_k){
        ListNode p = head;
        int count=1;
        while(p != null){
            if(src_k == p.data) {
                System.out.println("Found element at: "+count);
                break;
            }
            else {
                p = p.next;
                count++;
            }
        }
    }


    public  void list_length(){
        ListNode current = head;
        if(head==null)
            return;
        int count=0;
        while(current!=null){
            count++;
            current = current.next;
        }
        System.out.println("\nLength of list is: "+ count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initialization s1 = new initialization();
        s1.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        s1.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Linked list: ");
        s1.print();
        System.out.println("\nAfter insertion at first and last node: ");
        s1.insert_at_first();
        s1.insert_at_last();
        s1.print();
        System.out.println("\nEnter the position to enter new node: ");
        int pos = sc.nextInt();
        s1.insert_at_any_given_pos(pos);
        s1.print();

        System.out.println("\nAfter first node deletion: ");
        s1.del_first_node();
        s1.print();
        System.out.println("\nAfter Last node deletion: ");
        s1.del_last_node();
        s1.print();
        System.out.println("\nEnter the position to delete node: ");
        int del = sc.nextInt();
        s1.del_at_any_pos(del);
        System.out.println("\nAfter deletion of node at give pos: ");
        s1.print();
        System.out.println("\nEnter data to search it in linked list: ");
        int src_k = sc.nextInt();
        s1.search_element(src_k);
        s1.print();
        s1.list_length();
    }
}