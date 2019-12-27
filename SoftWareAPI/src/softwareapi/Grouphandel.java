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
public class Grouphandel implements search , Removing {

    ArrayList<Group> allGroups;

    public void createGroup() {

    }

    public void joinGroup(User user, String nameOfGroup) {
         search(user,nameOfGroup);
    }

    @Override
    public String search(User user,String name ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int detailedSearch(User user, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String name, User user) {
        detailedSearch(user,name);
    }
}
