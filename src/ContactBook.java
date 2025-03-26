import java.util.ArrayList;
import java.util.List;

// ограничьте класс ContactBook так, чтобы он мог хранить в себе только список контактов
class ContactBook<T> extends Contact {
    // объявите поле класса contacts — список контактов книги
    Contact contact;
    List<T> contacts = new ArrayList<>();

    public ContactBook(String name) {
        super();
    }

    public ContactBook() {
        super();
    }

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
//         выведите на экран весь список контактов книги
         for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }
    public void congratulate(String name) {
        boolean contactPresented = false; // проверяем, есть ли контакт в базе
        // найдите контакт в книге по имени и отправьте ему сообщение с помощью метода sendMessage()
        if (contacts.contains(name)){
            contactPresented = true;
            System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
            contact.sendMessage();
        }// если контакт не найден, выведите соответствующее сообщение
        if (!contactPresented) {
            System.out.println("Не найден контакт с указанным именем.");
        }
    }
}