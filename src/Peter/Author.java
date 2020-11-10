package Peter;

public class Author {

    private String name;
    private String email;
    private String instagram;
    private char gender;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getInstagram(){
        return this.instagram;
    }
    public void setInstagram(String instagram){
        this.instagram = instagram;
    }

    public char getGender(){
        return this.gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", instagram='" + instagram + '\'' +
                ", gender=" + gender +
                '}';
    }
}
