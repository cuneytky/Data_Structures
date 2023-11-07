public class JumpSearch {
    public static void main(String[] args) {
        int[] numbers=new int[30];
        for (int i = 0; i < 30; i++) {
            numbers[i]=i;
        }
        System.out.println(jumpSearch(numbers,24));// 24
        System.out.println(jumpSearch(numbers,31));// -1
    }
    public static int jumpSearch(int[] array, int data){
        int blockSize=(int)Math.sqrt(array.length);// array uzunluğunun kököünü alıp blok uzunluğunu belirledik
        int start=0;
        int next=blockSize;
        while (start< array.length && array[next-1]<data){
            start=next;
            next+=blockSize;
            if (next> array.length) next= array.length;
        }
        for (int i = start; i <next ; i++) {
            if (array[i]==data) return i;
        }
        return -1;
    }
}
