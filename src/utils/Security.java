/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import model.Employes;

/**
 *
 * @author 84942
 */
public class Security {
    public static Employes curentLogin=null;
    public static String encrypt(String input){
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] messageDigest=md.digest(input.getBytes());
            BigInteger number=new BigInteger(1,messageDigest);
            String hashtext=number.toString(16);
            while (hashtext.length()<32) {                
                hashtext="0"+hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
