package com.illumina.practice.linkedlist;

/**
 * Created by agupta2 on 8/15/17.
 */
public class CommonUtil {

    private static CommonUtil instance;

    private CommonUtil(){

    }

    public static CommonUtil getInstance(){

        if( null == instance ){
            instance = new CommonUtil();
            System.out.println("Instance created");
            return instance;
        }

        return instance;
    }

    public static Node getSampleLinkedList(){
        Node  n1 = new Node(1);
        Node  n2 = new Node(2);
        Node  n3 = new Node(3);
        Node  n4 = new Node(4);
        Node  n5 = new Node(5);
        Node  n8 = new Node(8);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n8;
        return n1;
    }

    public void printLinkedList(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

        System.out.println();
    }

}
