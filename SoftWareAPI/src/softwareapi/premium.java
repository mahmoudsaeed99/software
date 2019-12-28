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
public class premium extends User{
  
    public premium() {
          System.out.println("this is premiu user ");
    }

    public void updateProfile(String name, String pwd, String mail) {
        User newUser = new premium();
        newUser.setMail(mail);
        newUser.name = name;
        newUser.setPwd(pwd);
        //admin.signUpValidate(this);
        if (admin.updateInfo(this, newUser)) {
            this.name = name;
            this.setPwd(pwd);
            this.setMail(mail);
            System.out.println("update successfully");
        } else {
            System.out.println("update faild");
        }
    }

}
