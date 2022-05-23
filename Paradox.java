import java.util.Random;
import java.util.ArrayList;

public class Paradox {
    Random rd = new Random();
    ArrayList<Integer> birthdays = new ArrayList<>();
    ArrayList<Integer> sizes = new ArrayList<>();

    public static void main(String[] args) {
        Paradox app = new Paradox();

        app.run();
    }

    public void run() {
        for(int i = 5; i <= 100; i += 5)
            sizes.add(i);
        Integer matches = 0;
        for(Integer size : sizes){
            for(int i = 0; i < size; i++){
                birthdays.add(rd.nextInt(364));
            }
            for(int i = 0; i < birthdays.size(); i++){
                for(int j = i + 1; j < birthdays.size(); j++){
                    if(i != j){
                        if(birthdays.get(i) == birthdays.get(j)){
                            matches++;
                        }
                    }
                }
            }
            System.out.println("For size = " + size + ", amount of matches is = " + matches);
            System.out.println("Probability = " + (double)matches/(double)size);
        }
        
    }
}
