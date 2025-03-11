package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferTest {

    @Test
    void testGenerateDiffWhenFilesAreEqual() throws Exception {
        String path1 = "./src/test/resources/test1.json";
        String path2 = "./src/test/resources/test2.json";

        String expected = "{\n" + "    host: hexlet.io\n" + "    timeout: 20\n" + "    verbose: true\n" + "}";
        String diff = Differ.generate(path1, path2);

        assertEquals(expected, diff);
    }

    @Test
    void testGenerateDiffWhenFilesAreNotEqual() throws Exception {
        String path1 = "./src/test/resources/test3.json";
        String path2 = "./src/test/resources/test4.json";

        String expected = "{\n" + "    host: hexlet.io\n" + "    verbose: true\n" + "  + timeout: 20\n" + "}";
        String diff = Differ.generate(path1, path2);

        assertEquals(expected, diff);


    }
}
