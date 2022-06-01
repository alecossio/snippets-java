public class DoublyDebug {
    public static void main(String[] args) {
    DoublyLinkedList<String> DLL = new DoublyLinkedList<>();

    DLL.addLast("A");
    DLL.addLast("B");
    DLL.addLast("C");
    DLL.addLast("D");

    System.out.println(DLL.get(1));
    }
}
