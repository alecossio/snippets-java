import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
    
    }

    @Test
    public void getTest(){
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

    @Test
    public void equalsTest(){
        DoublyLinkedList<String> CLL = new DoublyLinkedList<>();
        CLL.addLast("A");
        CLL.addLast("B");
        CLL.addLast("C");
        CLL.addLast("D");
        DoublyLinkedList<String> CLL2 = new DoublyLinkedList<>();
        CLL2.addLast("A");
        CLL2.addLast("B");
        CLL2.addLast("C");
        CLL2.addLast("D");
        assertTrue(CLL.equals(CLL2));
        
        
        DoublyLinkedList<String> CLL3 = new DoublyLinkedList<>();
        CLL3.addLast("A");
        CLL3.addLast("B");
        CLL3.addLast("C");
        CLL3.addLast("D");
        CLL3.addLast("D");
        assertTrue(!CLL.equals(CLL3));
    }
}
