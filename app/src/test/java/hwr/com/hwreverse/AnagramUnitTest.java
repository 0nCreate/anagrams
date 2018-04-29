package hwr.com.hwreverse;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AnagramUnitTest {
    @Test
    public void oneWord() throws Exception {
        assertEquals("ytrewq", Anagrams.reverseIgnoreNotLiteral("qwerty"));
    }

    @Test
    public void fewWords() {
        assertEquals("ytrewq owt sdrow", Anagrams.reverseIgnoreNotLiteral("qwerty two words"));
    }
}