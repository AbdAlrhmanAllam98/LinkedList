package linkedlist;

import model.Node;

public class DoublyLinkedList<T> {

    Node head, tail;
    int length;

    public DoublyLinkedList() {
        head = tail = null;
        length = 0;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getItem() + "\t");
            curr = curr.getNext();
        }
    }

    public void reverse() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.getItem() + "\t");
            curr = curr.getPrev();
        }
    }

    public void insertFirst(T element) {
        Node newNode = new Node(element);
        if (length == 0) {
            newNode.setNext(null);
            newNode.setPrev(null);
            head = tail = newNode;

        } else {
            newNode.setNext(head);
            newNode.setPrev(null);
            head.setPrev(newNode);
            if (length == 1) {
                head.setNext(null);
                tail = head;
            }
            head = newNode;
        }

        length++;

    }

    public void insertLast(T element) {
        Node newNode = new Node(element);
        if (length == 0) {
            newNode.setNext(null);
            newNode.setPrev(null);
            head = tail = newNode;

        } else {
            newNode.setNext(null);
            newNode.setPrev(tail);
            tail.setNext(newNode);
            if (length == 1) {
                tail.setPrev(null);
                head = tail;

            }
            tail = newNode;
        }
        length++;
    }

    public void insertAt(int position, T element) {
        if (position == 0) {
            insertFirst(element);
        } else if (position == length) {
            insertLast(element);
        } else {
            Node curr = head;
            Node newNode = new Node(element);
            for (int i = 1; i < position; i++) {
                curr = curr.getNext();
            }
            Node next = curr.getNext();
            newNode.setNext(next);
            next.setPrev(newNode);
            curr.setNext(newNode);
            newNode.setPrev(curr);
            length++;

        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("the list is Empty ");
        } else if (length == 1) {
            tail = head = null;
            length--;
        } else {
            Node curr = head.getNext();
            curr.setPrev(null);
            head = curr;
            length--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("the list is Empty ");
        } else if (length == 1) {
            tail = head = null;
            length--;
        } else {
            Node curr = tail.getPrev();
            curr.setNext(null);
            tail = curr;
            length--;
        }
    }

    public void removeAt(int position) {
        if (position < 0 && position > length) {
            System.out.println("this element is not exist");
        } else if (position == 0) {
            removeFirst();
        } else if (position == length) {
            removeLast();
        } else {
            Node curr = head;
            for (int i = 1; i < position; i++) {
                curr = curr.getNext();
            }
            Node nextRemover = curr.getNext().getNext();
            curr.setNext(nextRemover);
            nextRemover.setPrev(curr);
            length--;
        }
    }
    public void remove(T element) {
        if (isEmpty()) {
            System.out.println("the list is empty");
            return;
        }
        if (head.getItem() == element) {
            removeFirst();
        } else if (tail.getItem() == element) {
            removeLast();
        } else {
            Node curr = head.getNext();
            Node prev = head;
            while (curr != null && curr.getItem() != element) {
                prev = curr;
                curr = curr.getNext();
            }
            if (curr != null) {
                prev.setNext(curr.getNext());
                curr.getNext().setPrev(prev);
                length--;
            } else if (curr == null) {
                System.out.println("The item is not there");
            }
        }
    }
    public int getPosition(T element) {
        int position = 0;
        if (element.equals(head.getItem())) {
            return position;
        } else if (element.equals(tail.getItem())) {
            position = length - 1;
        } else {
            Node curr = head.getNext();
            while (curr != null && curr.getItem() != element) {
                curr = curr.getNext();
                position++;
            }
        }
        return position;
    }

    public void middleNode() {
        if (length == 0) {
            System.out.println("the list is empty");
            return;
        }
        int mid = (int) Math.ceil(length / 2);
        Node curr = head;
        for (int i = 0; i < mid; i++) {
            curr = curr.getNext();
        }
        System.out.print(curr.getItem() + "\t");
    }
}
