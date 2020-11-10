package Peter;

public class TestBook {
    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Joe");
        author.setEmail("Joe@mail.com");
        author.setInstagram("instagram.com/author");
        author.setGender('m');

        // for extend task
        Author bob = new Author();
        bob.setName("Bob");
        bob.setEmail("Bob@mail.com");
        bob.setInstagram("instagram.com/bob");
        bob.setGender('m');

        Book book = new Book("ABC",author,999.99);
        Book book2 = new Book("CAB",author,999.99,10);
        Book book3 = new Book("RED",author, bob, 99.99, 2);
        System.out.println(book2);

        // task a1 2
        System.out.println(book.getAuthor().getEmail());
        System.out.println(book.getAuthor().getName());

        System.out.println(book.getAuthorGender());

        book.printAuthor();
        System.out.println(book3);
    }
}
