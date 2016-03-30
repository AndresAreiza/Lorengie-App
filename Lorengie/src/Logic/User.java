package Logic;

import Interface.IntAdmin;
import Interface.IntDealer;
import Interface.IntHome;
import Interface.IntSeller;
import javax.swing.JFrame;

/**
 * Class User
 * @author Asus
 */
public class User {
   private String userName; /*User name*/
   private String password; /*Password*/
   private String position; /*Position*/
   
   public User() {
       
   }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
      
   /**
    * Method login
    * @param userName userName
    * @param position position 
    */
   public void login(String userName, String position){
       if(position.equals("Administrator")){
          IntAdmin openIntAdmin = new IntAdmin(); 
          openIntAdmin.setLabelUser(openIntAdmin.getLabelUser().getText()+this.userName);
          openIntAdmin.setVisible(true);
          openIntAdmin.setLocationRelativeTo(null);
      }
       if(position.equals("Seller")){
           IntSeller openIntSeller = new IntSeller();
          openIntSeller.setLabelUser(openIntSeller.getLabelUser().getText()+this.userName);
          openIntSeller.setVisible(true);
          openIntSeller.setLocationRelativeTo(null);
      }
       if(position.equals("Dealer")){
          IntDealer openIntDealer = new IntDealer(); 
          openIntDealer.setLabelUser(openIntDealer.getLabelUser().getText()+this.userName);
          openIntDealer.setVisible(true);
          openIntDealer.setLocationRelativeTo(null);
      }

   }
   /**
    * Method Logout
    * @param f JFrame
    */
   public void logOut(JFrame f) {
       IntHome openIntHome = new IntHome();
       f.setVisible(false);
       openIntHome.setLocationRelativeTo(null);
       openIntHome.setVisible(true);
   }
   
}
