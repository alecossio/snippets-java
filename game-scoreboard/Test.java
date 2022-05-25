import java.util.Scanner;

public class Test {
    Scanner scan = new Scanner(System.in);
    String name;
    int points;
    GameEntry e;
    Scoreboard scoreboard = new Scoreboard(5);

    public static void main(String[] args) {
        Test t = new Test();
        t.run();
    }

    public void run() {
        String select;
        System.out.println("Running...");
        do{
            System.out.println("Input name: ");
            name = scan.next();
            System.out.println("Enter points: ");
            points = scan.nextInt();
            e = new GameEntry(name, points);
            scoreboard.add(e);
            System.out.println(scoreboard.toString());
            System.out.println("Enter more? y/n");
            select = scan.next();
        }while(select.equals("y"));
    }
}
