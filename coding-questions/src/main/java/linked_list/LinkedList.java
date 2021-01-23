package linked_list;

public class LinkedList {
    public class Node {
        int data;
        Node next;

        Node() {}

        Node(int num) {
            data = num;
        }
    }

    public Node create(int[] dataArr) {
        Node top = new Node();
        Node currentNode = top;
        for (int i=0; i<dataArr.length; i++) {
            Node nextNode = new Node(dataArr[i]);
            currentNode.next = nextNode;
            currentNode = nextNode;
        }
        currentNode.next = null;
        return top;
    }

    public String print(Node top) {
        if (top == null) return "Head is pointing to null";
        Node current = top.next;
        if (current == null) {
            return "Empty Linked List";
        }
        StringBuilder sb = new StringBuilder();

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(" -> ");

            current = current.next;
        }

        return sb.toString();
    }

    public int length(Node top) {
        if (top == null) return 0;
        Node current = top.next;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void insert(Node top, int nodeData, int insertAtPosition) {
        if (insertAtPosition <= 0 || top == null) return;
        Node current = top;
        for (int i = 0; i < insertAtPosition-1; i++) {
            if (current == null)
                return;
            current = current.next;
        }
        if (current.next == null) return;
        Node newNode = new Node(nodeData);
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
        temp = null;
    }

    public void remove(Node top, int deleteAtPosition) {
        if (deleteAtPosition <=0 || top == null) return;
        int iteration = 0;
        Node current = top;
        Node prev = top;
        while (iteration < deleteAtPosition && current != null) {
            prev = current;
            current = current.next;
            iteration++;
        }
        if (current == null) return;
        prev.next = current.next;
        current = null;
    }
}
