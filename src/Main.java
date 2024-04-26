import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLInkedLIst<Integer> lInkedLIst = new MyLInkedLIst<>();

        ArrayList<Integer> arr = new ArrayList<>();


        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(37);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.printArray();
        System.out.println("size of array: " + arrayList.getSize());
        arrayList.add(6);
        arrayList.add(76);
        arrayList.add(345);
        arrayList.add(0);
        arrayList.printArray();
        arrayList.sort();

        arrayList.printArray();


        System.out.println("size of array: " + arrayList.getSize());
        arrayList.remove(6);
        arrayList.printArray();
        System.out.println("size of array: " + arrayList.getSize());
        arrayList.clear();
        System.out.println("size of array: " + arrayList.getSize());




        lInkedLIst.add(1);
        lInkedLIst.add(2);
        lInkedLIst.add(3);
        lInkedLIst.add(4);
        lInkedLIst.add(5);

        System.out.println(lInkedLIst.get(2));
    }
}
