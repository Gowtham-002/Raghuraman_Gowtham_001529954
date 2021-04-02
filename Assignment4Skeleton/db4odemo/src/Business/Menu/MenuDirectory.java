/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author gowth
 */
public class MenuDirectory {
     private ArrayList<Item> menuDirectory;

     public MenuDirectory(){
        menuDirectory = new ArrayList<Item>();
    }

    public ArrayList<Item> getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(ArrayList<Item> menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    public void add(String restaurantId, String name, double price, String calories,String cuisine) {     
        Item item = new Item();
        item.setItemID("MenuItem"+(menuDirectory.size()+1));
        item.setItemName(name);
        item.setItemprice(price);
        item.setRestaurantID(restaurantId);
        item.setItemcalories(calories);
        item.setItemcuisine(cuisine);
        menuDirectory.add(item);
    }
    
    public Item fetchItem(String itemId){
        for(Item item: menuDirectory){
            if(item.getItemID().equalsIgnoreCase(itemId)){
                return item;
            }
        }
        return null;
    }

    public void updateItem(String itemNo, String itemName, Double price,String calories,String cuisine) {
        for(Item item: menuDirectory){
            if(item.getItemID().equalsIgnoreCase(itemNo)){
                item.setItemName(itemName);
                item.setItemcalories(calories);
                item.setItemcuisine(cuisine);
                item.setItemprice(price);
            }
        }
    }
    
    public void deleteItem(String id){
        for(int i =0; i< menuDirectory.size();i++){
            if(menuDirectory.get(i).getItemID().equalsIgnoreCase(id)){
                menuDirectory.remove(i);
            }
        }
    }
    
    public Item getItemByKey(int key){
        return menuDirectory.get(key);
    }
    
}
