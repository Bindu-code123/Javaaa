class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode n=new ListNode();
        ListNode p=n;
        int c=0;
        while(l1!=null || l2!=null || c!=0)
        {
            int a=l1!=null?l1.val:0;
            int b=l2!=null?l2.val:0;
            int sum=a+b+c;
            c=sum/10;
            n.next=new ListNode(sum%10);
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;   
            n=n.next;
        }
        return p.next;
    }
}