package items;

public class Book {
    private String title;
    private String writer;
    private int pages;
    private boolean isEbook;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isEbook() {
        return isEbook;
    }

    public void setEbook(boolean ebook) {
        isEbook = ebook;
    }

    public void printInfo() {
        System.out.println("Writer: " + getWriter());
        System.out.println("Title: " + getTitle());
        System.out.println("Pages: " + getPages());
        System.out.println("E-book: " + isEbook());
    }
}
