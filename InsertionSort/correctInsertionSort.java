public class correctInsertionSort {

    InsertionSort insertionSort = new InsertionSort();

    public void sort(int[] A) {
        for(int i =1; i<A.length; i++){
            int t = A[i];
            int j = i;
            while(j >0 && A[j-1] > t){
                insertionSort.print(A);
                A[j] = A[j - 1];
                j--;
            }
            A[j] = t;
        }
    }

    public void sort2(int[] A) {
        for(int i = 1; i < A.length; i++) {
            int t = A[i];
            int j;
            for(j = i; j>0; j--){
                if(A[j-1] > t){
                    insertionSort.print(A);
                    A[j] = A[j - 1];
                }
            }
            A[j] = t;
        }
    }

    public void sortOriginal(int[] data){
        int n = data.length;
        for (int k = 1; k < n; k++) {
            // begin with second character
            int cur = data[k];
            // time to insert cur=data[k]
            int j = k;
            // find correct index j for cur
            while (j > 0 && data[j-1] > cur) {
                // thus, data[j-1] must go after cur
                data[j] = data[j-1];
                // slide data[j-1] rightward
                j--;
            // and consider previous j for cur
             }
            data[j] = cur;
        // this is the proper place for cur

        }
    }

    public void mySort(int[] A){
        int t;
        for(int i=1;i<A.length;i++){
            t = A[i];
            int j;
            for(j = i; j > 0 && A[j-1] > t; j--){
                A[j] = A[j - 1];
            }
            A[j] = t;

        }
    }
}
