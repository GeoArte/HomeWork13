import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author auther, int year)
    {
        this.name = name;
        this.author = auther;
        this.year = year;
    }
    public String getName()
    {
        return this.name;
    }
    public Author getAuthor()
    {
        return this.author;
    }
    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        System.out.print(author);
        return ", название: " + this.name + ", год публикации: " + this.year;
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author) && year == book.year;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, author, year);
    }
}