public class DotProduct {
    
    public static void main(String[] args) {

        int[] a = {3, 3, 3, 3};
        int[] b = {4, 4, 4, 4};
        int[] c = new int[4];

        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                c[i] = a[i] * b[i];
                System.out.print(c[i] + " : ");
            }
        }
    }
}
