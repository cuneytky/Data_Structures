public class HeapApp {
    public static void main(String[] args) {
        MyHeap heap=new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        System.out.println("Heap values after last element 81");
        heap.printHeap();      //120, 81, 52, 45, 61,

        heap.remove();
        System.out.println("Heap values after removing 120");
        heap.printHeap();      // 81, 61, 52, 45,

        heap.insert(130);
        System.out.println("Heap values after adding 130");
        heap.printHeap();      // 130, 81, 52, 45, 61,

        heap.remove();
        heap.printHeap();     // 81, 61, 52, 45,
        int[] numbers={1,2,5,6,8,21,0};
    }
}
