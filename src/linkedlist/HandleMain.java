package linkedlist;

import static linkedlist.LinkedList.in;

public class HandleMain {

    public static SinglyLinkedList<Integer> singleList;
    public static DoublyLinkedList<Integer> doubleList;

    public HandleMain() {
        singleList = new SinglyLinkedList();
        doubleList = new DoublyLinkedList<>();
    }

    void printList() {
        System.out.println("\n1- Insert At First\n"
                + "2- Insert At Last\n"
                + "3- Insert At specific Position\n"
                + "4-Remove From First\n"
                + "5-Remove From Last\n"
                + "6-Remove Specific Element\n"
                + "7-Remove Specific Position\n"
                + "8-Get Position Of Element\n"
                + "9-Get Middle Node\n"
                + "10-Reverse The List"
                + "11-Exit");
    }

    void SinglyLinkedList(int choice) {
        int Value;
        int position;
        switch (choice) {
            case 1: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                singleList.insertFirst(Value);
                singleList.print();
                break;
            }
            case 2: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                singleList.insertLast(Value);
                singleList.print();
                break;
            }
            case 3: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                System.out.println("Enter the Position");
                position = in.nextInt();
                singleList.insertAt(position, Value);
                singleList.print();
                break;
            }
            case 4: {
                singleList.removeFirst();
                singleList.print();
                break;
            }
            case 5: {
                singleList.removeLast();
                singleList.print();
                break;
            }
            case 6: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                singleList.remove(Value);
                singleList.print();
                break;
            }
            case 7: {
                System.out.println("Enter the Position");
                position = in.nextInt();
                singleList.removeAt(position);
                singleList.print();
                break;
            }
            case 8: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                System.out.println(singleList.getPosition(Value));
                break;
            }
            case 9: {
                singleList.middleNode();
                break;
            }
            case 10: {
                singleList.reverse();
                singleList.print();
                break;
            }
            default: {
                System.out.println("The number is not exist,try again !");
                break;
            }
        }
    }

    void DoublyLinkedList(int choice) {
        int Value;
        int position;
        switch (choice) {
            case 1: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                doubleList.insertFirst(Value);
                doubleList.print();
                break;
            }
            case 2: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                doubleList.insertLast(Value);
                doubleList.print();
                break;
            }
            case 3: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                System.out.println("Enter the Position");
                position = in.nextInt();
                doubleList.insertAt(position, Value);
                doubleList.print();
                break;
            }
            case 4: {
                doubleList.removeFirst();
                doubleList.print();
                break;
            }
            case 5: {
                doubleList.removeLast();
                doubleList.print();
                break;
            }
            case 6: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                doubleList.remove(Value);
                doubleList.print();
                break;
            }
            case 7: {
                System.out.println("Enter the Position");
                position = in.nextInt();
                doubleList.removeAt(position);
                doubleList.print();
                break;
            }
            case 8: {
                System.out.println("Enter the Value");
                Value = in.nextInt();
                System.out.println(doubleList.getPosition(Value));
                break;
            }
            case 9: {
                doubleList.middleNode();
                break;
            }
            case 10:
            {
                doubleList.reverse();
                doubleList.print();
                break;
            }
            default: {
                System.out.println("The number is not exist,try again !");
                break;
            }
        }
    }

}
