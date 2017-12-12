import org.junit.Test;
import static org.junit.Assert.*;
import enigma.Alphabet;

public class AlphabetTest {
    
    public AlphabetTest() {
    }
    
    @Test
    public void lengthTest() {
        Alphabet a = new Alphabet("ABCDE");
        assertEquals(5, a.length());
    }
    
}
