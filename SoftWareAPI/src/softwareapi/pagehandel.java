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
public class pagehandel implements search , Removing,controler{

    ArrayList<Page> allPages;

    public void createPage() {
         
    }

    public void followPage(User user, String nameOfPage) {
         search(user,nameOfPage);
    }
    public void createPost(String content, User owner) {
//         Post post = new Post();
//        posts.add(post.writepost(content, owner));
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public void createHashtag(String name, Post post) {
//        boolean find = false;
//        for(int i=0;i<hashtags.size();i++){
//            if(name.equals(hashtags.get(i))){
//                hashtags.get(i).addPost(post);
//                find = true;
//            }
//        }
//        if(!find){
//            Hashtag hashtag = new Hashtag();
//            hashtag.writeHshtag(name, post);
//            hashtags.add(hashtag);
//        }
        
        
  //  }

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

    @Override
    public void createPost(String content, String name, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createHashtag(String name, Post post, String groupName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}