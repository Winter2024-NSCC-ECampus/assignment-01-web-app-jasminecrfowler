public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        linkedList.prepend(5);

        System.out.print("Linked List: ");
        linkedList.printList(); // Output: 5 -> 10 -> 20 -> 30 -> null

        System.out.println("Size: " + linkedList.size()); // Output: 4

        System.out.println("Head: " + linkedList.getHead()); // Output: 5
        System.out.println("Tail: " + linkedList.getTail()); // Output: 30

        System.out.println("Value at index 2: " + linkedList.at(2)); // Output: 20

        System.out.println("Contains 20? " + linkedList.contains(20)); // Output: true
        System.out.println("Contains 50? " + linkedList.contains(50)); // Output: false

        System.out.println("Index of 20: " + linkedList.find(20)); // Output: 2
        System.out.println("Index of 50: " + linkedList.find(50)); // Output: -1

        linkedList.pop();
        System.out.print("After pop: ");
        linkedList.printList();
    }
}
