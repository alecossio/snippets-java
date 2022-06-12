import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CircularlyLinkedListTest {
    @Test
    public void rotateTest(){
        CircularlyLinkedList<String> CLL = new CircularlyLinkedList<>();
        CLL.addLast("A");
        assertEquals("A", CLL.last());
        CLL.addLast("B");
        assertEquals("B", CLL.last());
        CLL.addLast("C");
        assertEquals("C", CLL.last());
        CLL.addLast("D");
        assertEquals("D", CLL.last());
        CLL.rotate();
        assertEquals("A", CLL.last());
        CLL.rotate();
        assertEquals("B", CLL.last());
        CLL.rotate();
        assertEquals("C", CLL.last());
        CLL.rotate();
        assertEquals("D", CLL.last());
    }
    
    @Test
    public void getTest(){
        CircularlyLinkedList<String> CLL = new CircularlyLinkedList<>();
        CLL.addLast("A");
        CLL.addLast("B");
        CLL.addLast("C");
        CLL.addLast("D");
        assertEquals("C", CLL.get(2));
    }

    @Test
    public void removeFirstTest(){
        CircularlyLinkedList<String> CLL = new CircularlyLinkedList<>();
        CLL.addFirst("A");
        CLL.addFirst("B");
        assertEquals("B", CLL.removeFirst());
        CLL.addFirst("B");
        CLL.addFirst("C");
        assertEquals("C", CLL.removeFirst());
        assertEquals(2, CLL.size());
    }

    @Test
    public void calculateSizeTest(){
        CircularlyLinkedList<String> CLL = new CircularlyLinkedList<>();
        CLL.addLast("A");
        CLL.addLast("B");
        CLL.addLast("C");
        CLL.addLast("D");
        assertEquals(CLL.calculateSize(), 4);
    }

    @Test
    public void testEquals(){
        CircularlyLinkedList<String> CLL = new CircularlyLinkedList<>();
        CLL.addLast("A");
        CLL.addLast("B");
        CLL.addLast("C");
        CLL.addLast("D");
        CircularlyLinkedList<String> CLL2 = new CircularlyLinkedList<>();
        CLL2.addLast("A");
        CLL2.addLast("B");
        CLL2.addLast("C");
        CLL2.addLast("D");
        assertTrue(CLL.equals(CLL2));
        CLL2.rotate();
        assertTrue(!CLL.equals(CLL2));
        CircularlyLinkedList<String> CLL3 = new CircularlyLinkedList<>();
        CLL3.addLast("A");
        CLL3.addLast("B");
        CLL3.addLast("C");
        CLL3.addLast("D");
        CLL3.addLast("D");
        assertTrue(!CLL.equals(CLL3));
    }
}
