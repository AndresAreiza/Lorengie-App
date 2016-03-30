package Logic;

import java.util.Date;

/**
 * Class Delivery 
 * @author AA,AH,VP,NR 
 */
public class Delivery {
    private String date;
    private String adress;
    private String nameRecipient;
    private long phoneRecipient;
    
    
    /**
     * Default Constructor
     */
    public Delivery() {
    }
    
    /**
     * Constrctor with parameters 
     * @param date date 
     * @param adress adress 
     * @param nameRecipient nameRecipient 
     * @param phoneRecipient phoneRecipient  
     */
    public Delivery(String date, String adress, String nameRecipient, String phoneRecipient) {
        this.date = date;
        this.adress = adress;
        this.nameRecipient = nameRecipient;
        this.phoneRecipient = this.phoneRecipient;
    }
    
    /**
     * Get Date 
     * @return date 
     */
    public String getDate() {
        return date;
    }
    
    /**
     * Set Date 
     * @param date date
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * Get Adress
     * @return adress
     */
    public String getAdress() {
        return adress;
    }
    
    /**
     * set Adress 
     * @param adress address 
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    /**
     * get NameRecipient 
     * @return nameRecipient  
     */
    public String getNameRecipient() {
        return nameRecipient;
    }
    
    /**
     * set NameRecipient 
     * @param nameRecipient nameRecipient  
     */
    public void setNameRecipient(String nameRecipient) {
        this.nameRecipient = nameRecipient;
    }
    
    /**
     * getPhoneRecipient
     * @return phoneRecipient   
     */
    public long getPhoneRecipient() {
        return phoneRecipient;
    }
    
    /**
     * setPhoneRecipient 
     * @param phoneRecipient phoneRecipient  
     */
    public void setPhoneRecipient(long phoneRecipient) {
        this.phoneRecipient = phoneRecipient;
    }
    
    
    
    
}
