package ru.geekbrains.lesson2.simpleArrayLIst;

import java.util.Arrays;

public class SimpleArrayList<E> implements ArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] initArray;

    private int pointer;

    private int size;

    public SimpleArrayList() {
        this.size = DEFAULT_CAPACITY;
        this.initArray = new Object[size];
        this.pointer = 0;
    }

    @Override
    public int getSize() {
        return this.pointer;
    }

    @Override
    public E getByIndex(int index) {
        return (E) this.initArray[index];
    }

    @Override
    public void add(E e) {
        if (pointer == this.initArray.length) {
            this.initArray = Arrays.copyOf(this.initArray, (int) (this.initArray.length * 1.6));
        }
        this.initArray[pointer] = e;
        this.pointer++;
    }

    @Override
    public void removeByIndex(int index) {
        Object[] temp1 = new Object[this.initArray.length];
        if (pointer != index) {
            int i = 0;
            while (i != index) {
                temp1[i] = this.initArray[i];
                i++;
            }
            if (this.initArray.length - (index + 1) >= 0)
                System.arraycopy(this.initArray, index + 1, temp1, index + 1 - 1, this.initArray.length - (index + 1));
            System.arraycopy(temp1, 0, this.initArray, 0, temp1.length);
        } else {
            this.initArray[index] = null;
        }
        pointer--;
    }
}
