package com.illumina.practice.linkedlist;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

/**
 * Created by agupta2 on 8/14/17.
 */
public class Executor {

    public static void main(String[] args){

        System.out.println("Hello world");


        Node linkedList = CommonUtil.getInstance().getSampleLinkedList();

        String abc="a";
        Integer number=1;
        Double doubleMe=2.0;
        int a=1;


        System.out.println("Object Size: " + ObjectSizeCalculator.getObjectSize(linkedList));
        System.out.println("abc Size: " +ObjectSizeCalculator.getObjectSize(abc));
        System.out.println("number Size: " +ObjectSizeCalculator.getObjectSize(number));
        System.out.println("doubleMe Size: " +ObjectSizeCalculator.getObjectSize(doubleMe));
        System.out.println("int Size: " +ObjectSizeCalculator.getObjectSize(a));

        CommonUtil.getInstance().printLinkedList(linkedList);
        Node n7 = new Node(7);
        MyLinkedList list = new MyLinkedList(linkedList);
        list.insertNode(n7);
        CommonUtil.getInstance().printLinkedList(linkedList);
        System.out.println("Object Size: " + ObjectSizeCalculator.getObjectSize(linkedList));


    }


}
