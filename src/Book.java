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
    public boolean equals(String a)
    {
        boolean b = this.equals(a);
        return b;
    }

    public int hashCode(String c)
    {
        int d = this.hashCode();
        return d;
    }
}