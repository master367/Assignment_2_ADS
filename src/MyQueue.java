import java.util.NoSuchElementException;

public class MyQueue<T> {
    private MyArrayList<T> list = new MyArrayList<>();

    public boolean empty(){
        return list.getSize() == 0;
    }

    public int size(){
        return list.getSize();
    }

    public T peek(){
        if(empty())
            throw new NoSuchElementException();
        return list.getFirst();
    }

    public T engueue(T item){
        list.addLast(item);
        return item;
    }

    public T dequeue(){
        T removedFrontElement = list.getFirst();
        list.removeFirst();
        return removedFrontElement;
    }


}
