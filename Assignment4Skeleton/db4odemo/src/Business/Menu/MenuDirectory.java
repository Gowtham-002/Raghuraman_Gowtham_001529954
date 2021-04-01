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
    
    
}
