package DSA.Linked_list.Singly;

public class insert_node_at_last {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

    private  ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
    public void insert_at_last(){
        ListNode n1 = new ListNode(79);
        n1.next=null;
        ListNode p = head;
        while(p.next!=null){
            p=p.next;
        }
        p.next = n1;
    }
    public void print(){
        ListNode p = head;
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        insert_node_at_last d1 = new insert_node_at_last();
        d1.head = new ListNode(43);
        ListNode second = new ListNode(20);
        ListNode third =  new ListNode(30);
        ListNode fourth = new ListNode(40);            //random values of data
        ListNode fifth =  new ListNode(50);
        ListNode sixth =  new ListNode(60);

        d1.head.next = second;
        second.next=third;
        third.next = fourth;
        fourth.next=fifth;
        fifth.next=sixth;

        System.out.println("befeore isnerting: ");
        d1.print();
        System.out.println("\nAfter inserting node at 1st position");
        d1.insert_at_last();
        d1.print();
    }
}
