/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Asus
 */
public class DetailBill {
    private int idDetailBill;
    private String product;
    private String quantity;
    private int salePrice;
    private int totalValue; 
    private String saleType;

    public DetailBill() {
    }

    public int getIdDetailBill() {
        return idDetailBill;
    }

    public void setIdDetailBill(int idDetailBill) {
        this.idDetailBill = idDetailBill;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }
    
    
    
    
}