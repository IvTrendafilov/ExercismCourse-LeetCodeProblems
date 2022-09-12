public class DoublyLinkedList <E>{


    private Node<E> head;
    private Node<E> tail;
    private int count;
    public DoublyLinkedList() {
        this.count = 0;
    }
    public void push(E newData) {
        Node<E> node;
        if (count == 0) {
            node = new Node<>(newData);
            head = node;
            tail = node;
        } else {
            node = new Node<>(null, tail, newData);
            tail.next = node;
            tail = node;
        }
        count++;
    }
    public E pop() {
        E popData = tail.data;
        tail = tail.previous;
        count--;
        return popData;
    }
    public void unshift(E newData) {
        Node<E> node;
        if (count == 0) {
            node = new Node<>(newData);
            head = node;
            tail = node;
        } else {
            node = new Node<>(head, null, newData);
            head.previous = node;
            head = node;
        }
        count++;
    }
    public E shift() {
        E shiftData = head.data;
        head = head.next;
        count--;
        return shiftData;
    }
    private class Node<E> {
        private Node<E> next;
        private Node<E> previous;
        private E data;
        public Node(Node<E> next, Node<E> previous, E data) {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }
        public Node(E data) {
            this(null, null, data);
        }
    }
}
