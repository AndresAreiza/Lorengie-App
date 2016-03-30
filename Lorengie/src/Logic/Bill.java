package Logic;

import java.util.Calendar;
import java.util.Date;

/**
 * Class Bill
 * @author Asus
 */
public class Bill {
    private int billCode; /**Bill code*/
    private String billDate; /**Bill date*/ 
    private String saleType;
    private String sellerName; /**Seller name*/
    private double value;
    private int quantity; 

    /**
     * Default constructor
     */
    public Bill() {
        
    }
    
    /**
     * Constructor with parameters 
     * @param billCode Bill code 
     * @param billDate Bill date 
     * @param sellerName Seller name 
     * @param value Value
     */
    public Bill(int billCode, String billDate, String sellerName, double value) {
        this.billCode = billCode;
        this.billDate = billDate;
        this.sellerName = sellerName;
        this.value = value;
    }
    
    /**
     * get billCode 
     * @return billCode  
     */
    public int getBillCode() {
        return billCode;
    }
    
    /**
     * Set billCode 
     * @param billCode 
     */
    public void setBillCode(int billCode) {
        this.billCode = billCode;
    }
    
    /**
     * get SaleType 
     * @return saleType  
     */
    public String getSaleType() {
        return saleType;
    }
    
    /**
     * set SaleType 
     * @param saleType 
     */
    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }
    
    /**
     * get BillDate 
     * @return billDate 
     */
    public String getBillDate() {
        return billDate;
    }
    
    /**
     * Set BillDate 
     * @param billDate 
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }
    
    /**
     * get SellerName 
     * @return sellerName 
     */
    public String getSellerName() {
        return sellerName;
    }
    
    /**
     * set SellerName
     * @param sellerName 
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    /**
     * get Value
     * @return 
     */
    public double getValue() {
        return value;
    }
    
    /**
     * set Value 
     * @param value 
     */
    public void setValue(double value) {
        this.value = value;
    }
    
    

    
}
