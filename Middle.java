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
public class Middle {
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
	int middleElement() {
		Node slow = head;
		Node fast = head;
		slow = slow.next;
		fast = fast.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		int res = slow.data;
		return res;
	}
}
class LinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int temp;
        ArrayList<Node> nodes = new ArrayList<>();
        Middle m = new Middle();
        Node nn = null;
        //Insert till -1 occured
        while ((temp = sc.nextInt()) != -1) {
            nn = new Node(temp);
            m.insert(nn);
            nodes.add(nn);
        }
        int res = m.middleElement();
        System.out.println("Middle Element:"+res);
	}
}
