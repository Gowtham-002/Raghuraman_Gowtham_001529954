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
public class PersonDirectory {
    
    public ArrayList<Person> personarray;

   /* public PersonDirectory(ArrayList<Person> personarray) {
        this.personarray = personarray;
    }*/

    public PersonDirectory() {
        this.personarray = new ArrayList<Person>();
    }
    
    
    
public void addperson(Person P){
    this.personarray.add(P);
}
  

    public ArrayList<Person> getPersonarray() {
        return personarray;
    }

    public void setPersonarray(ArrayList<Person> personarray) {
        this.personarray = personarray;
    }
}
