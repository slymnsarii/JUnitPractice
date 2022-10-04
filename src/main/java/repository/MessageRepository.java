package repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageRepository {
    //database'im bu list olsun
    private List<String> list=Arrays.asList("hello","mockito","cok guzel");

    public void addMassage(String  message){
        list.add(message);
        //burasi list'e ekleme yapilan deger, yani database create ettigim yer

    }

}
