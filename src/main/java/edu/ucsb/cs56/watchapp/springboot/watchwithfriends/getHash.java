package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;
public class getHash{
	public static String getHash(String str){
 		Integer hash = 0;
		for(int i = 0;i<str.length();i++){
			hash +=Character.codePointAt(str,i);
		}
		String hashStr=hash.toString(5);
		return hashStr.substring(0,6);
	}
}



