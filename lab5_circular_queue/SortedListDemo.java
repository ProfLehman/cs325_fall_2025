import java.util.Random;

public class SortedListDemo {
    public static void main(String[] args) {
        int numItems = 20000;          // Adjust for demo
        int maxValue = 100000;
        Random rand = new Random();

        SortedArrayList arrayList = new SortedArrayList(numItems);
        SortedLinkedList linkedList = new SortedLinkedList();

        // ---- Array insertion ----
        long start = System.nanoTime();
        for (int i = 0; i < numItems; i++) {
            arrayList.insert(rand.nextInt(maxValue));
        }
        long end = System.nanoTime();
        System.out.printf("Array insert time: %.3f ms%n",
                          (end - start) / 1_000_000.0);

        // ---- Linked list insertion ----
        start = System.nanoTime();
        for (int i = 0; i < numItems; i++) {
            linkedList.insert(rand.nextInt(maxValue));
        }
        end = System.nanoTime();
        System.out.printf("Linked list insert time: %.3f ms%n",
                          (end - start) / 1_000_000.0);
    }
}
