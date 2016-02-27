
public class NewsFeed {

    private Post postArr[];
    // private int initCapacity; // Not needed to be stored as it is never reused.
    private int incCapacity; 
    private int size;

    public NewsFeed(int initCapacity, int incCapacity) {
        this.incCapacity = incCapacity;
        // this.initCapacity = initCapacity;
        postArr = new Post[initCapacity];
        size = 0;
    }

    public void add(Post newPost) {
        // Check if full the array is full.
        if (size == postArr.length) { // If the size is equal to the length then the array is full
            // New array of 'incCapacity' more slots.
            Post newPostArr[] = new Post[postArr.length + incCapacity];

            // Move all the content of the old array into the new array.
            for (int i = 0; i < postArr.length; i++) {
                newPostArr[i] = postArr[i];
            }

            // Replace the old array with the new array.
            postArr = newPostArr;
        }

        // Assign the new Post to the last open spot.
        postArr[size] = newPost;
        size++;
    }

    public int size() {
        return size; // Simple as that.
    }

    public Post get(int index) {
        return postArr[index];  // Doesn't check for out of bounds.
    }

}
