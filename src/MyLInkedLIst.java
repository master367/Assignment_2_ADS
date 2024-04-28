import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLInkedLIst<T> implements MyList<T> {


    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLInkedLIst(){
        head = null;
        size = 0;
    }

    public void add(T item){
        MyNode<T> newNode = new MyNode<>(item, null);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public Object set(int index, T item) {
        MyNode<T> current = head;
        for(int i = 0; i< index; i++){

            current = current.next;
        }
        T result = current.data;
        current.data = item;
        return result;
    }

    @Override
    public void add(int index, T data) {
        MyNode<T> newNode = new MyNode<>(data, null);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void addFirst(T item) {
        MyNode<T> newNode = new MyNode<>(item, null);
        if( head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addLast(T item) {
        MyNode<T> newNode = new MyNode<>(item, null);
        if( head == null){
            head = newNode;
            return;
        }
        MyNode<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }



    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException("No more elements in the list");
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public T getFirst() {
        return head.data;
    }

    @Override
    public T getLast() {
        return tail.data;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        MyNode<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    @Override
    public void removeFirst() {
        head=head.next;
    }

    @Override
    public void removeLast() {
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        MyNode<T> current = head;
        while(current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1 ; i++) {
            MyNode<T> current = head;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) current.data).compareTo(current.next.data) > 0) {
                    T t = current.data;
                    current.data = current.next.data;
                    current.next.data = t;
                }
                current = current.next;
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        MyNode<T> current = head;
        for (int i = 0; current != null; i++, current = current.next) {
            if (object == current.data) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode<T> current = head;
        int lastIndex = -1;
        for (int i = 0; current != null; current = current.next, i++) {
            if (object == current.data) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public boolean exists(Object object) {
        for (MyNode<T> current = head; current != null; current = current.next) {
            if (object == null && current.data == null) {
                return true;
            } else if (object != null && object.equals(current.data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        MyNode<T> current = head;

        while (current != null) {
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;

        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;

    }

    private static class MyNode<T>{
        T data;
        MyNode<T> next;
        MyNode(T data, MyNode<T> next){
            this.data = data;
            this.next = next;
        }
    }
}
