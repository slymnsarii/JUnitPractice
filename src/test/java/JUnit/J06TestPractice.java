package JUnit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J06TestPractice {

    @Nested
    class nestedTest{
        @ParameterizedTest
        @CsvSource(value = {"27,9,3","-21,-7,3"})
        //method'a ParameterizedTest annot'u araciligi ile bu parametreli value olarak verir
        void carpSonuc(int sonuc,int x, int y){
            assertEquals(sonuc, Math.multiplyExact(x,y));//math class'ina git x*y yap sonuca esit mi diye bak
        }

        @ParameterizedTest
        @CsvSource(value = {"0,9,0","0,0,3"})
        void sonucSifir(int sonuc,int x, int y){
            assertEquals(sonuc, Math.multiplyExact(x,y));//math class'ina git x*y yap sonuca esit mi diye bak
        }
    }

}
