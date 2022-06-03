import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircularDoublyLinkedListTest {
    @Test
    public void testFirst(){
        CircularDoublyLinkedList<String> CDLL = new CircularDoublyLinkedList<>();
        CDLL.addFirst("A");
        CDLL.addFirst("B");
        CDLL.addFirst("C");
        CDLL.addFirst("D");
        assertEquals(CDLL.first(), "D");
    }

}
