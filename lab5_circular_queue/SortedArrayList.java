// SortedArrayList.java
// fall 2025
// prof. lehman
//
// demonstrates sorted list 
// using int array
//
class SortedArrayList {

    // data
    private int[] arr;
    private int size;

    public SortedArrayList(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int value) {

        // start index i at the end of the array
        int i = size - 1;

        // shift elements right to find correct position
        while (i >= 0 && arr[i] > value) {
            arr[i + 1] = arr[i];
            i--;
        }

        // set the new value and adjust size
        arr[i + 1] = value;
        size++;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++)
            result += arr[i] + " ";
        return result;
    }
}
