package softwareapi;

import java.util.ArrayList;

/**
 *
 * @author COMPU1
 */
abstract class User {

    public String name;
    public String pwd;
    public String mail;
     public boolean checkUserType;
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
        checkUserType=false;
        friendList = new ArrayList<>();
        System.out.println("orabi");
    }

    public User(Adminstrator admin) {
            this.admin=admin;
    }

    
}