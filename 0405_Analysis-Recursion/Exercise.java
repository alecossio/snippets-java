import java.io.File;
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
            for(j = i; j > 0; j--){
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

    public static int sumOfFirstN(int[] A, int n){
        if(n == 0)
            return 0;
        else
            return sumOfFirstN(A, n-1) + A[n-1];
    }

    public static void reverseSequence(int[] A, int lowIndex, int highIndex){
        int t;
        if(lowIndex >= highIndex)
            return;
        t = A[lowIndex];
        A[lowIndex] = A[highIndex];
        A[highIndex] =  t;
        reverseSequence(A, lowIndex+1, highIndex-1);
    }

    public static double power(double x, int n){
        if(n == 0)
            return 1;
        else return x*power(x, n-1);
    }

    public static double power2(double x, int n){
        if(n == 0)
            return 1;
        double t = power(x, n/2);
        if(n % 2 == 1)
            return x*t*t;
        return t*t;
    }

    public static long diskUsage(String path){
        File currentFile = new File(path);
        String[] contents = currentFile.list();
        long currentSize = 0;
        for(String filePath : contents){
            File newFile = new File(path, filePath);
            if(newFile.isDirectory()){
                currentSize += diskUsage(newFile.getAbsolutePath());
            }
            else{
                currentSize += newFile.length();
            }
        }
        return currentSize;
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
        System.out.println("size:");
        System.out.println(diskUsage("c:\\tmptest\\"));
        int[] input5 = {1,2,3,4,5,6,7,8,9};
        System.out.println("sum: " + sumOfFirstN(input5, 3));
        
        System.out.println(Arrays.toString(input5) + " => rev => " );
        reverseSequence(input5, 0, input5.length-1);
        System.out.println(Arrays.toString(input5));

        System.out.println(power(9.0, 3));
        System.out.println(power2(9.0, 3));
        System.out.println(power(9.0, 27));

    }
}
