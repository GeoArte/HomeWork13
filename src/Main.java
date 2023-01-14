public class Main {
    public static void main(String[] args)
    {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book prestuplenieINakazanie= new Book("Преступление и наказание", dostoevsky, 1866);
        System.out.println(prestuplenieINakazanie);
        Author oruell = new Author("Джордж", "Оруэлл");
        Book best = new Book("1984", oruell, 1949);
        System.out.println(best);
        Book scotniyDvor = new Book("Скотный двор", oruell, 1945);
        System.out.println(scotniyDvor);
    }
}