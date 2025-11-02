class Node {
    Node next;
    Node prev;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class mylinkedlist {
    Node head;

    void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public int remove(int data) {
        if (head == null) return -1;

        Node temp = head;

        if (temp.data == data) {
            head = temp.next;
            if (head != null) head.prev = null;
            return data;
        }

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;

        return data;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
