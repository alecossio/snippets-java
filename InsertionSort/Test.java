public class Test {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        correctInsertionSort correctInsertionSort = new correctInsertionSort();

        int[] A = {9,7,5,3,1};

        //insertionSort.sort(A);
        insertionSort.print(A);
        System.out.println("sorting: ");
        correctInsertionSort.mySort(A);
        insertionSort.print(A);

    }
}
