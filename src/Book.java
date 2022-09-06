public class Book {
    private String title;
    private Author author;

    private int publishDate;

    public Book(String title, Author author, int publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public Author getAuthor() {
        return author;
    }



    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Книга - " + title +
                ", автор - " + author +
                ", дата публикации " + publishDate ;
    }

}
