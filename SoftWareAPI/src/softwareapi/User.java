/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

import java.util.ArrayList;

/**
 *
 * @author COMPU1
 */
public class User {

    public String name;
    public String pwd;
    public String mail;
    public ArrayList<User> friendList;
    public ArrayList<User> friendRequest;
    public ArrayList<Group> groups;
    public ArrayList<Page> pages;
    private ArrayList<Post>posts;
    private ArrayList<Hashtag>hashtags;
    Adminstrator admin = new Adminstrator();

    public User() {
        name = new String();
        pwd = new String();
        mail = new String();
        friendList = new ArrayList<>();
        System.out.println("orabi");
    }

    public User(Adminstrator admin) {
            this.admin=admin;
    }

    
}
