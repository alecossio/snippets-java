import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] A = new int[5];
        Random rd = new Random();
        rd.setSeed(System.currentTimeMillis());
        for(int i=0; i < A.length; i++){
            A[i] = rd.nextInt(10);
        }
        
        Integer[] B = new Integer[A.length];
        int index = 0;
        
        //this is wrong:

        for(int a : A){
            do{
                index = rd.nextInt(A.length);
            }while(B[index] != null);
            B[index] = a;
            
        }
        System.out.println(java.util.Arrays.toString(A));
        System.out.println(java.util.Arrays.toString(B));
        
    }
}
