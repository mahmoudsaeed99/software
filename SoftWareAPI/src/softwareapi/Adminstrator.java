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
public class Adminstrator {

    ArrayList<User> Signedup;
    ArrayList<User> premiumUser;
    ArrayList<User> normalUser;

    private ArrayList<User> logedin;

    private ArrayList<Post> allPosts;
    private ArrayList<Hashtag> allHashtags;

    public Adminstrator() {
        Signedup = new ArrayList<>();
        premiumUser = new ArrayList<>();
        normalUser = Signedup;
    }

    public boolean signUpValidate(User newUser) {
        for (User user : Signedup) {
            if (user.mail.equals(newUser.mail)) {

                return false;
            }
        }

        Signedup.add(newUser);
        return true;
    }

    public boolean loginValidate(User newUser) {
        System.out.println(Signedup.size());
        for (User user : Signedup) {
            if (user.name.equals(newUser.name) && user.pwd.equals(newUser.pwd)) {
                System.out.println("ok");
                return true;
            }
        }
        return false;
    }

    public void upgrade(User user) {
        for (int i = 0; i < normalUser.size(); i++) {
            if (user.name.equals(normalUser.get(i).name)) {
                premiumUser.add(user);
                normalUser.remove(normalUser.get(i));
            }
            i--;
        }
    }

    public boolean updateInfo(User oldUser, User newUser) {
        for (int i = 0; i < premiumUser.size(); i++) {
            if (oldUser.mail.equals(premiumUser.get(i).mail)) {
                premiumUser.get(i).mail = newUser.mail;
                premiumUser.get(i).name = newUser.name;
                premiumUser.get(i).pwd = newUser.pwd;
                return true;
            }

        }
        return false;
    }

//    public boolean addFriend(User user, String name) {
    //      for (int i = 0; i < Signedup.size(); i++) {
    //        if (Signedup.get(i).name.equals(user.name)) {
//                user.friendList.add(name);
//                return true;
//            }
//
//        }
//        return false;
//
//    }
//    public boolean removeFriend(User user, String name) {
//        for (int i = 0; i < Signedup.size(); i++) {
//            if (Signedup.get(i).name.equals(user.name)) {
//                for (int j = 0; j < Signedup.get(i).friendList.size(); j++) {
//                    if (Signedup.get(i).friendList.get(j).equals(name)) {
//                        Signedup.get(i).friendList.remove(Signedup.get(i).friendList.get(j));
//                        return true;
//                    }
//
//                }
//            }
//        }
//        return false;
//
//    }
//
    public boolean logOut(User user) {
        for (int i = 0; i < logedin.size(); i++) {
            if (user.mail.equals(logedin.get(i).mail)) {
                logedin.remove(logedin.get(i));
                return true;
            }
        }
        return false;

    }

}
