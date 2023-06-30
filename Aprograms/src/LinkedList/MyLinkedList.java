package LinkedList;

public class MyLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static MyLinkedList insert(MyLinkedList list, int data)
	{
		Node newNode=new Node(data);
		if(list.head == null)
			list.head=newNode;
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		return list;
	}
	public static void printList(MyLinkedList list)
	{
		Node currentNode = list.head;
		System.out.println("LinkedList");
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}
	}
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		insert(list, 10);
		insert(list, 12);
		insert(list, 14);
		printList(list);

	}

}
