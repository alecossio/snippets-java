public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }

    public void run() {
        Triangle t = new Triangle(3.0, 3.0, 3.0);
        System.out.println(t.area());
        System.out.println(t.perimeter());
    }
}
