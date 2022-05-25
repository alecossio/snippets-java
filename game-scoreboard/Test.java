import java.util.Scanner;

public class Test {
    Scanner scan = new Scanner(System.in);
    String name;
    int points, index;
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
        do{
            System.out.println("Enter index to remove: ");
            index = scan.nextInt();
            System.out.println("Entry removed: " + scoreboard.remove(index));
            System.out.println(scoreboard.toString());
            System.out.println("Remove another?");
        }while(scan.next().equals("y"));
    }
}
