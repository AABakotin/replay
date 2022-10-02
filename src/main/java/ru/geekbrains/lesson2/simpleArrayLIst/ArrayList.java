package ru.geekbrains.lesson2.simpleArrayLIst;

public interface ArrayList<E> {

    int getSize();
    E getByIndex(int index);
    void add(E e);
    void removeByIndex(int index);

}
