import java.io.*;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        // for (int val : list) {
        //     System.out.print(val + " -> ");
        // }
        // System.out.println(".");
    }

    static class MyLinkedList {
        static class Node {
            int data;
            Node next;
        }

        Node head;
        Node tail;
        int size;

        void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            size++;
        }

        int size() {
            return size;
        }
    }

}