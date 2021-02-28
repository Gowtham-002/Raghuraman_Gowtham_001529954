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
public class House {
    
    public int houseNo;
    
    public ArrayList<Person> person;

    public House() {
        this.person = new ArrayList<Person>();
    }
    
    public void addpersonhouse(Person p){
        this.person.add(p);
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

 

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
    
}
