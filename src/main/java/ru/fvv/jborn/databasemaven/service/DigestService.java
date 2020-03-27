/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.fvv.jborn.databasemaven.service;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author slava
 */
public class DigestService {
    private static DigestService instance;
    public static DigestService getDigestService(){
        if(instance == null){
            instance = new DigestService();
        }
        return instance;
    }
    public String digest(String password){
        return DigestUtils.md5Hex(password);
    }
}
