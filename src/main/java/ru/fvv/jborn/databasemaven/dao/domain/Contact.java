/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.fvv.jborn.databasemaven.dao.domain;

/**
 *
 * @author slava
 */
public class Contact {
    private Integer id;
    private String firatName;
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFiratName() {
        return firatName;
    }

    public void setFiratName(String firatName) {
        this.firatName = firatName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", firatName=" + firatName + 
                ", lastName=" + lastName + '}';
    }
    
    
    
}
