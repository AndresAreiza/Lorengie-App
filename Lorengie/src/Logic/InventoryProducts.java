package Logic;

/**
 * Class Inventory products
 * @author Asus
 */
public class InventoryProducts {
    private String productCode; /**Product code*/
    private int accountProduct; /**Account Product */
    private Product nameProduct; /**Name Product */
    private Product typeProduct; /**Type Product */
    private Product purchaseValueProduct; /**Purchase Product */
    private Product valueProductSales; /**Value product Sales */
    private Provider nameProvider; /**Name provider */
    private double totalValueInWarehouse; /**Total value in warehouse */
    
    
    /**
     * Default constructor
     */
    public InventoryProducts() {
    }
    
    /**
     * Constructor with parameters 
     * @param productCode Product code
     * @param accountProduct Account Product
     * @param nameProduct Name Product
     * @param typeProduct Type Product
     * @param purchaseValueProduct Purchase Product
     * @param valueProductSales Value product Sales
     * @param nameProvider Name provider
     * @param totalValueInWarehouse Total value in warehouse
     */
    public InventoryProducts(String productCode, int accountProduct, Product nameProduct, Product typeProduct, Product purchaseValueProduct, Product valueProductSales, Provider nameProvider, double totalValueInWarehouse) {
        this.productCode = productCode;
        this.accountProduct = accountProduct;
        this.nameProduct = nameProduct;
        this.typeProduct = typeProduct;
        this.purchaseValueProduct = purchaseValueProduct;
        this.valueProductSales = valueProductSales;
        this.nameProvider = nameProvider;
        this.totalValueInWarehouse = totalValueInWarehouse;
    }
    
    /**
     * Get product code
     * @return product code
     */
    public String getProductCode() {
        return productCode;
    }
    /**
     * Set product code
     * @param productCode product code
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    /**
     * Get account code
     * @return account code
     */
    public int getAccountProduct() {
        return accountProduct;
    }
    /**
     * Set account product
     * @param accountProduct  account product
     */
    public void setAccountProduct(int accountProduct) {
        this.accountProduct = accountProduct;
    }
    /**
     * Get name product
     * @return 
     */
    public Product getNameProduct() {
        return nameProduct;
    }
    /**
     * Set name product
     * @param nameProduct name Product
     */
    public void setNameProduct(Product nameProduct) {
        this.nameProduct = nameProduct;
    }
    /**
     * Get type Product
     * @return typeProduct
     */
    public Product getTypeProduct() {
        return typeProduct;
    }
    /**
     * Set type Product
     * @param typeProduct typeProduct
     */
    public void setTypeProduct(Product typeProduct) {
        this.typeProduct = typeProduct;
    }
    /**
     * Get purchase Value Product
     * @return purchaseValueProduct
     */
    public Product getPurchaseValueProduct() {
        return purchaseValueProduct;
    }
    /**
     * Set purchase Value Product
     * @param purchaseValueProduct purchaseValueProduct
     */
    public void setPurchaseValueProduct(Product purchaseValueProduct) {
        this.purchaseValueProduct = purchaseValueProduct;
    }
    /**
     * Get value Product Sales
     * @return valueProductSales
     */
    public Product getValueProductSales() {
        return valueProductSales;
    }
    /**
     * Set value Product Sales
     * @param valueProductSales valueProductSales
     */
    public void setValueProductSales(Product valueProductSales) {
        this.valueProductSales = valueProductSales;
    }
    /**
     * Get name Provider
     * @return nameProvider
     */
    public Provider getNameProvider() {
        return nameProvider;
    }
    /**
     * Set name Provider
     * @param nameProvider nameProvider
     */
    public void setNameProvider(Provider nameProvider) {
        this.nameProvider = nameProvider;
    }
    /**
     * Get total Value In Warehouse
     * @return totalValueInWarehouse
     */
    public double getTotalValueInWarehouse() {
        return totalValueInWarehouse;
    }
    /**
     * Set total Value In Warehouse
     * @param totalValueInWarehouse totalValueInWarehouse
     */
    public void setTotalValueInWarehouse(double totalValueInWarehouse) {
        this.totalValueInWarehouse = totalValueInWarehouse;
    }
    /**
     * Total Value In Warehouse
     * @return totalValueInWarehouse
     */
    
    public double TotalValueInWarehouse(){
        
        return totalValueInWarehouse;
    }
    
    
    
}
