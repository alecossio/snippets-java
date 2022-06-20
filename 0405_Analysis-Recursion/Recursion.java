public class Recursion {
    public static int findMaxRecursive(int[] A, int candidate, int last){
        if(last == 0)
            return A[0];
        else if (A[last] > candidate)
            return A[last];
        else
            return 0;

    }
    public static int findMaxRecursive(int[] A){
        return findMaxRecursive(A, 0, A.length-1);
    }
    public static int convert(char[] A, int index){
        if(A[index] < 0x30 || A[index] > 0x39)
            throw new IllegalArgumentException("char array cannot contain non-number");
        int current_num = A[index] - 0x30;
        int current_exp = A.length - 1 - index;
        if(index == A.length - 1)
            return current_num;
        return (int)Math.pow(10, current_exp) * current_num + convert(A, index + 1);
    }
    public static int convert(char[] A){
        return convert(A, 0);
    } 
    public static double powerNonRecursive(double x, int n){
        double result = 1;
        int i = n;
        while(i >= 1){
            if(i % 2 == 1)
                result *=x;
            i /= 2;
            x = x*x;
        }
        return result;
    }
    public static double powerIterative(double x, int n){
        double res = 1;
        while(n > 0){
            if(n % 2 == 1)
                res = res * x;
            n = n / 2;
            x = x * x;
        }
        return res;
    }
    public static long matrixSum(int[][] A, int i, int j){
        long ret;
        if(j == A[0].length-1){
            if(i == A.length-1)
                return A[A.length-1][A[0].length-1];
            i++;
            j = 0;
        }else{
            j++;
        }
        ret = A[i][j] + matrixSum(A, i, j);
        return ret;
    }
    public static int log2(double n, int x){
        n = n/2;
        if(n <= 1)
            return x;
        x++;
        return log2(n, x);
    }
    public static int multiply(int x, int y){
        while(y > 0){
            y--;
            return x + multiply(x, y);
        }
        return 0;
    }
    
    public static void main(String[] args) {
 

    }
}

