/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

import java.util.ArrayList;


public class Group implements controler {
	public User admin;
    public String name;
    public ArrayList<User> members;
    public ArrayList<Post> posts;
    public String type;
    public ArrayList<Hashtag> hashtags ;


    public Group() {
        admin = new User() {};
        name = new String();
        members = new ArrayList<>();
        posts = new ArrayList<>();
        type = "public";
    }
  

    public Group(User admin, String name, String type) {
        this.admin = admin;
        this.name = name;
        this.type = type;

    }

    public void creatPost(String conent, User owner) {
        Post post = new Post();
        posts.add(post.writepost(conent, owner));

    }

    @Override
    public void createPost(String content, User owner) {
        Post post = new Post();
        posts.add(post.writepost(content, owner));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createHashtag(String name, Post post) {
        boolean find = false;
        for (int i = 0; i < hashtags.size(); i++) {
            if (name.equals(hashtags.get(i))) {
                hashtags.get(i).addPost(post);
                find = true;
            }
        }
        if (!find) {
            Hashtag hashtag = new Hashtag();
            hashtag.writeHshtag(name, post);
            hashtags.add(hashtag);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
    
}
