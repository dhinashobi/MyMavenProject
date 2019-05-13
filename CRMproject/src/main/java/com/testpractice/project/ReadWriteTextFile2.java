package com.testpractice.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteTextFile2 {
	
	public static void readWriteTxtFile2(String src) {
		String src1 = "";
		try {
		FileReader file = new FileReader(src);
		BufferedReader br = new BufferedReader(file);
		String st ;
		while((st=br.readLine())!=null){
			System.out.println(st);			
		}
		
		}		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void readtxtfile2() {
		
		String src = "C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\Login details_1.txt";
		
		List<String> lines = new LinkedList<String>();
		
		try {
		lines = Files.readAllLines(Paths.get(src));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		Iterator<String> itr = lines.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	public static void main(String[] args) {
		
		readtxtfile2();
	}

}
