public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLInkedLIst<Integer> lInkedLIst = new MyLInkedLIst<>();
        MyStack<Integer> stack = new MyStack<>();
        MyQueue<Integer> queue = new MyQueue<>();
        MyMinHeap<Integer> myMinHeap = new MyMinHeap<Integer>();



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

        System.out.println(stack.empty());
        stack.push(1);
        stack.push(6);
        stack.push(3);
        stack.push(90);
        stack.push(24);

        System.out.println(stack.empty());
        System.out.println(stack.size());
        System.out.println(stack.pop());


        System.out.println(queue.empty());
        queue.engueue(14);
        queue.engueue(148);
        queue.engueue(149);
        queue.engueue(145);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        myMinHeap.insert(3);
        myMinHeap.insert(4);
        myMinHeap.insert(7);
        myMinHeap.insert(8);
        myMinHeap.insert(32);

        System.out.println(myMinHeap.getMin());
        System.out.println(myMinHeap.extractMin());
        System.out.println(myMinHeap.extractMin());






        }
}
