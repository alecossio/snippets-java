import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SinglyLinkedListTest{
    private SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();

    public SinglyLinkedListTest() {
        singlyLinkedList.addLast("Hello");
        singlyLinkedList.addLast("how");
        singlyLinkedList.addLast("r");
        singlyLinkedList.addLast("you");
    }
    
    @Test
    public void testSize(){
        assertEquals(singlyLinkedList.size(), 4);
    }
    @Test
    public void testFirst(){
        assertTrue(singlyLinkedList.first().equals("Hello"));
    }
    @Test
    public void testLast(){
        assertTrue(singlyLinkedList.last().equals("you"));
    }   
    @Test
    public void testAddFirst(){
        singlyLinkedList.addFirst("Mister,");
        assertTrue(singlyLinkedList.first().equals("Mister,"));
        assertEquals(singlyLinkedList.size(), 5);
    }
    @Test
    public void testAddLast(){
        singlyLinkedList.addLast("today");
        assertTrue(singlyLinkedList.last().equals("today"));
    }
    @Test
    public void testRemoveFirst(){
        singlyLinkedList.addFirst("Test");
        assertTrue(singlyLinkedList.removeFirst().equals("Test"));
    }
    @Test
    public void testGet(){
        assertTrue(singlyLinkedList.get(0).equals("Hello"));
        assertTrue(singlyLinkedList.get(1).equals("how"));
        assertTrue(singlyLinkedList.get(2).equals("r"));
        assertTrue(singlyLinkedList.get(3).equals("you"));
    }
}
