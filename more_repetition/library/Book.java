package more_repetition.library;

public class Book {
    private String title;
    private String currentHolder;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", currentHolder='" + currentHolder + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }
}
