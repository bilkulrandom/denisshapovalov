package com.illumina.practice.linkedlist;

/**
 * Created by agupta2 on 8/14/17.
 * http://www.geeksforgeeks.org/given-a-linked-list-which-is-sorted-how-will-you-insert-in-sorted-way/
 */
public class MyLinkedList {

    Node head;

    MyLinkedList(){}

    MyLinkedList( Node node){
        this.head = node;
    }

    // This add the new node at the end of the current linked list
    public Node add(Node head, int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return head;
        }
        Node lastNode = head;
        while(head.next != null){
             lastNode = head.next;
        }
        lastNode.next = node;
        return node;
    }

    public Node insertNode(Node node){

        if(null == head){
            head = node;
            return head;
        };

        Node temp = null;
        while(node.data > head.data){
            temp = head;
            head = head.next;
            continue;
        }

        temp.next=node;
        temp.next.next = head;
        head = temp;
        return head;

    }



}
