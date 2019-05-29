package MurodulReviw;

import java.util.*;
import java.io.*;

public class FileToList {
	public static void main(String[] args) throws FileNotFoundException {
		 File file = new File("products.txt");
	        Scanner scan = new Scanner (file);
	        //System.out.println(scan.nextLine());
	        
	        //hasNextLine will be true if ther is line of data
	        
	        ArrayList<String>data=new ArrayList<>();
	        while(scan.hasNextLine()) {
	            String line= scan.nextLine();
	            System.out.println(line);
	            data.add(line);
	        }
	        System.out.println("Number of products:"+data.size());
	        System.out.println(data.toString());
	        /*//while(scan.hasNextLine()) {
	            System.out.println(scan.hasNextLine());//true
	            System.out.println(scan.nextLine());
	            System.out.println(scan.nextLine());
	            while(scan.hasNextLine()) {
	                //it reads a line and switches to next line
	                System.out.println(scan.nextLine());
	                data.add(scan.nextLine());*/
	            }
	        }
