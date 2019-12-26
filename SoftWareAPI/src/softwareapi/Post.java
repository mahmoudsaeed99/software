package softwareapi;

import java.util.ArrayList;

public class Post {

    public String content;
    public User owner;
    public ArrayList<User> likes = new ArrayList<>();
    public ArrayList<comment> comments = new ArrayList<>();

    public Post writepost(String content, User user) {
        this.content = content;
        this.owner = user;
        return this;

    }

    public void makeLike(User user) {
        likes.add(user);
    }

    public void makeComment(User user, String content) {
        comment comment = new comment();
        comments.add(comment.makeComment(owner, content));
    }

}
