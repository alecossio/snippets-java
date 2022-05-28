public class TestSLL {
    private SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();

    public static void main(String[] args) {
        TestSLL t = new TestSLL();
        t.run();
    }

    public void run() {
        singlyLinkedList.addFirst(new Node("Hello"));
    }
}
