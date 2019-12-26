
package softwareapi;

import java.util.ArrayList;

public class Hashtag {

    public String name;
    public ArrayList<Post> posts;

    public Hashtag() {
        this.posts = new ArrayList();
    }

    public Hashtag(String name) {
        this.name = name;
        this.posts = new ArrayList();

    }

    public Hashtag writeHshtag(String name, Post post) {
        this.name = name;
        this.posts.add(post);
        return this;

    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

}
