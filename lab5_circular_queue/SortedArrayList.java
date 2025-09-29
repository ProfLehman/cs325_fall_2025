class SortedArrayList {
    private int[] arr;
    private int size;

    public SortedArrayList(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size >= arr.length) throw new RuntimeException("Array full");
        int i = size - 1;
        // Shift elements to find correct position
        while (i >= 0 && arr[i] > value) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = value;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
