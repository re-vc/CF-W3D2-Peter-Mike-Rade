package Mike.library;

public class TestAuthor{
    public static void main(String[] args) {
        Author author = new Author("abc", "abc@abc.com", 'm', "instagram.com/author");


        System.out.println("the email is: " + author.getEmail());
        System.out.println("the name is: " + author.getName());
        System.out.println("the gender is: " + author.getGender());
        System.out.println("the instagram is: " + author.getInstagram());



        System.out.println(author);

    }
}
