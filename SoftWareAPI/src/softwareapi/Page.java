/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

import java.util.ArrayList;

/**
 *
 * @author mahmoudsaeed
 */
public class Page implements controler {
    public User admin;
    public String name;
    public String type;
    public ArrayList<User> followers ;
    public ArrayList<Post> posts ;
    public ArrayList<Hashtag> hashtags ;

    public Page() {
        admin = new User() {};
        type = new String();
        followers = new ArrayList<>();
        posts = new ArrayList<>();
        name = new String();
    }

    public Page(User admin, String type , String nameOfPage) {
        this.admin = admin;
        this.type = type;
        this.name = nameOfPage;
    }

  

    @Override
    public void createPost(String content, User owner) {
         Post post = new Post();
        posts.add(post.writepost(content, owner));
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createHashtag(String name, Post post) {
        boolean find = false;
        for(int i=0;i<hashtags.size();i++){
            if(name.equals(hashtags.get(i))){
                hashtags.get(i).addPost(post);
                find = true;
            }
        }
        if(!find){
            Hashtag hashtag = new Hashtag();
            hashtag.writeHshtag(name, post);
            hashtags.add(hashtag);
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
