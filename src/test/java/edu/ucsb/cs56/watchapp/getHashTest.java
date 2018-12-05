package edu.ucsb.cs56.watchapp;
import static org.junit.Assert.*;
import org.junit.Test;

public class getHashTest{
	
	public static String getHash(String str){
                Integer hash = 0;
                for(int i = 0;i<str.length();i++){
                        hash +=Character.codePointAt(str,i);
                }
                String hashStr=hash.toString(5);
                return hashStr.substring(0);
        }
	
	@Test
	public void test_getHash(){
		String str = getHash("test");
		assertTrue(Integer.parseInt(str)>0);
	}
}
