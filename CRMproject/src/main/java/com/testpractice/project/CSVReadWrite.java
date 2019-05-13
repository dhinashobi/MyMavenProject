package com.testpractice.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class CSVReadWrite {	
	public static void csvRead() {
		
		String src = "C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\FT_JIRA_Issue_Status1.csv";
		
		try {
			FileReader file = new FileReader(src);
			BufferedReader br = new BufferedReader(file);
			String line;
			HashMap<String, String> map = new LinkedHashMap<String, String>();
			while((line=br.readLine())!=null) 
			{
				
			String str[] = line.split(",");
			map.put(str[0],str[1]);
						
			}
			System.out.println(map);
		}  
		 catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		csvRead();

	}}

	
		
		
		
		
	