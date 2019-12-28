package softwareapi;

import java.util.ArrayList;

/**
 *
 * @author COMPU1
 */
abstract class User {

    public String name;
    private String pwd;
    private String mail;

    public ArrayList<User> friendList;
    public ArrayList<User> friendRequest;
    public ArrayList<Group> groups;
    public ArrayList<Page> pages;
    private ArrayList<Post> posts;
    private ArrayList<Hashtag> hashtags;
    Adminstrator admin = new Adminstrator();

    public User() {
        name = new String();
        pwd = new String();
        mail = new String();

        friendList = new ArrayList<>();
        System.out.println("orabi");
    }

    public User(Adminstrator admin) {
        this.admin = admin;
        name = new String();
        pwd = new String();
        mail = new String();
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return this.mail;
    }
  public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return this.mail;
    }
}
