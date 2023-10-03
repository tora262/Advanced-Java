package ra.customlist;

public abstract class MyAbstractList<E> implements MyList<E> {
    // 1. Attributes
    protected int size;

    public MyAbstractList() {
    }

    public MyAbstractList(E[] objects) {

    }

    @Override
    public void add(E e) {
        add(size, e);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        return remove(e);
    }
}
