package com.testpractice.project;

public class repeatmaxchar {
	
	private static String findMaxChar(String str) {
	    char[] array = str.toCharArray();
	    int maxCount = 1;
	    char maxChar = array[0];
	    for(int i = 0, j = 0; i < str.length() - 1; i=j){
	        int count = 1;
	        while (++j < str.length() && array[i] == array[j]) {
	            count++;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxChar = array[i];
	        }
	    }
	    return (maxChar + " = " + maxCount);
	}

	

	public static void main(String[] args) {
		
		System.out.println(findMaxChar("GEEKSOFGEEKS"));
		
		  System.out.println(findMaxChar("TDD"));
		  System.out.println(findMaxChar("WWW"));
		  System.out.println(findMaxChar("NOREPEATS"));
		  System.out.println(findMaxChar("122333444455555"));
		  System.out.println(findMaxChar("Abc33++$$P$_###*ABCC"));
		 
	}

}
