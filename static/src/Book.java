public class Book {
    Author author;
    String title;
    String name;
    int relisYear;
    int pages;
    public Book(Author author, String title, String name, int relisYear, int pages) {
        this.author = author;
        this.title = title;
        this.name = name;
        this.relisYear = relisYear;
        this.pages = pages;
    }
    public boolean isBookBig() {
        return pages > 500;

    }
    public boolean isMatches(String word) {
        return author.name.contains(word) || author.surname.contains(word) || title.contains(word) || name.contains(word) || author.name.contains(word) || author.surname.contains(word) || title.contains(word);

    }
    public int isTematePrice() {
        int price = (int) (3 * pages * Math.sqrt(author.rating));
        return Math.max(price, 100);
    }
}




