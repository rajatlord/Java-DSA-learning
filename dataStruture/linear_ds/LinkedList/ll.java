package dataStruture.linear_ds.LinkedList;

// for print
//  javac ./dataStruture/linear_ds/LinkedList/ll.java
//  java ./dataStruture/linear_ds/LinkedList/ll.java 

public class ll {
    Node head;
    private int size;

    ll() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("This List is null");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("This list is null");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String args[]) {
        ll list = new ll();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }

}
