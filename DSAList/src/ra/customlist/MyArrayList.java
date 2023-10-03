package ra.customlist;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {
    // 1. Attributes
    private static final int DEFAULT_CAPCITY = 2;
    private E[] data = (E[]) new Object[DEFAULT_CAPCITY];

    private final E[] EMPTY_ARR = (E[]) new Object[0];


    public MyArrayList() {
    }

    public MyArrayList(E[] objects) {
        this.data = objects;
    }

    public void trimToSize() {
        if (size() < data.length) {
            E[] initEs = (E[])new Object[size()];
            System.arraycopy(data, 0, initEs, 0, size());
            data = initEs;
        }
    }

    private void ensureCapacity() {
        E[] initEs = (E[]) new Object[size() * 2 + 1];
        System.arraycopy(data, 0, initEs, 0, data.length);
        data = initEs;
    }


    @Override
    public void add(int index, E e) {
        if (size() == data.length) {
            ensureCapacity();
        }
        data[index] = e;
        size++;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size(); i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        return data[index];
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size(); i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for (int i = size()-1; i >= 0; i--) {
            if (data[i].equals(e)) {
                return i;
            }
        }

        return -1;
    }

    // 0 1 2 3 4 5
    // 0 1 2 4 5
    @Override
    public E remove(int index) {
        E removedE = data[index];
        E[] initEs = (E[]) new Object[size()];
        System.arraycopy(data, 0, initEs, 0, index);
        System.arraycopy(data, index+1, initEs, index, size() - index);
        data = initEs;
        return removedE;
    }

    public boolean remove(E e) {
        int index = indexOf(e);
        E removedE = data[index];
        E[] initEs = (E[]) new Object[size()];
        System.arraycopy(data, 0, initEs, 0, index);
        System.arraycopy(data, index+1, initEs, index, size() - index);
        data = initEs;
        return true;
    }

    @Override
    public E set(int index, E e) {
        data[index] = e;
        return data[index];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
