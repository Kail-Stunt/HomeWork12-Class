public class Book {//Создаём новый класс Book с информацией о названии и дате публикации книги
    //Объявляем поля класса и защищаем их через private
    private final String bookTitle;
    private final Author author;
    private int yearOfPublication;

    //Создаём конструктор для полей класса
    public Book(String bookTitle, int yearOfPublication, Author author) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        //author = author.getFirstName()+author.getLastName();
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
