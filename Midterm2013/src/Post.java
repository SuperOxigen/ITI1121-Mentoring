import java.util.Date;
import java.util.Calendar; // Also needs to be imported

public abstract class Post implements Likeable {
    // Class variables
    
    // Instance variables
    
    private String user;
    private Date created;
    private int likes;

    public Post(String userName) {
        user = userName;
        created = Calendar.getInstance().getTime();
        likes = 0;
    }

    public void like() {
        likes = likes + 1;
        // likes++;
    }

    public int getLikes() {
        return likes;
    }

    // We can add getters, used for the subclass's toString() method.

    public Date getCreatedDate() {
        return created;
    }

    public String getUserName() {
        return user;
    }

}
