package linked_list;

public class LinkedListTest {
    public static void main(String[] args) {
        int[] nodeData = new int[] {45, 36, 63, 72, 9, 27, 18, 90, 54, 81};
        LinkedList list = new LinkedList();
        LinkedList.Node top = list.create(nodeData);
        System.out.println(list.print(top));
        System.out.println("LinkedList length = " + list.length(top));

        list.insert(top, 25, 5);
        System.out.println(list.print(top));
        System.out.println("LinkedList length = " + list.length(top));

        list.insert(top, -1, 11); // test extraneous cases with insertAtPosition = 0, 1, length, > length
        System.out.println(list.print(top));
        System.out.println("LinkedList length = " + list.length(top));

        list.remove(top, 11); // test extraneous cases with deleteAtPosition = 0, 1, length, > length
        System.out.println(list.print(top));
        System.out.println("LinkedList length = " + list.length(top));

        list.remove(top, 5);
        System.out.println(list.print(top));
        System.out.println("LinkedList length = " + list.length(top));
    }
}
