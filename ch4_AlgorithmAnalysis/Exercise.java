import java.util.Arrays;

public class Exercise {
    public static boolean unique(int[] data){
        int n = data.length;

        for(int j = 0; j < n-1; j++)
            for(int k = j+1; k < n; k++){
                System.out.println(j + " ; " + k);
                if(data[j] == data[k])
                    return false;
            }
        return true;
    }

    public static double[] prefixAvg(double[] x){
        int n = x.length;
        double[] a = new double[n];
        double prefixSum = 0;
        for(int i = 0; i < n; i++){
            prefixSum += x[i];
            a[i] = prefixSum / (i+1);
        }
        return a;
    }

    public static void insertionSort(int[] A){
        int t;
        for(int i = 1; i< A.length; i++){
            t = A[i];
            int j;
            for(j = i; j >0; j--){
                if(A[j - 1] > t)
                    A[j] = A[j-1];
                else
                    break;
            }
            A[j] = t;
        }
    }

    public static int binarySearch(int[] A, int low, int high, int target){
        int mid = (low + high)/2;
        if(low > high)
            return -1;
        else if(A[mid] == target)
            return mid;
        else if(A[mid] < target)
            return binarySearch(A, mid+1, high, target);
        else
            return binarySearch(A, low, mid-1, target);
    }

    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5,6,7,8,9};
        int[] input2 = {1,2,3,4,5,6,7,8,1};
        if(unique(input1))
            System.out.println("OK 1");
        if(unique(input2))
            System.out.println("OK 2");
        
        double[] input3 = {1, 2, 3};
        System.out.println(Arrays.toString(prefixAvg(input3)));

        int[] input4 = {7,5,7,1,5,9,6};
        System.out.println(Arrays.toString(input4));
        insertionSort(input4);
        System.out.println(Arrays.toString(input4));
        System.out.println(binarySearch(input4, 0, input4.length, 6)); 
    }
}
