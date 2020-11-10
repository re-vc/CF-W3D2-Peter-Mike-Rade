package Peter;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int quantity;

    // for extend task
    private Author bob;

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(){}

    // extend task


    public Book(String name, Author author, Author bob, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.bob = bob;
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Author getAuthor(){
        return this.author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity (){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // task a1 3 -- setting getters for Author details
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }

    // task a1 4
    public void printAuthor(){
        System.out.println("--------------------");
        System.out.println(author.getName() + "        Gender: " + author.getGender());
        System.out.println(author.getEmail());
        System.out.println(author.getInstagram());
        System.out.println("--------------------");
    }
    // weird behaviour
    public void printAuthorNext(){
        System.out.println("--------------------");
        System.out.println(bob.getName());
        System.out.println("--------------------");
    }





    // changed for extend task
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", quantity=" + quantity +
                ", bob=" + bob +
                '}';
    }
}
