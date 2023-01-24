package LetCode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1= new ListNode();
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2= new ListNode();
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        System.out.println(mergeTwoList(l1,l2));

    }
    public static ListNode mergeTwoList(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode head= dummy;
        while(l1!=null&&l2!=null){
            if(l1.val< l2.val){
                dummy.next=l1;
                l1=l1.next;
            }else {
                dummy.next=l2;
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        if(l1!=null){
            dummy.next=l1;
            System.out.println(dummy);
        }else {
            dummy.next=l2;
            System.out.println(dummy);
        }
        return head.next;
    }
    public static LinkedList insert1(LinkedList list , int data){
        LinkedList.Node new_node= new LinkedList.Node(data);
        if(list.head==null){
            list.head=new_node;
        }else {
            LinkedList.Node last = list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }

}
