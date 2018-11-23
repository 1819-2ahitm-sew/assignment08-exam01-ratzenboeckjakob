package at.htl.exam01.document;

public class Book extends Document {

    private String title;

    public Book() {
    }

    public Book (String author, String title) {
        super(author);

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "'" + title + "' von '" + getAuthor() + "'";
    }
}
