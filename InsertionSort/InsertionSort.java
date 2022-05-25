public class InsertionSort {
    public void print(int[] A){
        System.out.print("[ ");
        for(int a : A){
            System.out.print(a+", ");
        }
        System.out.println(" ]");
    }
    
    public void sort(int[] A){
        int t;
        for(int i=0; i<A.length; i++){
            t = A[i];
            int j;
            for(j = i+1; j < A.length; j++){
                if(A[j] < t){
                    A[j-1] = A[j];
                }else{
                    break;
                }
            }
            A[j-1] = t;
        }
        
    }
}
