package com.company;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private final E[] data;
    private int index = 0;

    public ArrayIterator(E[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public E next() {
        return data[index++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
