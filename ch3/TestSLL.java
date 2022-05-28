public class TestSLL {
    private SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();

    public static void main(String[] args) {
        TestSLL t = new TestSLL();
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
