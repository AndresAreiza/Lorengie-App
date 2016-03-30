/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 * Class Dealer
 * @author Asus
 */
public class Dealer {
    private String codeEmployee;
    
    /**
     * Default constructor
     */
    public Dealer() {
    }
    /**
     * 
     * @param codeEmployee Code employee 
     */
    public Dealer(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }
    /**
     * Get code employee
     * @return Code employee
     */
    public String getCodeEmployee() {
        return codeEmployee;
    }
    /**
     * Set code employee
     * @param codeEmployee Code employee
     */
    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }
   
    
    /**
     * Record Order Delivered
     */
    public void recordOrderDelivered(){
        
    }
    
    
}
