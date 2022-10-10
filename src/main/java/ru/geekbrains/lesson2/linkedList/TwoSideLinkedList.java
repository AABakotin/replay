package ru.geekbrains.lesson2.linkedList;




public interface TwoSideLinkedList<E>  extends LinkedList <E> {

    void insertLast(E value);

    E getLast();
}