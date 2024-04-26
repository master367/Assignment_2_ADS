import java.util.Iterator;

public class MyLInkedLIst<T> implements MyList<T> {


    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLInkedLIst(){
        head = null;
        size = 0;
    }
    public void add(T newItem){
        MyNode<T> newNode = new MyNode<>(newItem);
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
    public void set(int index, T item) {

    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }



    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

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
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

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

    private static class MyNode<E>{
        E data;
        MyNode<E> next;
        MyNode(E data){
            this.data = data;
            next = null;
        }
    }
}
