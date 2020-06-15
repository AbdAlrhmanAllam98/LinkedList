package linkedlist;
import model.Node;
import java.lang.Math;
public class SinglyLinkedList<T> {
    Node head, tail;
    int length;

    public SinglyLinkedList() {
        head = tail = null;
        length = 0;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    //insertion
    public void insertFirst(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.setNext(null);
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }
    
    public void insertLast(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.setNext(null);
        } else {
            tail.setNext(newNode);
            newNode.setNext(null);
            tail = newNode;
        }
        length++;
    }

    public void insertAt(int position, T element) {
        if (position < 0 || position > length) {
            System.out.println("the position is not exist");
        } else if (position == 0) {
            insertFirst(element);
        } else if (position == length) {
            insertLast(element);

        } else {
            Node newNode = new Node(element);
            Node curr = head;
            for (int i = 1; i < position; i++) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
            length++;
        }
    }

    //Deletion
    public void removeFirst() {
        Node curr = head;
        if (isEmpty()) {
            System.out.println("the list is empty");
            return;
        } else if (length == 1) {
            head = tail = null;
            length--;
        } else {
            head = curr.getNext();
            length--;
        }

    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("the list is empty");
        } else if (length == 1) {
            tail = head = null;
            length--;
        } else {
            Node curr = head.getNext();
            Node prev = head;
            while (curr != tail) {
                prev = curr;
                curr = curr.getNext();
            }
            prev.setNext(null);
            tail = prev;
            length--;
        }
    }

    public void removeAt(int position) {
        if (position < 0 || position > length) {
            System.out.println("the position is not exist");
            return;
        }
        if (isEmpty()) {
            System.out.println("the list is empty");
        } else if (position == 0) {
            removeFirst();
        } else if (position == length) {
            removeLast();
        } else {
            Node curr = head.getNext();
            Node prev = head;
            for (int i = 1; i < position; i++) {
                prev = curr;
                curr = curr.getNext();
            }
            prev.setNext(curr.getNext());
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
            } else if (curr == null) {
                System.out.println("The item is not there");
            }
        }
    }

    public void reverse() {
        if (isEmpty()) {
            System.out.println("the list is empty");
        } else {
            Node prev = null;
            Node curr = head;
            Node next = curr.getNext();
            tail = head;
            while (next != null) {
                next = curr.getNext();
                curr.setNext(prev);
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }

    public int getPosition(T element) {
        int pos = 0;
        Node curr = head;
        if (head.getItem() == element) {
            return 0;
        } else if (tail.getItem() == element) {
            return length-1;
        } else {
            while (curr != tail && curr.getItem() != element) {
                curr = curr.getNext();
                pos++;
            }
            return pos;

        }
    }
    
    public void middleNode() {
        if(length==0)
        {
            System.out.println("the list is empty");
            return;
        }
        int mid=(int) Math.ceil(length/2);
        Node curr=head;
        for(int i=0;i<mid;i++)
        {
            curr=curr.getNext();
        }
        while(curr!=null)
        {
            System.out.print(curr.getItem()+"\t");
            curr=curr.getNext();
        }
    }
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getItem() + "\t");
            curr = curr.getNext();
        }
    }
}
