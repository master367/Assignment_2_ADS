public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        MyLInkedLIst<Integer> lInkedLIst = new MyLInkedLIst<>();

        arrayList.add("damir krutoi_1");
        arrayList.add("damir krutoi_2");
        arrayList.add("damir krutoi_3");
        arrayList.add("damir krutoi_4");
        arrayList.add("damir krutoi_5");
        arrayList.printArray();
        System.out.println("size of array: " + arrayList.getSize());
        arrayList.add("damir krutoi_6");
        arrayList.add("damir krutoi_7");
        arrayList.add("damir krutoi_8");

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
