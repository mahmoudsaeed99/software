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
public class comment {
    User owner;
    String conent;
    public comment makeComment(User owner , String content){
        this.conent = content;
        this.owner = owner;
        return this;
    }
    
}
