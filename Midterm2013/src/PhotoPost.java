
public class PhotoPost extends Post {

    private String photoFile;
    private String caption;

    public PhotoPost(String userName, String photoFile, String caption) {
        super(userName); // Calling parent's constructor. Must be first line!!!!
        this.photoFile = photoFile;
        this.caption = caption;
    }

    public String getFileName() {
        return photoFile;
    }

    public String getCaption() {
        return caption;
    }

    // This method gets called automatically if you try to print this.
    // This printout is based on the sample print statement as seen on the question.
    public String toString() {
        String posRep = "PhotoPost: " + getCreatedDate() // This is a "super" method (a method of the parent)
            + ", "          + getUserName() // Same as getCreatedDate() belongs to the parent
            + ", likes = "  + getLikes()    // Same as ^
            + ", "          + getFileName() // This is a instance method, as declaired above.
            + ", "          + getCaption(); // Same as ^
            // PS - You can do things on multiple lines in Java, so long as it syntacitally correct.
        return posRep;
    }

}
