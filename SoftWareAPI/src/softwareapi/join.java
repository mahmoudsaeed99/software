/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

/**
 *
 * @author mahmoudsaeed
 */
public class join {
    Adminstrator admin = new  Adminstrator();
    public void joinGroup(User user , String nameOfGroup){
        for(int i=0;i< admin.allGroups.size();i++){
            if(admin.allGroups.get(i).name==nameOfGroup){
                admin.allGroups.get(i).members.add(user);
                return ;
            }
        }
        System.out.println("no group with this name");
    }
    public void followPage(User user , String nameOfPage){
        for(int i=0;i<admin.allPages.size();i++){
            if(admin.allPages.get(i).name==nameOfPage){
                admin.allPages.get(i).followers.add(user);
                return;
            }
        }
        System.out.println("no page with this name");
    } 
}
