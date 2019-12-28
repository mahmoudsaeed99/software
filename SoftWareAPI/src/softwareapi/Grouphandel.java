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
public class Grouphandel implements search , Removing,controler {

    ArrayList<Group> allGroups;

    public void createGroup() {

    }

    public void joinGroup(User user, String nameOfGroup) {
         search(user,nameOfGroup);
    }
        @Override
    public void createPost(String content,String groupName, User owner) {
        int index=detailedSearch( owner,groupName); 
        Post post = new Post();
        allGroups.get(index).posts.add(post.writepost(content, owner));
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public void createHashtag(String name, Post post,String groupName) {
       
//        boolean find = false;
//        for (int i = 0; i < hashtags.size(); i++) {
//            if (name.equals(hashtags.get(i))) {
//                hashtags.get(i).addPost(post);
//                find = true;
//            }
//        }
//        if (!find) {
//            Hashtag hashtag = new Hashtag();
//            hashtag.writeHshtag(name, post);
//            hashtags.add(hashtag);
//        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
	
    
}

    


