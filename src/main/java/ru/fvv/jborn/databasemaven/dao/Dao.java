/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.fvv.jborn.databasemaven.dao;

import java.util.List;

/**
 *
 * @author slava
 */
public interface Dao<DOMAIN,ID> {
    DOMAIN findById(ID id); // находит сущность
    
    List<DOMAIN> findByAll(); //находит все сущности такого вида.
    
    DOMAIN insert (DOMAIN domain); //добавляет новую сущность в базу данных.
    
    DOMAIN update (DOMAIN domain); //когда сущность уже существует и надо сделать апдейт того что есть в базе.
    
    boolean delete(ID id); // удаление некоторой сущности из базы данных.
}
