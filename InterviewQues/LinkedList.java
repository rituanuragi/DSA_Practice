package allTypeQuestion;

public class LinkedList {
	class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
	}
	Node head=null;
	Node tail=null;
	public void addNode(int new_data) {
		Node new_Node=new Node(new_data);
		
		if(head==null) {
			head=new_Node;
			tail=new_Node;
		}
		else {
			tail.next=new_Node;
			tail=tail.next;
			
		}
	}
   public void printMe() {
	   Node temp=head;
	   
	   while(temp!=null) {
		   System.out.print(temp.data + "->");
		   temp=temp.next;
	   }
	   System.out.println("NULL");
   }
   public static void main(String[] args) {
	LinkedList list=new LinkedList();
	
	list.addNode(1);
	list.addNode(2);
	list.addNode(3);
	list.addNode(4);
	list.printMe();
	list.findMiddleNode();
		
	}
	private void findMiddleNode() {
	// TODO Auto-generated method stub
		Node fastPointer=head;
		Node slowPointer=head;
		
		while(fastPointer!=null && fastPointer.next!=null) {
			fastPointer=fastPointer.next.next;
			slowPointer=slowPointer.next;
	
}
		System.out.println(slowPointer.data);
	
		
}
}
