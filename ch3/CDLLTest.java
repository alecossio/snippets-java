import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CDLLTest {
    @Test
    public void testSize(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addFirst("A");
        assertEquals(1,cdll.size());
        cdll.addFirst("A");
        cdll.addFirst("A");
        assertEquals(3,cdll.size());
    }
    @Test
    public void testAddFirst(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addFirst("A");
        assertEquals("A",cdll.first());
        cdll.addFirst("B");
        assertEquals("B",cdll.first());
    }
    @Test
    public void testAddLast(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addLast("A");
        assertEquals("A",cdll.last());
        cdll.addLast("B");
        assertEquals("B",cdll.last());
    }
    @Test
    public void testRemoveFirst(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addLast("A");
        assertEquals("A", cdll.removeFirst());
        assertEquals(0, cdll.size());
    }
    @Test
    public void testRemoveLast(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addLast("A");
        cdll.addLast("B");
        assertEquals("B", cdll.removeLast());
        assertEquals(1, cdll.size());
    }
    @Test
    public void testRotateLeft(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addLast("A");
        cdll.addLast("B");
        cdll.addLast("C");
        assertEquals("A", cdll.first());
        cdll.rotateLeft();
        assertEquals("B", cdll.first());
    }
    @Test
    public void testRotateRight(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addLast("A");
        cdll.addLast("B");
        cdll.addLast("C");
        assertEquals("A", cdll.first());
        cdll.rotateRight();
        assertEquals("C", cdll.first());
    }
    @Test
    public void testGetLeft(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addLast("A");
        cdll.addLast("B");
        cdll.addLast("C");
        assertEquals("C", cdll.getLeft(2));
    }
    @Test
    public void testGetRight(){
        CDLL<String>cdll = new CDLL<>();
        cdll.addLast("A");
        cdll.addLast("B");
        cdll.addLast("C");
        assertEquals("B", cdll.getRight(2));
    }
}
