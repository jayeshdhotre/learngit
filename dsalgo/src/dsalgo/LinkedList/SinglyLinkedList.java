package dsalgo.LinkedList;

public class SinglyLinkedList {
	
	//head
	private ListNode head;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		SinglyLinkedList list=new SinglyLinkedList();
		
		
		list.head=new ListNode(100);
		ListNode second=new ListNode(200);
		ListNode third=new ListNode(300);
		ListNode fourth=new ListNode(400);
		
		list.head.next=second;
		second.next=third;
		third.next=fourth;
		
		
		ListNode current=list.head;
		while(current!=null)
		{
				System.out.print(current.data +" -- >");
				current=current.next;
		}
		
		
		
		
		
	}
	
}
