
public class TextPost extends Post {
    private String text;

    public TextPost(String userName, String text) {
        super(userName); // Call parent's constructor
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // This method gets called automatically if you try to print this.
    // This printout is based on the sample print statement as seen on the question.
    public String toString() {
        String postRep = "TextPost: " + getCreatedDate() // This is a "super" method (a method of the parent)
            + ", "          + getUserName() // Same as getCreatedDate() belongs to the parent
            + ", likes = "  + getLikes()    // Same as ^
            + ", "          + getText(); // This is a instance method, as declaired above.
            // PS - You can do things on multiple lines in Java, so long as it syntacitally correct.
        return postRep;
    }

    
}
