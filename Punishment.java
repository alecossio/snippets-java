import java.util.Random;

public class Punishment {
    
    static Random rd = new Random();

    public static final String message = "I will never spam my friends again.";
    public static Integer errorCounter = 0;


    public static void main(String[] args){
        for(int i=1; i<=100; i++) {
            if(rd.nextInt(101) > 90 && errorCounter < 8) {
                Integer cutPoint = rd.nextInt(message.length() - 1);
                String message2 = message.substring(0, cutPoint) + (char)(34 + rd.nextInt(92)) + message.substring(cutPoint +1);
                System.out.println("[ERROR]");
                System.out.println(i + " " + message2);
                errorCounter++;
            }
            System.out.println(i + " " + message);
        }
        System.out.println("Total err count: " + errorCounter);
    }

}
