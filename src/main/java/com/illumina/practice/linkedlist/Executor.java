package com.illumina.practice.linkedlist;

/**
 * Created by agupta2 on 8/14/17.
 */
public class Executor {

    public static void main(String[] args){

        System.out.println("Hello world");
        Node linkedList = CommonUtil.getInstance().getSampleLinkedList();
        CommonUtil.getInstance().printLinkedList(linkedList);
        Node n7 = new Node(7);
        MyLinkedList list = new MyLinkedList(linkedList);
        list.insertNode(n7);
        CommonUtil.getInstance().printLinkedList(linkedList);
    }


}
