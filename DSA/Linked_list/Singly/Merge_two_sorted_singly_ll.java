package DSA.Linked_list.Singly;

public class Merge_two_sorted_singly_ll {
    //   ListNode head;
//   public static class ListNode{
//       private int data;
//       private ListNode next;
//
//       public ListNode(int data){
//           this.data=data;
//           this.next=null;
//       }
//   }
//
//    public static void main(String[] args) {
//        Merge_two_sorted_singly_ll m1 = new Merge_two_sorted_singly_ll();
//        Merge_two_sorted_singly_ll m2 = new Merge_two_sorted_singly_ll();
//        Merge_two_sorted_singly_ll result = new Merge_two_sorted_singly_ll();
//        //m1.head = new ListNode(0);
//        m1.head = new ListNode(1);
//        ListNode sm1 = new ListNode(3);
//        ListNode sm2 = new ListNode(4);
//        ListNode sm3 = new ListNode(7);
//        ListNode sm4 = new ListNode(8);
//
//        m1.head.next= sm1;
//        sm1.next=sm2;
//        sm2.next=sm3;
//        sm3.next=sm4;
//        sm4.next=null;
//
//        m2.head = new ListNode(2);
//        ListNode sm6 = new ListNode(5);
//        ListNode sm7 = new ListNode(6);
//        ListNode sm8 = new ListNode(8);
//        ListNode sm9 = new ListNode(9);
//
//        m2.head.next= sm6;
//        sm6.next=sm7;
//        sm7.next=sm8;
//        sm8.next=sm9;
//        m1.print();
//        m2.print();
//        result.head = merge(m1.head,m2.head);
//        result.print();
//    }
//
//    private void print() {
//       ListNode p = head;
//       while(p != null){
//           System.out.print(p.data+"-->");
//           p=p.next;
//       }
//        System.out.println("NULL");
//    }
//    private static ListNode merge(ListNode a, ListNode b) {
//    ListNode dummy = new ListNode(0);
//    ListNode tail = dummy;
//    while(a!=null && b!=null){
//        if(a.data <= b.data){
//            tail.next=a;
//            a= a.next;
//        }
//        else {
//            tail.next = b;
//            b = b.next;
//        }
//        tail=tail.next;
//        if(a==null)
//            tail.next=b;
//        else
//            tail.next=a;
//
//    }
//        return dummy.next;
//   }
    ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void print() {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.data + "-->");
            p = p.next;
        }
        System.out.println("NULL");
    }

    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null)
            tail.next = b;
        else
            tail.next = a;
        return dummy.next;
    }


    public static void main(String[] args) {
        Merge_two_sorted_singly_ll m1 = new Merge_two_sorted_singly_ll();
        Merge_two_sorted_singly_ll m2 = new Merge_two_sorted_singly_ll();
        Merge_two_sorted_singly_ll result = new Merge_two_sorted_singly_ll();

        m1.head = new ListNode(1);
        ListNode sm1 = new ListNode(3);
        ListNode sm2 = new ListNode(5);
        ListNode sm3 = new ListNode(6);
        ListNode sm4 = new ListNode(8);
        ListNode sm5 = new ListNode(10);

        m1.head.next = sm1;
        sm1.next = sm2;
        sm2.next = sm3;
        sm3.next = sm4;
        sm4.next = sm5;
        sm5.next = null;

        m2.head = new ListNode(2);
        ListNode sm6 = new ListNode(4);
        ListNode sm7 = new ListNode(6);
        ListNode sm8 = new ListNode(7);
        ListNode sm9 = new ListNode(9);
        ListNode sm10 = new ListNode(15);

        m2.head.next = sm6;
        sm6.next = sm7;
        sm7.next = sm8;
        sm8.next = sm9;
        sm9.next = sm10;
        sm10.next = null;

        m1.print();
        m2.print();
        result.head = merge(m1.head,m2.head);
        result.print();
    }

}