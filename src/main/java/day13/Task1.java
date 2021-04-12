package day13;

import javax.jws.soap.SOAPBinding;

public class Task1 {
    public static void main(String[] args) {

        User leha = new User("Leha");
        User vlad = new User("Vlad");
        User anna = new User("Anna");

        leha.sendMessage(vlad, "Привет");
        leha.sendMessage(vlad, "Как дела?");
        vlad.sendMessage(leha, "Здарова");
        vlad.sendMessage(leha, "Все отлично");
        vlad.sendMessage(leha, "Как и всегда");
        anna.sendMessage(leha, "Доброе утро");
        anna.sendMessage(leha, "Что там с отчетом?");
        anna.sendMessage(leha, "Жду со вчерашнего вечера");
        leha.sendMessage(anna, "Привет, совсем забыл");
        leha.sendMessage(anna, "Извини");
        leha.sendMessage(anna, "Сейчас вышлю");
        anna.sendMessage(leha, "Ок, давай");

        MessageDatabase.showDialog(leha, vlad);
        MessageDatabase.getMessages();

    }
}
