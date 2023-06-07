package HW_3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    private Queue<String> queue;
    private boolean isOpen;

    public Market() {
        queue = new LinkedList<>();
        isOpen = false;
    }

    @Override
    public void enqueue(String person) {
        queue.offer(person);
        System.out.println(person + " has been added to the queue.");
    }

    @Override
    public String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
            return null;
        }
        String person = queue.poll();
        System.out.println(person + " has been removed from the queue.");
        return person;
    }

    @Override
    public void open() {
        isOpen = true;
        System.out.println("The market is now open.");
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("The market is now closed.");
    }

    @Override
    public void update() {
        if (!isOpen) {
            System.out.println("The market is closed, unable to update.");
            return;
        }
        if (queue.isEmpty()) {
            System.out.println("The queue is empty, no orders to process.");
            return;
        }

        String person = queue.poll();
        System.out.println("Processing order for " + person);
    }

    public static class MyIterator<E> implements Iterator<E> {
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
}
