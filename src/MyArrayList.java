import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList <T> implements MyList<T> {
    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList(){
        array = new Object[capacity];
    }
    public T get(int index){
        return (T) array[index];
    }


    public void add(T newItem){
        if(size == capacity){
            increaseBuff();
        }
        array[size++] = newItem;
    }

    private void increaseBuff(){
        capacity = 2 * capacity;
        Object[] arrayTemp = new Object[capacity];

        if (size >= 0) System.arraycopy(array, 0, arrayTemp, 0, size);

        array = arrayTemp;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");
    }
    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((Comparable<T>) array[i]).compareTo((T) array[j]) > 0) {
                    T temp = (T) array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public T getFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else{
            return (T) array[0];
        }
    }

    @Override
    public T getLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else {
            return (T) array[size-1];
        }
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            array[i-1] = array[i];
        }
        size--;
    }
    @Override
    public void clear() {
        array = new Object[5];
        size = 0;
    }
    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size-1);
    }
    @Override
    public int indexOf(Object object) {
        for(int i = 0; i < size; i++){
            if (get(i).equals(object)){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return size-1;
    }

    @Override
    public boolean exists(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null && object == null) {

                return true;
            } else if (array[i] != null && array[i].equals(object)) {

                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];

        System.arraycopy(array, 0, result, 0, size);
        return result;
    }

    @Override
    public Object set(int index, T item) {
        return array[index] = item;
    }

    @Override
    public void add(int index, T item) {
        if(size == capacity){
            increaseBuff();
        }
        for(int i = size; i>index; i--){
            array[i] = array[i-1];
        }
        array[index] = item;
        size++;
    }

    @Override
    public void addFirst(T item) {
        if(size == capacity){
            increaseBuff();
        }
        for( int i = size; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = item;
        size++;
    }

    @Override
    public void addLast(T item) {
        if(size == capacity){
            increaseBuff();
        }
        array[size] = item;
        size++;
    }
}
