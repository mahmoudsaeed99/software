/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapi;

public class Normaluser extends User {
    public Normaluser(){
      checkUserType=false;
    }

    public void upgrade(int  ccNum){
        if(payViaCreditCard(ccNum)){
        checkUserType=true;
        }
    }
    public boolean payViaCreditCard(int ccNum){
        return true;

    }
    public boolean payViapayPal(int ccNum){
        return true;
    }
    }
