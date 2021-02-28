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
public class City {
    public String City;
    public ArrayList<Community> communityhistory;

    City(){
        System.out.println("city created");
        this.communityhistory = new ArrayList<Community>();
    }
    
    public City(ArrayList<Community> communityhistory) {
        this.communityhistory = communityhistory;
    }

    public void addcommunitytohistory(Community c){
        this.communityhistory.add(c);
    }
    
    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public ArrayList<Community> getCommunityhistory() {
        return communityhistory;
    }

    public void setCommunityhistory(ArrayList<Community> communityhistory) {
        this.communityhistory = communityhistory;
    }
    
    
}
