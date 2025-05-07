class mergesort {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode head=null;
    public  static ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode mid=findmid(head);
        ListNode left=head;
        ListNode right=mid.next;       
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public ListNode findmid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
       
       
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right)
{
    ListNode dummy=new ListNode(-1);
    ListNode temp=dummy;
    while(left!=null && right!=null)
    {
        if(left.val<right.val)
        {
            temp.next=left;
            left=left.next;
        }
        else
        {
            temp.next=right;
            right=right.next;
        }
        temp=temp.next;
    }
    while(left!=null)
    {
        temp.next=left;
        left=left.next;
        temp=temp.next;
    }
    
    while(right!=null)
    {
        temp.next=right;
        right=right.next;
        temp=temp.next;
    }
    return dummy.next;
}
    public static void main(String[] args){
       // head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head = sortList(head);
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }



    }
}