/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author gowth
 */
public class Item {
    private String itemID;
    private String itemName;
    private double itemprice;
    private String itemcalories;
    private String itemcuisine;

    public String getItemcuisine() {
        return itemcuisine;
    }

    public void setItemcuisine(String itemcuisine) {
        this.itemcuisine = itemcuisine;
    }
    private String restaurantID;

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public String getItemcalories() {
        return itemcalories;
    }

    public void setItemcalories(String itemcalories) {
        this.itemcalories = itemcalories;
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }
}
