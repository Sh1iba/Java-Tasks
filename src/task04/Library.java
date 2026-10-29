package task04;

public class Library {
    public static void printBooks(Book[] books) {
        int counter = 0;
        for (Book book : books) {
            if (book != null) {
                counter++;
                System.out.printf("Книга №%d: название: \"%s\", год издания: %dг., цена - %d usd%n",
                        counter, book.bookName, book.publishDate, book.price);
            }
        }
    }

    public static boolean checkBook(Book[] fileOfBooks, Book book) {
        for (Book book1 : fileOfBooks) {
            if (book1 != null && book1.bookName.equals(book.bookName) && book1.publishDate == book.publishDate) {
                System.out.println("Книга уже есть в картотеке");
                return true;
            }
        }
        System.out.println("Книги нет в картотеке");
        return false;
    }

    public static void addBook(Book book, Book[] fileOfBooks) {
        if (!checkBook(fileOfBooks, book)) {
            for (int i = 0; i < fileOfBooks.length; i++) {
                if (fileOfBooks[i] == null) {
                    fileOfBooks[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    return;
                }
            }
            System.out.println("Картотека заполнена");
        }
    }
}
