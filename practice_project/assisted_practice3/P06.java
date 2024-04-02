package practice_project.assisted_practice3;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class P06 {

    Node1 head;

    void insert(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            return;
        }

        if (data < head.data) {
            newNode.next = head;
            Node1 last = getLastNode();
            last.next = newNode;
            head = newNode;
            return;
        }

        Node1 current = head;
        while (current.next != head && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    Node1 getLastNode() {
        Node1 temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        return temp;
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node1 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        P06 list = new P06();

        list.insert(5);
        list.insert(10);
        list.insert(7);
        list.insert(3);
        list.insert(2);

        System.out.println("Sorted Circular Linked List:");
        list.printList();
    }
}

