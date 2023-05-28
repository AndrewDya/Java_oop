package HW_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик");
        cat.setAge(3);
        cat.greet();

        cat.setOwnerName("Алексей");
        cat.greet();

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина: " + rectangle1.getWidth());
        System.out.println("Высота: " + rectangle1.getHeight());
        System.out.println("Площадь: " + rectangle1.calculateArea());
        System.out.println("Периметр: " + rectangle1.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 2.8);
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());

        rectangle2.setWidth(4.2);
        rectangle2.setHeight(3.1);
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());

        Book book1 = new Book("Название книги 1", "Автор 1");
        Book book2 = new Book("Название книги 2", "Автор 2");
        Book book3 = new Book("Название книги 3", "Автор 1");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        book1.setAvailable(false);
        book2.setAvailable(true);
        book3.setAvailable(true);

        library.displayAvailableBooks();

        library.searchByAuthor("Автор 1");
    }
}
