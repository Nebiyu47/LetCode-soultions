package LetCode;


public class ListNode {
  int val;
  ListNode next;
  ListNode(){

  }
  ListNode(int val ){
      this.val=val;
  }
  ListNode(int val , ListNode next){
      this.val=val;
      this.next=next;
  }
}
class test{
    public static ListNode mergeNode(ListNode l1, ListNode l2) {
        ListNode result = null;
        if (l1 == null) {
            return l1;
        } else if (l2 == null) {
            return l2;
        }
        if (l1.val <= l2.val) {
            result = l1;
            result.next = mergeNode(l1.next, l2);
        } else {
            result = l2;
            result.next = mergeNode(l1, l2.next);
        }
        return result;
    }
    static void printList(ListNode list){
        while (list!=null){
            System.out.println(list.val+ "");
            list=list.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2= new ListNode(7);
        l2.next=new ListNode(3);
        l2.next=new ListNode(4);
        ListNode mergeHead=  mergeNode(l1,l2);
        printList(mergeHead);


    }
}


