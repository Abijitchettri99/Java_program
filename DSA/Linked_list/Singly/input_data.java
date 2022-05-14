package DSA.Linked_list.Singly;

public class input_data {
    private ListNode head;

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
        System.out.println("Data present in Singly Linked Listed: ");
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args){
        input_data d1 = new input_data();
        d1.head= new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        d1.head.next = second;
        second.next=third;
        third.next = fourth;
        fourth.next=fifth;
        fifth.next=sixth;

        d1.print();
    }
}
