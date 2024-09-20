/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot3;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class lab2 {
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

    public lab2() {
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
    }
    public static void main(String[] agrs){
        Stack myStack = new Stack();

        Scanner sc = new Scanner (System.in);
        System.out.println("enter:");
        String test = sc.nextLine();
        String[] tmp = test.split("");
        
        
            
        
        
        myStack.printStack();
    }
    
}
