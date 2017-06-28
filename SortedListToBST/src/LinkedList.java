
public class LinkedList
{
	ListNode head;
	ListNode tail;
	
	public LinkedList()
	{
		head = null;
		tail = null;
	}
	
	public void add(int i)
	{
		if(head == null)
		{
			head = new ListNode(i);
			tail = head;
		}
		else
		{
			tail.next = new ListNode(i);
			tail = tail.next;
		}
	}
	
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
