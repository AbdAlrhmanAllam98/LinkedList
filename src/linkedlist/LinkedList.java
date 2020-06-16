package linkedlist;

import java.util.Scanner;

public class LinkedList {
    public static Scanner in = new Scanner(System.in);
    public static HandleMain handleMain;
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("1- Singly Linked List\n2- Doubly Linked List");
            choice = in.nextInt();
            handleMain = new HandleMain();
            if (choice == 1) {
                while (true) {
                    handleMain.printList();
                    int feature = in.nextInt();
                    if (feature != 11) {
                        handleMain.SinglyLinkedList(feature);
                    } else {
                        break;
                    }
                }
            } else if (choice == 2) {
                while (true) {
                    handleMain.printList();
                    int feature = in.nextInt();
                    if (feature != 11) {
                        handleMain.DoublyLinkedList(feature);
                    } else {
                        break;
                    }
                }
            }
        }while (choice==1||choice==2);
    }
}
