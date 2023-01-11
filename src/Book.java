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
        if (this.author.hashCode()>0)
        {
            if (this.name.hashCode()>0)
            {
                System.out.print(author);
                return ", название: " + this.name + ", год публикации: " + this.year;
            } else throw new IllegalAccessError("не указано название");
        }
        else throw new IllegalAccessError("не указан автор");
    }
}