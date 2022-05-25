public class InsertionSort {
    public void print(int[] A){
        System.out.print("[ ");
        for(int a : A){
            System.out.print(a+", ");
        }
        System.out.println(" ]");
    }
    
    public void sort(int[] A){
        for(int i=0; i<A.length; i++){
            for(int j = 1; j < A.length; j++){
                if(A[j] < A[i]){
                    A[j-1] = A[j];
                }else{
                    A[j] = A[i];
                    break;
                }
            }
        }
        
    }
}
