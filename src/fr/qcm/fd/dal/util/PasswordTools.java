package fr.qcm.fd.dal.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordTools
{
	//Singleton
	private static PasswordTools instance= new PasswordTools();
	
	//Constructor
	private PasswordTools ()
	{
		
	}
	
	//pseudo-constructor
	public static PasswordTools getInstance()
	{
		return instance;
	}
	
	//hash method
	public String hashMD5 (String pass)
	{
		byte[] passBytes = pass.getBytes();
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(passBytes);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(passBytes);
            BigInteger number = new BigInteger(1, messageDigest);
            return number.toString(16);
            }
        catch (NoSuchAlgorithmException e)
        {
        	throw new Error("invalid JRE: have not 'MD5' impl.", e);
        }
	}
}
