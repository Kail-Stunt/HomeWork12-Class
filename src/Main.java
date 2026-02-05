public class Main {
    public static void main(String[] args) {
        System.out.println("Вывод в консоль 1:\nВывести данные о книге, дате издания и авторе:\n");
        Author stihpenKing = new Author("Стивен", "Кинг");
        Book theMist = new Book("Мгла", 1980);
        System.out.println("Книга = \"" + theMist.getBookTitle() + "\" издана в " + theMist.getYearOfPublication());
        System.out.println("Автор = " + stihpenKing.getFirstName() + " " + stihpenKing.getLastName());
        Author richardMatheson = new Author("Ричард", "Мэтисон");
        Book iAmLegend = new Book("Я легенда", 1952);
        System.out.println("Книга = \"" + iAmLegend.getBookTitle() + "\" издана в " + iAmLegend.getYearOfPublication());
        System.out.println("Автор = " + richardMatheson.getFirstName() + " " + richardMatheson.getLastName());
        System.out.println("\nВывод в консоль 2:\nСкорректировать дату издания:\n");
        iAmLegend.setYearOfPublication(1954);
        System.out.println("Книга = \"" + iAmLegend.getBookTitle() + "\" издана в " + iAmLegend.getYearOfPublication());
        System.out.println("Автор = " + richardMatheson.getFirstName() + " " + richardMatheson.getLastName());
    }
}