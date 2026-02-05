public class Book {//Создаём новый класс Book с информацией о названии и даие публикации книги
    //Объявляем поля класса и защищаем их через private
    private String bookTitle;
    //private Author author; А зачем мы вводим это, поле если далее создаём класс и вызываем его из main?
    private int yearOfPublication;
    //Создаём конструктор для полей класса
    public Book(String bookTitle, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
    }

    //Создаём get для названия книги
    public String getBookTitle() {
        return this.bookTitle;
    }
    //Создаём get для даты публикации книги
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    //Создаём set для даты публикации книги
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
