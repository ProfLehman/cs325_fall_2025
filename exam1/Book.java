/*
Book.java
fall 2025  prof. lehman
sample class for exam1
*/

public class Book {

    private String title;
    private int pages;

    public Book() {
        title = "untitled";
        pages = 0;
    }

    public Book(String t, int p) {
        title = t;
        pages = p;
    }

    public void updateTitle(String t) {
        title = t;
    }

    public void updatePages(int p) {
        // #9
        // only update if p is greater than zero
        if (p > 0)
            pages = p; }

    public String title()
    {
        return title; }

    public int pages()
    {
        return pages; }

    public String toString()
    {
        return "Title: " + title + ", Pages: " + pages;
    }

} // Book