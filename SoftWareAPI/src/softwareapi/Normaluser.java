/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

public class Normaluser extends User {
    public Normaluser(){
     System.out.println("this is normal user");
    }

    public void upgrade(int choice){
        Adminstrator admin=new Adminstrator();
        
        if(choice==1){
            int ccNum = 0;
            payViaCreditCard(ccNum);
            admin.upgrade(this);
                       
        }
        if(choice==2){
            int paypal = 0;
            payViapayPal(paypal);
            admin.upgrade(this);
                       
        }
        
    }
    public boolean payViaCreditCard(int ccNum){
        return true;

    }
    public boolean payViapayPal(int ccNum){
        return true;
    }
    }
