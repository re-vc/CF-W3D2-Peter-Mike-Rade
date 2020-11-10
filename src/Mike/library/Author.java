package Mike.library;

public class Author {
    private String name;
    private String email;
    private char gender;
    private String instagram;

    public Author(String name, String email, char gender, String instagram){
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.instagram = instagram;
    }
    public Author(){
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return this.gender;
    }

    public void getInstagram(String instagram){
        this.instagram = instagram;
    }
    public String getInstagram(){
        return this.instagram;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", instagram='" + instagram + '\'' +
                '}';
    }
}
