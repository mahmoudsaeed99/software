/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

import java.util.Scanner;

/**
 *
 * @author mahmoudsaeed
 */
public class friendHandel implements search{
    Adminstrator admin = new Adminstrator();
    
    public void addFriend(String friendName , User user){
        for(int i=0;i<admin.Signedup.size();i++){
            if(admin.Signedup.get(i).name==friendName){
                user.friendRequest.add(admin.Signedup.get(i));
                return;
            }
            
        }
        System.out.println("this name not available");
    }
    public void showRequestsFriend(User user){
        Scanner in  = new Scanner(System.in);
        for(int i=0;i<user.friendRequest.size();i++){
            System.out.println(user.friendRequest.get(i).name);
            System.out.println("accept "+" reject");
            String request = in.nextLine();
            if(request.equals("accept")){
                user.friendList.add(user.friendRequest.get(i));
                
            }
            user.friendRequest.remove(user.friendRequest.get(i));
            i--;
        }
    }
    @Override
    public void search(String name, User user) {
        for(int i=0;i<admin.Signedup.size();i++){
            if(admin.Signedup.get(i).name.equals(name)){
                System.out.println(admin.Signedup.get(i).name);
            }
        }
    }
    
}
