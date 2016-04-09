//56 链表中环的入口节点

package 剑指offer;

public class BeginNode_in_LinkCircle {
	 public class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	 /*
	 public ListNode EntryNodeOfLoop(ListNode pHead)
	    {
	        ListNode meetingNode = MeetingNode(pHead);
	        if(meetingNode==null)  return null;
	        
	        int num_of_loop = 1;
	        ListNode node1 = meetingNode;
	        if(node1.next!=meetingNode){
	        	node1 = node1.next;
	        	num_of_loop++;
	        }
	        
	        node1 = pHead;
	        for(int i=0;i<num_of_loop;i++){
	        	node1 = node1.next;
	        }
	        
	        ListNode node2 = pHead;
	        while(node1!=node2){
	        	node1 = node1.next;
	        	node2 = node2.next;
	        }
	        return node1;
	    }
	 
	 public ListNode MeetingNode(ListNode pHead){
		 if(pHead==null)  return null;
		 
		 ListNode slow  = pHead.next;
		 if(slow==null) return null;
		 
		 ListNode fast  = slow.next;
		 while(slow!=null&&fast!=null){
			 
			 if(slow ==fast)  return fast;
			 
			 slow = slow.next;
			 fast = fast.next;
			 if(fast!=null){
				 fast=fast.next;
			 }
		 }
		 return null;
	 }
	 */
	 public ListNode EntryNodeOfLoop(ListNode pHead){
		 if(pHead ==null||pHead.next==null)  return null;
		 
		 ListNode target =null;
		 ListNode pre = pHead.next;
		 ListNode post = pHead.next.next;
		 
		 while(pre!=post){
			 pre=pre.next;
			 post = post.next.next;
		 }
		 
		 post = pHead;
		 while(post!=pre){
			 post = post.next;
			 pre=pre.next;
		 }
		 
		 target = pre;
		 return target;
	 }
	 
}
