
package ru.fvv.jborn.databasemaven;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.fvv.jborn.databasemaven.dao.ContactDao;
import ru.fvv.jborn.databasemaven.dao.domain.Contact;

/**
 *
 * @author slava
 */
public class Main {
       
    public static void main(String[] args) {
          ContactDao contactDao = ContactDao.getContactDao();
          Contact contact = contactDao.findById(1);
          System.out.println(contact);
    }
    }
    
