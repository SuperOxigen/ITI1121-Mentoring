public class MidtermTest {
    public static void main (String[] args) {
        NewsFeed messages;
        Post msg1, msg2;

        messages = new NewsFeed(100, 10);

        msg1 = new PhotoPost("David", "funny.png", "Birthday party");
        msg1.like();
        messages.add(msg1);

        msg2 = new TextPost("David", "Dinner at your place with Alexe");
        msg2.like();
        msg2.like();
        messages.add(msg2);

        messages.add(new TextPost("Nancy", "Okay"));
        for (int i = 0; i < messages.size(); i++) {
            System.out.println(messages.get(i));
        }
    }
}
