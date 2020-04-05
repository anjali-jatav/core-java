package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class EnhancedReader {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("log.txt"))){
//		  BufferedWriter bw=new BufferedWriter(new FileWriter("lognew.txt"))){
			String value=null;
			while((value=br.readLine())!=null) {
//				int count = 0;
				 Map<String, Long> collect = br.lines().collect(Collectors.groupingBy(String::toString,Collectors.counting()));
				 collect.forEach((k,v)->System.out.println(k+" "+v));
//				bw.write(value);
//				bw.write("\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
