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
public class pagehandel implements search , Removing{

    ArrayList<Page> allPages;

    public void createPage() {

    }

    public void followPage(User user, String nameOfPage) {
         search(user,nameOfPage);
    }

    @Override
    public String search(User user, String name) {
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
