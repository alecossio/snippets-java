package Progression;

public class TestProgression {

    public static void find() {
        Progression prog = new FibonacciProgression(2,2);

        for(int i = 1; i<=6; i++){
            prog.advance();
        }
        System.out.println(prog.current);
    }

    public static void main(String[] args) {
        
        Progression prog;

        System.out.println("Default fibonacci:");
        prog = new FibonacciProgression();
        prog.printProgression(10);

        System.out.println("4 - 6 fibonacci:");
        prog = new FibonacciProgression(4, 6);
        prog.printProgression(8);

        System.out.println("finding: ");
        find();
    }
}
