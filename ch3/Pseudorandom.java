public class Pseudorandom {
    
    public static void random(int cur, int a, int b, int n, int i){
        if(i<=0)
            return;
        int next = (a * cur + b) % n;
        System.out.println(next);     
        random(next, a, b, n, i-1);
    }
    
    public static void main(String[] args) {
     
        int a = 12;
        int b = 5;
        int n = 100;
        int cur = 92;

        random(cur, a, b, n, 5);
    }
}
