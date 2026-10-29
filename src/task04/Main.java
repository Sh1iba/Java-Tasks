package task04;

public class Main {
    public static void main(String[] args) {
        Book[] fileOfBooks = new Book[2];
        Book book1 = new Book("The Hobbit", 999, 1937);
        Book book2 = new Book("Atomic habits", 999, 2007);
        Book book3 = new Book("Mein", 999, 1907);
        Library.addBook(book1, fileOfBooks);
        Library.printBooks(fileOfBooks);
        Library.addBook(book2, fileOfBooks);
        Library.printBooks(fileOfBooks);
        Library.addBook(book3, fileOfBooks);
        Library.printBooks(fileOfBooks);
    }

}
