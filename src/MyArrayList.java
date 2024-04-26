import java.util.Iterator;

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

        for(int i = 0; i < size; i++){
            arrayTemp[i] = array[i];
        }

        array = arrayTemp;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " || ");
        }
        System.out.println();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index not correct");
    }
    @Override
    public void sort() {
        if (isArrayInteger().equals("int")) {
            int n = size;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if ((int) array[j] > (int) array[j + 1]) {
                        T temp = (T) array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
        }
    }

    public String isArrayInteger(){
        int intSize = 0;
        int doubleSize = 0;
        for (int i = 0; i < size; i++) {
            try {
                int value = (Integer) array[i];
                intSize++;
            } catch (ClassCastException e) {
            }
            try {
                double tempD = (Double) array[i];
                doubleSize++;
            } catch (ClassCastException e) {
            }
        }
        if (intSize == size) {
            return "int";
        }
        if (doubleSize == size) {
            return "double";
        }
        return "0";
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
        return null;
    }

    @Override
    public T getLast() {
        return null;
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
        array = (T[]) new Object[5];
        size = 0;
    }
    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

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


}
