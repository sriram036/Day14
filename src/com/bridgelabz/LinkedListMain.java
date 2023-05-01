package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        System.out.println("Push method");
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();
        Integer popData = linkedList1.pop();
        System.out.println("\n" + popData + " data deleted");
        linkedList1.display();

        System.out.println("\nAppend method");

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();
        Integer popLastData = linkedList2.popLast();
        System.out.println("\n" + popLastData);
        linkedList2.display();
    }
}
