/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot4;

/**
 *
 * @author DELL
 */
import java.util.EmptyStackException;
import java.util.Scanner;

public class Stack {

    private Node top;
    private int length;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        }

        int temp = top.data;
        top = top.next;
        length--;
        return temp;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        }
        return top.data;
    }
    public void printStack() {
    if (top == null) {
        System.out.println("Stack is empty");
        return;
    }
    
    Node current = top;
    System.out.println("Nội dung của stack:");
    while (current != null) {
        System.out.print(current.data + ",");
        current = current.next;
    }   
}
    public void clear(){
        top = null;
        length = 0;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        Scanner sc = new Scanner (System.in);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.clear();
        
   
        myStack.printStack();

    }
}
