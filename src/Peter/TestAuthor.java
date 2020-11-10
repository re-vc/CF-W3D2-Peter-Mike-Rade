package Peter;

public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Joe");
        author.setEmail("Joe@mail.com");
        author.setInstagram("instagram.com/author");
        author.setGender('m');

        System.out.println("the email is: " + author.getEmail());
        System.out.println("*****     *****     *****     *****     *****");
        System.out.println(author);
    }


}
