package pl_java.exercise_2;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;




public class Profile {

/*
 * Attributes
 */
    private String name;
    private String countryCode;
    private String phoneNo;
    private URI profilePhotoUrl;
    private String about;
    private LocalDateTime lastSeen;


/*
 * Constructors
 */
public Profile(String name, String countryCode, String phoneNo, String profilePhotoUrl)throws URISyntaxException
{
        setName(name);
        setPhoneNo(countryCode, phoneNo);
        setProfilePhotoUrl(profilePhotoUrl);
        this.lastSeen = LocalDateTime.now();
}

public Profile(String name, String countryCode, String phoneNo) throws URISyntaxException
{
        setName(name);
        setPhoneNo(countryCode, phoneNo);
        setProfilePhotoUrl("https://pps.whatsapp.net/v/noDP.jpg");
        this.lastSeen =LocalDateTime.now();
        setAbout("Hey there I am using whatsapp");
}


/*
 * Getters
 */
public String getName(){
        return name;
    }
    public String getPhone(){
        return countryCode + " "+ phoneNo;
    }
    public URI getProfilePhotoUrl(){
        return profilePhotoUrl;
    }
    public String getAbout(){
        return about;
    }
    public LocalDateTime getLastseen(){
        return lastSeen;
    }


/*
 * Setters
 */
    public void setName(String name){
        if(name.isBlank()){
                System.out.println("Error: name cnt't be blank");
        }else{ 
                this.name = name;
        }
    }

    public void setPhoneNo(String countryCode, String phoneNo){
        if(phoneNo.length() < 10){
                System.out.println("Error: phone number  must be 10 digits");
        }else{
            this.countryCode = countryCode;
            this.phoneNo = phoneNo;
        }
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) throws URISyntaxException{
        this.profilePhotoUrl = new URI(profilePhotoUrl);
    }

    public void setAbout(String about){
        if(about.isBlank()){
                System.out.println("Error : About can not be blank");
        }else{
            this.about = about;
        }
    }




/*
 * Methods
 */
    public void updateLastSeen(LocalDateTime lastSeen){
        if(this.lastSeen.isAfter(lastSeen)){
                System.out.println("Error: current lastSeen cannot be more than input lastSeen!");
            }else{
                this.lastSeen = lastSeen;
            }
    
    }
}