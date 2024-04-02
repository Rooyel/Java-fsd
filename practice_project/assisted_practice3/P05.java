package practice_project.assisted_practice3;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class P05 {

    Node head;

    void deleteNode(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;
        prev.next = temp.next;
    }

    void insertNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P05 list = new P05();
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(1);
        list.insertNode(5);

        System.out.println("Linked List before deletion:");
        list.printList();

        int key = 4;
        list.deleteNode(key);

        System.out.println("Linked List after deletion of " + key + ":");
        list.printList();
    }
}
