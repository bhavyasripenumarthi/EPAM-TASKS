import java.util.ArrayList;
import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class CycleDetection {
	Node head;
	void insert(Node node) {
		if(head == null)
			head = node;
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	boolean has_cycle() {
		Node slow = head;
		Node fast = head;
		slow = slow.next;
		fast = fast.next.next;
		 while (fast != null && fast.next != null) { 
	            if (slow == fast)  
	               return true;  
	            slow = slow.next; 
	            fast = fast.next.next; 
	     }
		 return false;
	}
	void printList(Node head) {
		if(head == null)
			System.out.println("No List");
		else {
			while(head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
}
class LinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int temp;
        ArrayList<Node> nodes = new ArrayList<>();
        CycleDetection c = new CycleDetection();
        Node nn = null;
        //Insert till -1 occured
        while ((temp = sc.nextInt()) != -1) {
            nn = new Node(temp);
            c.insert(nn);
            nodes.add(nn);
        }
        System.out.println("Adding Cycle");
        //If 0 entered then add cycle
        int addCycle = sc.nextInt();
        if (addCycle == 0) {
            int index = (int) (Math.random() * (nodes.size()));
            nn.next = nodes.get(index);
        }
        System.out.println(c.has_cycle());
	}
}