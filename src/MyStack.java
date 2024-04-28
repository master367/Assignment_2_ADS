import java.util.NoSuchElementException;

public class MyStack<T> {
    private MyArrayList<T> list = new MyArrayList<>();

    public boolean empty(){
        return list.getSize() == 0;
    }

    public int size(){
        return list.getSize();
    }

    public T peek(){
        if (empty()){
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    public T push(T item){
        list.addFirst(item);
        return item;
    }

    public T pop(){
        if (empty()){
            throw new NoSuchElementException();
        }
        T removedTopElement = list.getFirst();
        list.removeFirst();
        return removedTopElement;
    }

}
