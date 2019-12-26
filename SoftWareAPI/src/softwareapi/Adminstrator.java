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
    private ArrayList<User> logedin;
    ArrayList<Group> allGroups;
    ArrayList<Page> allPages;
    private ArrayList<Post> allPosts;
    private ArrayList<Hashtag> allHashtags;

    public Adminstrator() {
        Signedup = new ArrayList<>();
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

    public boolean updateInfo(User oldUser, User newUser) {
        for (int i = 0; i < Signedup.size(); i++) {
            if (oldUser.mail.equals(Signedup.get(i).mail)) {
                Signedup.get(i).mail = newUser.mail;
                Signedup.get(i).name = newUser.name;
                Signedup.get(i).pwd = newUser.pwd;
                return true;
            }

        }
        return false;
    }

//    public boolean addFriend(User user, String name) {
//        for (int i = 0; i < Signedup.size(); i++) {
//            if (Signedup.get(i).name.equals(user.name)) {
//                user.friendList.add(name);
//                return true;
//            }
//
//        }
//        return false;
//
//    }
    public boolean removeFriend(User user, String name) {
        for (int i = 0; i < Signedup.size(); i++) {
            if (Signedup.get(i).name.equals(user.name)) {
                for (int j = 0; j < Signedup.get(i).friendList.size(); j++) {
                    if (Signedup.get(i).friendList.get(j).equals(name)) {
                        Signedup.get(i).friendList.remove(Signedup.get(i).friendList.get(j));
                        return true;
                    }

                }
            }
        }
        return false;

    }

    public boolean logOut(User user) {
        for (int i = 0; i < logedin.size(); i++) {
            if (user.mail.equals(logedin.get(i).mail)) {
                logedin.remove(logedin.get(i));
                return true;
            }
        }
        return false;

    }

//    public boolean joinGroup(User user, String groupName) {
//        for(int i=0;i<allGroups.size();i++){
//            if(allGroups.get(i).name.equals(groupName)){
//                allGroups.get(i).members.add(user.name);
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean leaveGroup(User user, String groupName) {
        for (int i = 0; i < allGroups.size(); i++) {
            if (allGroups.get(i).name.equals(groupName)) {
                for (int j = 0; j < allGroups.get(i).members.size(); j++) {
                    if (allGroups.get(i).members.get(j).equals(user.name)) {
                        allGroups.get(i).members.remove(allGroups.get(i).members.get(j));
                        return true;
                    }
                }
            }
        }
        return false;
    }
//
//    public boolean createGroup(User user, String groupName , String type) {
//        Group newGroup = new Group();
//        newGroup.name = groupName;
//        newGroup.admin = user.name;
//        newGroup.type = type;
//        allGroups.add(newGroup);
//        user.groups.add(newGroup);
//        return true;
//    }

    public boolean deleteGroup(User user, String groupName) {
        boolean deleted = false;
        for (int i = 0; i < allGroups.size(); i++) {
            if (allGroups.get(i).name.equals(groupName) && allGroups.get(i).admin.equals(user.name)) {
                allGroups.remove(allGroups.get(i));
                deleted = true;
            }
        }
        if (deleted) {
            for (int i = 0; i < user.groups.size(); i++) {
                if (user.groups.get(i).name.equals(groupName)) {
                    user.groups.remove(user.groups.get(i));
                }
            }
        }
        return deleted;
    }

    public boolean followPage(User user, String pageName) {
        return false;
    }

    public boolean unFollowPage(User user, String pageName) {
        return false;
    }

    public boolean createPage(User user, String pageName) {
        return false;
    }

    public boolean deletePage(User user, String pageName) {
        return false;
    }

}
