package service;

import repository.MessageRepository;

public class MessageService {

    //bu class'da repository'e erisim method'lari yazilir yani business logic yapildigi yer
    //test'i yapilacak class burasidir
    private MessageRepository repository;

    public MessageService(MessageRepository repository){
        this.repository=repository;
    }


    public void addMessage(String message){//esas test edecegim yer bu method'un calisip calismadigi

        repository.addMassage(message);//iste test'te test edilecek kisim tam olarak burasi
    }

}
