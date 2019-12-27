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
public class friendHandel implements search , Removing{
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
    public String search(User user,String name ) {
        for(int i=0;i<admin.Signedup.size();i++){
            if(admin.Signedup.get(i).name.equals(name)){
               // System.out.println(admin.Signedup.get(i).name);
                return admin.Signedup.get(i).name;
            }
        }
        return " ";
    }

    @Override
    public void remove(String name, User user) {
        int index=detailedSearch(user,name);
        if(index==-1){
            System.out.println("this friend is already not found in your friend list");
            
        }
        else{
            user.friendList.remove(index);
        }
    }
    

    @Override
    public int detailedSearch(User user, String name) {
        for(int i=0;i<user.friendList.size();i++){
            if(name.equals(user.friendList.get(i).name)){
                return i;
            }
        }
        return -1;
    }
  
    
    
}
