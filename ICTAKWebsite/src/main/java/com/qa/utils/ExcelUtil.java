package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelWSheet;
	
	public static String getCellData(int rowNum,int colNum,String excelPath,int sheetNum) throws IOException
	{
		FileInputStream excel=new FileInputStream(excelPath);
		excelWbook=new XSSFWorkbook(excel);
		excelWSheet=excelWbook.getSheetAt(sheetNum);
		return excelWSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			
	}

}
