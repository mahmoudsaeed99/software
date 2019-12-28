/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

import java.util.ArrayList;


public class Group {
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
}

   



