/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import java.util.ArrayList;

/**
 *
 * @author gowth
 */
public class Community {
    public String Community;
    public ArrayList<House> houselist;

    public Community() {
        this.houselist = new ArrayList<House>();
    }

    public void addHousetocommunity(House H){
        this.houselist.add(H);
    }
    
    
    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public ArrayList<House> getHouse() {
        return houselist;
    }

    public void setHouse(ArrayList<House> houselist) {
        this.houselist = houselist;
    }
    
    
}
