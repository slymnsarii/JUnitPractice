package JUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J05TestPractice {

    @ParameterizedTest
    @ValueSource(strings = {"qwert","wert","null","qwe"})
    void testLength(String str){
        assertTrue(str.length()>0); //0'dan buyuk olan length'leri test ediyor
    }
    //ValueSource'da hepsini ayri ayri aliyoruz, CsvSource'da ise virgulle ayirarak aliyoruz degerleri
    @ParameterizedTest
    @CsvSource(value = {"true,junit,u","false,mvc,z"})//junit'in icinde u diye bir deger var ve dogru
    //coma-seperated values annjotations
    //Csv annot'u 3 degeri contains method'u mantigi ile test eder
    @DisplayName("Csv DisplayName ile verildi")
    void testCsvSource(Boolean b,String s1,String s2){
        assertEquals(b,s1.contains(s2));
    }
    @RepeatedTest(10)
    @Disabled //ignore gibi bosver salla gormezden gel anlaminda
    void testRepeat(){
        String [] arr= {"hibernate", "mvc", "boot", "junit", "mongodb"};
        //assertEquals("mvc","mvc spring bir framework".substring(0,3));
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[0],arr[i]); //test gecmez cunku beklenen hibernate, actual mvc..
                                        // Calismasi icin her degerin ayni olmasi lazim
                                    //her seferinde 0.index(hibernate) ile butun indexleri karsilastiriyor
            
        }
    }



}
