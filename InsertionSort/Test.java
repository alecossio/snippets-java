public class Test {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] A = {9,7,5,3,1};

        insertionSort.sort(A);
        insertionSort.print(A);
    }
}
