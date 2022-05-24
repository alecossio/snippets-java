
import java.util.ArrayList;

public class Display {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PINK = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_CLEAR = "\033[H\033[2J";
    public static final String ANSI_HOME = "\033[H";
    public static final String CUR_UP = "\033[A";
    public static final String CUR_DOWN = "\033[B";
    public static final String CUR_LEFT = "\033[D";
    public static final String CUR_RIGHT = "\033[C";
    public static final Integer SIZE_X = 50;
    public static final Integer SIZE_Y = 50;

    public static void clear() {
        System.out.println(ANSI_RESET);
    }

    public static void show(River river) {
        ArrayList<Spot> places = river.getPlaces();
        System.out.print("[");
        for(Spot place : places){
            System.out.print(place);
        }
        System.out.println("]");
    }

    public static void update(River river) {
        ArrayList<Animal> animals = river.getAnimals();
/*         for(Animal animal : animals){
            animal.move();
        } */
        for(int i = 0; i<animals.size(); i++){
            animals.get(i).move();
        }
    }
}
