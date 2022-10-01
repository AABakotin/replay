package ru.geekbrains.lesson2;

public class Main {


    public static void main(String[] args) {


        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        TwoSideLinkedListImpl<Integer> twoSideLinkedList = new TwoSideLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);
        linkedList.remove(4);

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 4: " + linkedList.contains(4));

        for (Integer value : linkedList) {
            System.out.println("value: " + value);
        }

        System.out.println("---------------------");

        twoSideLinkedList.insertFirst(1);
        twoSideLinkedList.insertFirst(2);
        twoSideLinkedList.insertLast(3);
        twoSideLinkedList.insertFirst(4);
        twoSideLinkedList.insertLast(5);
        twoSideLinkedList.insertFirst(6);
        twoSideLinkedList.insertLast(7);
        twoSideLinkedList.insertFirst(8);

        for (Integer value :  twoSideLinkedList) {
            System.out.println("value: " + value);
        }

        System.out.println("First element: " + twoSideLinkedList.getFirst() +  "\n" +
                "Last element: " + twoSideLinkedList.getLast());



    }
}
