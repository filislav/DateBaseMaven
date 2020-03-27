/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.fvv.jborn.databasemaven.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import ru.fvv.jborn.databasemaven.dao.Dao;
import ru.fvv.jborn.databasemaven.dao.domain.Contact;
import ru.fvv.jborn.databasemaven.dao.DaoFactory;
import static ru.fvv.jborn.databasemaven.dao.DaoFactory.getConnection;

/**
 *
 * @author slava
 */
public class ContactDao implements Dao<Contact,Integer>{
    private static ContactDao contactDao;
    public static ContactDao getContactDao(){
        if(contactDao==null){
            contactDao = new ContactDao();
        }
        return contactDao;
    }
    @Override
    public Contact findById(Integer id){
        Contact contact =null;
        try(Connection connection = getConnection()){
            PreparedStatement ps = connection.prepareStatement("select*from contact where id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                contact = new Contact();
                contact.setId(rs.getInt("id"));
                contact.setFiratName(rs.getString("first_name"));
                contact.setLastName(rs.getString("last_name"));
            }
        }catch(SQLException e){
            
        }
        return contact;
    }

    @Override
    public List<Contact> findByAll() {
        return null;
    }

    @Override
    public Contact insert(Contact domain) {
        return null;
    }

    @Override
    public Contact update(Contact domain) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
    
}
