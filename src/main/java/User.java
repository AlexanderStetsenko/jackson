import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by St on 02.04.2017.
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class User{
    private Name name;
    private String gender;
    private boolean verified;
    private String userImage;


    public Name getName(){
        return name;
    }
    public void setName(Name input){
        this.name = input;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String input){
        this.gender = input;
    }
    public boolean getVerified(){
        return verified;
    }
    public void setVerified(boolean input){
        this.verified = input;
    }
    public String getUserImage(){
        return userImage;
    }
    public void setUserImage(String input){
        this.userImage = input;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", gender='" + gender + '\'' +
                ", verified=" + verified +
                ", userImage='" + userImage + '\'' +
                '}';
    }
}
