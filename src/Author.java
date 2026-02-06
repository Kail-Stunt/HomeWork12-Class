public class Author { //Создаём класс Author, содержащий в себе данные о фамилии и имени автора
    //Объявляем поля класса и защищаем их через private
    private String firstName;
    private String lastName;

    //Создаём конструктор для полей класса
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Создаём get для имени автора
    public String getFirstName() {
        return this.firstName;
    }

    //Создаём get для фамилии автора
    public String getLastName() {
        return this.lastName;
    }
}
