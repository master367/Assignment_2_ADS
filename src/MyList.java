import java.util.Iterator;

public interface MyList<T>{
    void add(T item);
    void set(int index, T item);
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);

    Iterator<T> iterator();

    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(Object object);
    int lastIndexOf(Object object);
    boolean exists(Object object);
    public Object[] toArray();
    void clear();
    int size();
}
