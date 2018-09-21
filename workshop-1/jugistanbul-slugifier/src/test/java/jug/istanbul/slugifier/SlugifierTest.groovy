package jug.istanbul.slugifier

import org.junit.Test

import static org.junit.Assert.assertEquals

public class SlugifierTest {
    @Test
    void testRun() {
        String slugifiedText = Slugifier.run("Lenovo Y520 i7-7700HQ 16GB 1TB+256SSD GTX1050 Win10 80WK004JTX");
        assertEquals("", slugifiedText);

    }

    void testConvertCharactersFromTurkishToEnglish() {
    }
}
