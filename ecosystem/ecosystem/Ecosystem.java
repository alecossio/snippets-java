
import java.util.concurrent.TimeUnit;

public class Ecosystem {

    public static final Integer BEAR_PROB = 10;
    public static final Integer FISH_PROB = 23;
    public static final Integer RIVER_SIZE = 50;

    River river = new River(RIVER_SIZE);
    
    public static void main(String[] args) {
        Ecosystem system = new Ecosystem();    
        system.run();
    }

    public void run() {
        Display.clear();
        while(true){
            Display.show(river);
            river.setPlaces();
            Display.update(river);
            try{
                TimeUnit.SECONDS.sleep(3);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
