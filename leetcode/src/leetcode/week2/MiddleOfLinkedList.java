package leetcode.week2;

// need to modify for optimization
public class MiddleOfLinkedList {
	
	Node head= null;

	public static void main(String[] args) {
		MiddleOfLinkedList mLinkedList = new MiddleOfLinkedList();
		mLinkedList.add(1);
		mLinkedList.add(2);
		mLinkedList.add(3);
		mLinkedList.add(4);
		mLinkedList.add(5);
		mLinkedList.add(6);
		System.out.println(mLinkedList.middleNode().value); 
		
	}

	private Node middleNode() {
		if(head.next == null)
			return head;
		int count = -1;
		Node temp = head;
		while(temp.next!=null) {
			count++;
			temp = temp.next;
		}
		temp = head;
		for(int i=0; i< (count/2 +1); i++) {
			temp=temp.next;
		}
		return temp;
	}

	private void add(int i) {
		if(head == null)
			head = new Node(i);
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = new Node(i);
		}
	}

}

class Node{
	int value;
	Node next;
	public Node(int value) {
		this.value = value;
		next = null;
	}
}
