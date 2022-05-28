public class TestSLL {
    private SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();

    public static void main(String[] args) {
        TestSLL t = new TestSLL();
        t.run();
    }

    public void run() {
        singlyLinkedList.addFirst("Hello");
        singlyLinkedList.addFirst("how");
        singlyLinkedList.addFirst("r");
        singlyLinkedList.addFirst("you");
        String t = "";
        while( t != null){
            System.out.println(t);
            t = singlyLinkedList.removeFirst();
        }
    }
}
