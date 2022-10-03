package JUnit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J01TestPractice {
    //task : length'i trst eden test method yaziniz

    @Test
    void testLength(){
        int actualLength="Merhaba".length();
        int expectedLenth=9;
        //assertEquals(expectedLenth,actualLength);
        assertEquals(expectedLenth,actualLength,"Test gecmedi");

        //assertTrue
        //assertFalse
        //ile de yap
    }

    @Test
    void testUpperCase(){
        String actualValue="Merhaba".toUpperCase(); //MERHABA
        String expectedValue="MERHABA";
        assertEquals(actualValue,expectedValue,"Test gecmedi");
    }

    //task contains methodu ile test yaziniz
    @Test
    void testContains(){
        assertEquals(false,"Junit".contains("z"));
    }

    @Test
    void testFindMin(){
        assertEquals(15.8,Math.min(15.8,25.6));
    }

    //task : String bir objeyi array'e cevirip, string'in yeni create ettiginiz array ile
    //       uyusup uyusmadigini kontrol ediniz

    @Test
    void testArray() {
        String str = "hibernate mvc boot junit mongodb";
        String [] actualArr=str.split(" ");
        String [] expectedArr= {"hibernate", "mvc", "boot", "junit", "mongodb"};

        assertTrue(Arrays.equals(expectedArr,actualArr));

    }
}
