package HW_3;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {
    private E[] elements;
    private int currentIndex;

    public MyIterator(E[] elements) {
        this.elements = elements;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.length;
    }

    @Override
    public E next() {
        return elements[currentIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }
}
