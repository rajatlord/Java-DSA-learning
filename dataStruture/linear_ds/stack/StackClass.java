package dataStruture.linear_ds.stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackClass {

    // from linked list way
    // static class Node {
    // int data;
    // Node next;

    // public Node(int data) {
    // this.data = data;
    // next = null;
    // }
    // }

    // static class Stack {
    // public static Node head;

    // public static boolean isEmpty() {
    // return head == null;
    // }

    // public static void push(int data) {
    // Node newNode = new Node(data);

    // if (isEmpty()) {
    // head = newNode;
    // return;
    // }

    // newNode.next = head;
    // head = newNode;

    // }

    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = head.data;
    // head = head.next;

    // return top;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }
    // }

    class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop(int data) {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.size() - 1;
        }
    }

    public static void main(String[] args) {

        // now implemention
        Stack s = new Stack();
        for (int i = 1; i < 5; i++) {
            s.push(i);
            System.out.println("addding i in the stack i: " + i);
        }
        System.out.println("Stack is filled with data and now showing");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
