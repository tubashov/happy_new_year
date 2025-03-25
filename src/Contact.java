// дополните объявление класса Contact
public abstract class Contact {
    // класс должен содержать одно полe — имя пользователя name
    String name;

    // и два три метода — getName(), sendMessage() для отправки сообщения и print() для печати информации о контакте
    public abstract void getName();
    public abstract void sendMessage();
    public abstract void print();
}