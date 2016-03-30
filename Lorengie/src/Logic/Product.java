package Logic;

/**
 * Class product
 * @author Asus
 */
public class Product {
    private int productCode; /**Product code*/
    private String productName; /**Product name*/
    private String productQuantity;/**Product quantity*/
    private String provider;/**Provider*/
    private String productType; /**product type*/
    private double purchaseValue; /**Purchase value*/
    private double salePrice;/**Sale price*/
    private long totalValueWarehouse;/**total Value Warehouse*/
        
    /**
     * Default constructor
     */
    public Product() {
    }
    
    /**
     * Constructor with parameters 
     * @param productCode productCode 
     * @param productName productName
     * @param productQuantity productQuantity
     * @param provider provider
     * @param productType productType
     * @param purchaseValue purchaseValue
     * @param salePrice salePrice
     * @param totalValueWarehouse totalValueWarehouse 
     */
    public Product(int productCode, String productName, String productQuantity, String provider, String productType, double purchaseValue, double salePrice,long totalValueWarehouse) {
        this.productCode = productCode;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.provider = provider;
        this.productType = productType;
        this.purchaseValue = purchaseValue;
        this.salePrice = salePrice;
        this.totalValueWarehouse = totalValueWarehouse;
    }
    /**
     * Get product Code
     * @return productCode
     */
    public int getProductCode() {
        return productCode;
    }
    /**
     * Set product Code
     * @param productCode productCode
     */
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    /**
     * Get product Name
     * @return productName
     */
    public String getProductName() {
        return productName;
    }
    
    /**
     * Set product Name
     * @param productName productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    /**
     * Get product Quantity
     * @return productQuantity
     */
    public String getProductQuantity() {
        return productQuantity;
    }
    /**
     * Set product Quantity
     * @param productQuantity productQuantity
     */
    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }
    /**
     * Get provider
     * @return provider
     */
    public String getProvider() {
        return provider;
    }
    /**
     * Set provider
     * @param provider provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }
    /**
     * Get product Type
     * @return productType
     */
    public String getProductType() {
        return productType;
    }
    /**
     * Set product Type
     * @param productType productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }
    /**
     * Get purchaseValue
     * @return purchaseValue
     */
    public double getPurchaseValue() {
        return purchaseValue;
    }
    /**
     * Set purchase Value
     * @param purchaseValue purchaseValue
     */
    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
    /**
     * Get sale Price
     * @return salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }
    /**
     * Set sale Price
     * @param salePrice salePrice
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    /**
     * Get total Value Warehouse
     * @return totalValueWarehouse
     */
    public long getTotalValueWarehouse() {
        return totalValueWarehouse;
    }
    /**
     * Set total Value Warehouse
     * @param totalValueWarehouse totalValueWarehouse
     */
    public void setTotalValueWarehouse(long totalValueWarehouse) {
        this.totalValueWarehouse = totalValueWarehouse;
    }
    
   
    
}
