public class Author
{
    private String firstName;
    private String lastName;
    private String fullName;

    public Author(String firstName, String  lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = (this.firstName + " " + this.lastName);
    }

    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getFullName()
    {
        return this.fullName;
    }

    public String toString()
    {
        return "Автор: " + this.fullName;
    }

    public boolean equals(Author a)
    {
        boolean b = this.equals(a);
        return b;
    }

    public int hashCode(Author c)
    {
        int d = this.hashCode();
        return d;
    }
}