/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 * Class Administrator
 * @author Asus
 */
public class Administrator {
    private String administratorcode; /**Administrator code*/
    private String administratorUser; /**Administrator user*/
    private String passwordAdmin;     /**Administrator password*/
    
    /**Default constructor*/
    public Administrator() {
    }
    /**
     * 
     * @param Administratorcode Administrator code
     * @param AdministratorUser Administrator user
     * @param PasswordAdmin     Administrator password
     */
    public Administrator(String Administratorcode, String AdministratorUser, String PasswordAdmin) {
        this.administratorcode = Administratorcode;
        this.administratorUser = AdministratorUser;
        this.passwordAdmin = PasswordAdmin;
    }
    
    /**
     * Get administrator code
     * @return Administrator code
     */
    public String getAdministratorcode() {
        return administratorcode;
    }
    /**
     * Set Administrator code
     * @param Administratorcode Administrator code
     */
    public void setAdministratorcode(String Administratorcode) {
        this.administratorcode = Administratorcode;
    }

    /**
     * Get administrator user
     * @return Administrator user
     */
    public String getAdministratorUser() {
        return administratorUser;
    }
    
    /**
     * Set administrator user
     * @param AdministratorUser Administrator user
     */
    public void setAdministratorUser(String AdministratorUser) {
        this.administratorUser = AdministratorUser;
    }
    
    /**
     * Get Administrator password
     * @return Administrator password
     */
    public String getPasswordAdmin() {
        return passwordAdmin;
    }
    
    /**
     * Set Administrator password
     * @param PasswordAdmin Administrator password
     */
    public void setPasswordAdmin(String PasswordAdmin) {
        this.passwordAdmin = PasswordAdmin;
    }
  
   /**
    * Sales list
    */
   public void salesList(){
       
   }
   /**
    * Add Products
    */
   public void addProducts(){
       
   }
   /**
    * Remove employees
    */
   public void removeEmployees(){
       
   }
   /**
    * Suppliers List
    */
   public void suppliersList(){
       
   }
   /**
    *  Employess List
    */
   public void employeesList(){
       
   }
   /**
    * Search Employee
    */
   public void searchEmployee(){
       
   }
   /**
    * Modify Employee
    */
   public void modifyEmployee(){
       
   }
    /**
    * Modify provider
    */
   public void modifyProvider(){
       
   }
    /**
    * Modify product
    */
   public void modifyProduct(){
       
   }
    /**
    * Add sale
    */
   public void addSale(){
       
   }
}
