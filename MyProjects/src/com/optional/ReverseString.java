package com.optional;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "Hello this is saravanan";
		String[] arr = a.split(" ");
		String revstring=" ";
		
		for(int i=0; i<arr.length; i++) {
			String word=arr[i];
			String revword=" ";
			for(int j=word.length()-1; j>=0; j--) {
				revword+=word.charAt(j);
			}
			revstring+=revword;
			//System.out.println(word);ew
			
			
		} 
		
		System.out.println(a);
		System.out.println(revstring.trim());
	}

}
