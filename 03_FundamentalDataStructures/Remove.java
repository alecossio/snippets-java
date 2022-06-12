import java.util.Random;

public class Remove {
    static Random rd = new Random();
    
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Provide args");
            return;
        }
        
        rd.setSeed(System.currentTimeMillis());
        int actualSize = args.length;
        while(actualSize > 0){
            int i = rd.nextInt(args.length);
            if(args[i] != null){
                System.out.println("taking out: " + args[i]);
                args[i] = null;
                actualSize--;
                System.out.println("current array is: " + java.util.Arrays.toString(args));
                System.out.println("current size: " + actualSize);
            }

        }
    }
}
