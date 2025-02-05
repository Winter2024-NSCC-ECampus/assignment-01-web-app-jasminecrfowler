public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Integer getHead() {
        return (head != null) ? head.value : null;
    }

    public Integer getTail() {
        return (tail != null) ? tail.value : null;
    }

    public Integer at(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void pop() {
        if (head == null) return;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        size--;
    }

    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    public int find(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
