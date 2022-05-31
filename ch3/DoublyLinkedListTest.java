import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DoublyLinkedListTest {
    
    @Test
    public void addLastTest(){
        DoublyLinkedList<String> DLL = new DoublyLinkedList<>();
        DLL.addLast("A");
        DLL.addLast("B");
        DLL.addLast("C");
        DLL.addLast("D");
        assertEquals("D", DLL.last());
        assertEquals("D", DLL.removeLast());
        assertEquals("C", DLL.removeLast());
    }
    
    @Test
    public void revGetTest(){
        DoublyLinkedList<String> DLL = new DoublyLinkedList<>();
        DLL.addLast("A");
        DLL.addLast("B");
        DLL.addLast("C");
        DLL.addLast("D");
        assertEquals("A", DLL.get(0));
        assertEquals("B", DLL.get(1));
        assertEquals("C", DLL.get(2));
        assertEquals("D", DLL.get(3));
    }
}
