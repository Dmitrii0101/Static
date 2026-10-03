//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book(new Author(100, "Гоголь", "Лев"),
                "Война и мир",
                "Лев Толcтой",
                1000,
                10);
        System.out.println(book.isBookBig());
        System.out.println(book.isMatches("Николай"));
        System.out.println(book.isTematePrice());


    }
}
