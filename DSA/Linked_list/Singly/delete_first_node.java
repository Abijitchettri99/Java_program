package DSA.Linked_list.Singly;

public class delete_first_node {
    private ListNode head;
    private static class ListNode{
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
    public void delete_first_node(){
        ListNode p = head;
        p = p.next;
        head = p;
    }

    public static void main(String[] args){
        delete_first_node d1 = new delete_first_node();
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
        System.out.println("\nAfter deleting first node: ");
        d1.delete_first_node();
        d1.print();

    }
}
