package DSA.Linked_list.Singly;

public class insert_node_at_first {

    public ListNode head;

    private static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data= data;
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
    public void insert_at_first(){
        ListNode first = new ListNode(5);                 //new node that need to inserted
        first.next=head;
        head = first;
    }
    public static void main(String[] args){
        insert_node_at_first d1 = new insert_node_at_first();
        d1.head = new  ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);

        d1.head.next = second;
        second.next=third;
        third.next = fourth;
        fourth.next=fifth;
        fifth.next=sixth;

        System.out.println("befeore isnerting: ");
        d1.print();
        System.out.println("\nAfter inserting node at 1st position");
        d1.insert_at_first();
        d1.print();
    }
}
