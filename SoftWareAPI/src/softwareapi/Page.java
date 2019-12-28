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
 */public class Page  {
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

  

    
}
