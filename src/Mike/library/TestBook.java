package Mike.library;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author();
        Book book = new Book("abcdef", author, 14.99, 32);

       book.getAuthor().setName("jklö");
       book.getAuthor().setEmail("fasdglkö@gjalksdjg");
       book.getAuthor().setGender('m');

        System.out.println("the author is: " + book.getAuthor().getName() + " " + book.getAuthor().getEmail());
        System.out.println("the name is: " + book.getName());
        System.out.println("the price is: " + book.getPrice());
        System.out.println("the quantity is: " + book.getQuantity());

        System.out.println(book.getAuthorName() + " " + book.getAuthorEmail() + " " + book.getAuthorGender());



    }
}
