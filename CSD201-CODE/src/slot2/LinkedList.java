/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot2;

/**
 *
 * @author DELL
 */
public class LinkedList {
    private ListNode head;
    private static class ListNode{
        private int value;
        private ListNode next;
        
        public ListNode(int value){
            this.value = value;
            this.next = null;
        }
    }
    
    public void insertAtHead(int value){
        ListNode newNode = new ListNode(value);  
        newNode.next = head;
        head = newNode;
        
    }
    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void insertAtPosition(int value, int position){
        ListNode newNode = new ListNode(value);
        if (position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode current = head;
        int count = 1;
        while (count < position - 1){
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void removeAtHead(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;       
    }
    public void removeAtEnd(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
  
        ListNode current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next  = null;
        
        
    }
    public void removeAtPosition(int position){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(position > this.findLength() || position <= 0){
            System.out.println("Invalid position");
            return;
        }
        
        ListNode current = head;
        int count = 1;
        while(count <= position -1){
            current = current.next;
            count++;
        }
        current.next = current.next.next;
        
    }
    public void traversal(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.value +" --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public  int findLength(){
        ListNode current = head;
        int count=0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        ListNode first = new ListNode(10);
        myList.head = first;
        
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(12);
        ListNode forth = new ListNode(30);
        
        myList.head.next = second;
        second.next = third;
        third.next = forth;
        
        myList.insertAtHead(15);
        myList.insertAtEnd(35);
        myList.insertAtPosition(50,3);
        myList.removeAtHead();
        myList.removeAtEnd();
        myList.removeAtPosition(8);
        myList.traversal();
        System.out.println(myList.findLength());
    }
    
}
