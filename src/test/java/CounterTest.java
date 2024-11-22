import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    public void testAddLineIncreasesLineCount() {
        Counter counter = new Counter();
        counter.addLine("Hello");
        counter.addLine("World");
        assertEquals(2, counter.getLineCount(), "Line count should be 2 after adding two lines.");
    }

    @Test
    public void testAddLineCountsCharactersCorrectly() {
        Counter counter = new Counter();
        counter.addLine("Hello");
        counter.addLine("World!");
        assertEquals(11, counter.getCharCount(), "Character count should be 11 (5 for 'Hello' + 6 for 'World!').");
    }

    @Test
    public void testEmptyLinesAreHandled() {
        Counter counter = new Counter();
        counter.addLine("");
        counter.addLine("Non-empty line");
        assertEquals(2, counter.getLineCount(), "Line count should still include empty lines.");
        assertEquals(13, counter.getCharCount(), "Character count should be 13 (0 for empty + 13 for 'Non-empty line').");
    }
    @Test
    public void testEmptyLineDoesNotChangeLongestWord() {
        Counter counter = new Counter();
        counter.addLine("Word");
        counter.addLine("");
        counter.addLine("AnotherWord");

        assertEquals("AnotherWord", counter.getLongestWord(), "The longest word should remain 'AnotherWord'.");
    }
}
