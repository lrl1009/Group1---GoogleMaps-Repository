package sru.edu.luczak.GoogleMaps.controller;

import java.io.*;
import java.sql.*;
import java.util.*;
 
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.boot.SpringApplication;

import sru.edu.luczak.GoogleMaps.domain.PickupPoint;


//import java.util.Date;     //Use if date is needed

public class PickupPointController { 	
 
	public static void main(String[] args) throws SQLException, IOException {
		
		//Connect to the Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pickuppoints?useSSL=false&serverTimezone=UTC", "root", "root");
		Statement stmt = con.createStatement();
		String sql;
		
		
		// check if "pickupPoint" table is in the database
		DatabaseMetaData dbm = con.getMetaData();
		ResultSet tables = dbm.getTables(null, null, "pickup_point", null);
		   
	    
	    //Excel
		//Look into the resource folder for PickupPoitInfo so we don't need to trace the directory every time.
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("PickupPointInfo.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(is);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    
	    int rows=sheet.getLastRowNum();
	    
	    //Add data from the excel sheet into the database
	    for(int r=1; r<=rows;r++)
	    {
	    	XSSFRow row=sheet.getRow(r);
	    	String id = row.getCell(0).getStringCellValue();
	    	int studentCount = (int) row.getCell(1).getNumericCellValue();
	    	String pickupPointName = row.getCell(2).getStringCellValue();
	    	String roadName = row.getCell(3).getStringCellValue();
	    	float longitude = (float) row.getCell(4).getNumericCellValue();
	    	float latitude =  (float) row.getCell(5).getNumericCellValue();
	    	
	    	sql="INSERT INTO pickup_point values('"+id+"', '"+latitude+"', '"+longitude+"', '"+pickupPointName+"', '"+roadName+"', '"+studentCount+"')";
	    	stmt.execute(sql);
	    	stmt.execute("commit");
	    }
	    
	    workbook.close();
	    is.close();
	    con.close();
	    
	    System.out.println("Done");	
    } 
}
