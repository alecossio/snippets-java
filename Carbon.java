import java.util.ArrayList;

public class Carbon {
    public static ArrayList<Character> input = new ArrayList<>();
    static {
        input.add('c');
        input.add('a');
        input.add('r');
        input.add('b');
        input.add('o');
        input.add('n');
    }

    public static void main(String[] args) {
        Carbon app = new Carbon();
        app.run();
    }

    public void swap(ArrayList<Character> input, Integer a, Integer b) {
        Character temp;
        temp = input.get(a);
        input.set(a, input.get(b));
        input.set(b, temp);
    }

    public void run() {
        for(int i = 0; i<input.size(); i++)
            for(int j=0; j<input.size(); j++)
                if(j!=i){
                    swap(input, i, j);
                    System.out.println(input);
                }
    }
}