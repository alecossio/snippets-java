import java.util.Scanner;
import java.util.ArrayList;

public class Reverse {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();


    public static void main(String[] args) {
       Reverse app = new Reverse();
        app.run(args);
    }

    public void run(String[] args) {
        
        while(scan.hasNextLine())
            lines.add(scan.nextLine());
        
        for(int i = lines.size() - 1; i>= 0; i--)
            System.out.println(lines.get(i));
    }
}
