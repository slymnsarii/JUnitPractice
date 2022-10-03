package JUnit;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class J03TestPractice {

    @BeforeAll
    static void beforeAll(TestInfo info){
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");
    }

    @AfterAll
    static void afterAll(TestInfo info){
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");
    }

    @Test
    void testArray(TestInfo info){ //test'te static kullanamazsın cunku baska yere gitmez
        String str = "hibernate mvc boot junit mongodb";
        String [] actualArr=str.split(" ");
        String [] expectedArr= {"hibernate", "mvc", "boot", "junit", "mongodb"};

        assertArrayEquals(expectedArr,actualArr,"array eslesmedi");
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");

    }

}
