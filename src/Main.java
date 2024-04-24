

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList();


        arrayList.add("damir krutoi_1");
        arrayList.add("damir krutoi_2");
        arrayList.add("damir krutoi_3");
        arrayList.add("damir krutoi_4");
        arrayList.add("damir krutoi_5");

        arrayList.printArray();
        System.out.println("size of array: " + arrayList.getSize());
        arrayList.remove(2);
        arrayList.printArray();
        System.out.println("size of array: " + arrayList.getSize());

    }
}
