
class BookInfo {
    int bookid;
    String title;
    String author;
    String classname;

    void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Title: " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Class Name: " + classname);
    }

    public static void main(String[] args) {
        BookInfo b = new BookInfo();

        b.bookid = 101;
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.classname = "Computer Science";

        b.display();
    }
}
