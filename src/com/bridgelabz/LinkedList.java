package com.bridgelabz;

public class LinkedList<T> {

    Node<T> head;

    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public T pop() {
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public T popLast() {
        T popLastData = tail.data;
        Node<T> temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popLastData;
    }

    public Node<T> search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean insert(T searchData, T insertData ) {
        Node<T> insertNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            Node<T> temp = searchedNode.next;
            searchedNode.next = insertNode;
            insertNode.next = temp;
            return true;
        }
        return false;
    }
}
