package DSA.Linked_list.Singly;

public class del_last_node {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public  ListNode(int data){
            this.data= data;
            this.next = null;
        }
    }
    public void print(){
        ListNode p = head;
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.println("NULL");
    }
    public void delete_last_node() {
        ListNode p = head;
        ListNode pre = null;
        while (p.next != null){
            pre = p;
            p = p.next;
        }
        pre.next=null;
    }

    public static void main(String[] args) {
        del_last_node d1 = new del_last_node();
        d1.head = new ListNode(1);
        ListNode s = new ListNode(2);
        ListNode e = new ListNode(3);
        ListNode c = new ListNode(4);          //random values
        ListNode o = new ListNode(5);
        ListNode n = new ListNode(6);

        d1.head.next = s;
        s.next = e;
        e.next =c;
        c.next =o;
        o.next =n;

        System.out.println("Before deleting last node: ");
        d1.print();
        System.out.println("After deleting last node: ");
        d1.delete_last_node();
        d1.print();
    }
}
