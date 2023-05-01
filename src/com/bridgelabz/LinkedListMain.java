package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked List 1");
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        System.out.println("Push method");
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();
        Integer popData = linkedList1.pop();
        System.out.println("\n" + popData + " head deleted");
        linkedList1.display();

        System.out.println("\nLinked List 2");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        System.out.println("Append Method");
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();
        Integer popLastData = linkedList2.popLast();
        System.out.println("\n" + popLastData + " tail deleted");
        linkedList2.display();
        System.out.print("\nSearch method");
        Node<Integer> searchData = linkedList2.search(30);
        if (searchData != null){
            System.out.println("\nData Found");
        }
        else {
            System.out.println("\nData Not Found");
        }
        boolean isInserted = linkedList2.insert(30, 40);
        if (isInserted){
            System.out.println("Inserted Successfully.");
        }
        else {
            System.out.println("Not Inserted.");
        }
        linkedList2.display();
    }
}
