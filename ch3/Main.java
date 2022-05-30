public class Main {
    private SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();

    public static void main(String[] args) {
        Main t = new Main();
        t.run(args);
    }

    public void run(String[] args) {
        singlyLinkedList.addLast("Hello");
        singlyLinkedList.addLast("how");
        singlyLinkedList.addLast("r");
        singlyLinkedList.addLast("you");
        String t = "";
        
        t = singlyLinkedList.get(Integer.parseInt(args[0]));
        System.out.println(t);

    
    }
}
