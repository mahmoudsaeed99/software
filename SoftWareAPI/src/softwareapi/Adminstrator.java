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
    

    public Adminstrator() {
        Signedup = new ArrayList<>();
        premiumUser = new ArrayList<>();
        normalUser = Signedup;
    }

    public boolean signUpValidate(User newUser) {
        for (User user : Signedup) {
            if (user.getMail().equals(newUser.getMail())) {

                return false;
            }
        }

        Signedup.add(newUser);
        return true;
    }

    public boolean loginValidate(User newUser) {
        System.out.println(Signedup.size());
        for (User user : Signedup) {
            if (user.name.equals(newUser.name) && user.getPwd().equals(newUser.getPwd())) {
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
            if (oldUser.getMail().equals(premiumUser.get(i).getMail())) {
                premiumUser.get(i).setMail(newUser.getMail()) ;
                premiumUser.get(i).name = newUser.name;
                premiumUser.get(i).setPwd (newUser.getPwd());
                return true;
            }

        }
        return false;
    }

    public boolean logOut(User user) {
        for (int i = 0; i < logedin.size(); i++) {
            if (user.getMail().equals(logedin.get(i).getMail())) {
                logedin.remove(logedin.get(i));
                return true;
            }
        }
        return false;

    }

}
