package com.practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;
public class CSVReader {
    public static BufferedReader read() {
    	try { 
    		CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
    		java.io.InputStream resource = new ClassPathResource("Corpus.CSV").getInputStream();
        	BufferedReader br = new BufferedReader(new InputStreamReader(resource));
            com.opencsv.CSVReader csvReader = new CSVReaderBuilder(br).withCSVParser(parser).build(); 
            List<String[]> allData = csvReader.readAll(); 	
            String[] nextRecord; 
            for (String[] row : allData) { 
                for (String cell : row) { 
                    System.out.print(cell + "\t"); 
                } 
                System.out.println(); 
            } 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
       return null;
    }
    public static void main(String ss[]){
    	read();
    }
}