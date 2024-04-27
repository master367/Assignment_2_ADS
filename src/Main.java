public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLInkedLIst<Integer> lInkedLIst = new MyLInkedLIst<>();



        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(37);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(76);
        arrayList.add(345);
        arrayList.add(0);

        arrayList.printArray();
        System.out.println(arrayList.exists(6));
        arrayList.addFirst(666);
        arrayList.addLast(777);
        arrayList.add(5,7654);
        arrayList.printArray();


        lInkedLIst.add(6);
        lInkedLIst.add(5);
        lInkedLIst.add(53);
        lInkedLIst.add(0);
        lInkedLIst.add(43);
        lInkedLIst.add(4);
        lInkedLIst.add(139);
        lInkedLIst.add(25);
        lInkedLIst.add(90);

        System.out.println("|||||||||||||||||||||||||||||");
        for (int i = 0; i < lInkedLIst.getSize(); i++) System.out.print(lInkedLIst.get(i) + "  ");

        System.out.println(lInkedLIst.exists(4));
        System.out.println("last element: " + lInkedLIst.getLast());
        System.out.println("first element: " + lInkedLIst.getFirst());

        for (int i = 0; i < lInkedLIst.getSize(); i++) System.out.print(lInkedLIst.get(i) + "  ");

        lInkedLIst.sort();
        System.out.println(" ");
        System.out.println(lInkedLIst.getSize());
        for (int i = 0; i < lInkedLIst.getSize(); i++) System.out.print(lInkedLIst.get(i) + "  ");
        lInkedLIst.removeFirst();
        System.out.println(" ");
        System.out.println(lInkedLIst.getSize());
        System.out.println(" ");
        for (int i = 0; i < lInkedLIst.getSize(); i++) System.out.print(lInkedLIst.get(i) + "  ");
        lInkedLIst.removeLast();

        System.out.println(" ");
        for (int i = 0; i < lInkedLIst.getSize(); i++) System.out.print(lInkedLIst.get(i) + "  ");
        System.out.println(" ");
        System.out.println(lInkedLIst.getSize());




        }
}
