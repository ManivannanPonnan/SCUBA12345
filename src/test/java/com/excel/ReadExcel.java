package com.excel;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Set;

import com.codoid.products.exception.FilloException;

public class ReadExcel {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FilloException, ParseException {
		
		TestData data =new TestData();
		
		Hashtable<String, String> common_Data = data.getCommon_Data("C:\\Users\\Toshiba\\workspace\\ApiProject\\APi testCases.xlsx", "Test_case_ID", "TC_001","Payment");
		
Set<String> keySet = common_Data.keySet();		
for(String string:keySet){	
	String val = common_Data.get(string);
	System.out.println("Keys: "+string +" Value: " +val);
			
	
	
}
}
		
	}


