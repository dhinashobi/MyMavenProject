package com.testpractice.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class ReadWriteTextFile {
	
	
	public static void readTextFile() throws IOException {
		String src = "C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\Login details_1.txt";
		FileReader file = new FileReader(src);
		BufferedReader br = new BufferedReader(file);
		String st;
		while ((st = br.readLine())!=null){
			System.out.println(st);
		}
	}
	
	public static void writeTextFile() {
		String src = "C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\Login details_1.txt";
		try {
			FileWriter fw = new FileWriter(src);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("This is my first program to write the text file");
			bw.newLine();
			bw.write("This my second line to write it text file");
			bw.newLine();
			bw.write("This is my third line");
			bw.close();			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void readFileInList(){
		String fileName = "C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\Login details_1.txt";
		List<String> lines = new LinkedList<String>();
		try {lines = Files.readAllLines(Paths.get(fileName));}
		catch(IOException e){e.printStackTrace();}
		for(String val:lines){System.out.println(val);}}
	
	
	public static String maxRepeatedChar(String str) {
		
		int maxcount =1;
		String s = String.valueOf(str.charAt(0));
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					
					count++;				
				}
				
			}
			if(maxcount<count) {
				maxcount = count;
				s= String.valueOf(str.charAt(i));
			}
			
		}
		return (s+"="+maxcount);
		
	}
	public static void main(String[] args) {
		
		System.out.println(maxRepeatedChar("gggeeksofgeeks"));
		
	}}
