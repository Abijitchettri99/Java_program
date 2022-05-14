package DSA.Linked_list.Singly;

import java.util.Scanner;

public class del_node_of_any_position {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        private ListNode(int data){
            this.data=data;
            this.next =null;
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
    public void delete_node_at_any_postion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter position number to delete node: ");
        int pos = sc.nextInt();
        ListNode s = head;
        int c =0;
        while(s!=null){
            s=s.next;
            c++;
        }
        if(pos>c)
            System.out.println("Enter valid position");
        else {

            if(pos==1)
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
    }

    public static void main(String[] args) {
        del_node_of_any_position d1 = new del_node_of_any_position();
        d1.head = new ListNode(1);
        ListNode s = new ListNode(2);
        ListNode e = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode o = new ListNode(5);

        d1.head.next = s;
        s.next=e;
        e.next= c;
        c.next =o;

        System.out.println("Before deleting first node: ");
        d1.print();
        d1.delete_node_at_any_postion();
        System.out.println("\nAfter deleting first node: ");
        d1.print();
    }
}
