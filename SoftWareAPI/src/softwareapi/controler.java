/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

/**
 *
 * @author C L
 */
public interface controler {
	public void createPost(String content,String name,User user);
    public void createHashtag(String hashtagName,Post post,String Name);
    
}
