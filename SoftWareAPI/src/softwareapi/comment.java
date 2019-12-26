
package softwareapi;

public class comment {
    User owner;
    String conent;
    public comment makeComment(User owner , String content){
        this.conent = content;
        this.owner = owner;
        return this;
    }
    
}
