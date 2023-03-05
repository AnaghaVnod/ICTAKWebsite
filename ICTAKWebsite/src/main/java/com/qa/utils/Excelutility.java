package com.qa.utils;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	
	public static XSSFWorkbook excelwbook;
	public static XSSFSheet excelwsheet;
	
	
	public static String getCellData(int RowNum, int ColNum, String ExcelPath, int SheetNum) throws IOException
	{
		
		FileInputStream Excel = new FileInputStream(ExcelPath);
				excelwbook=new XSSFWorkbook(Excel);
		excelwsheet=excelwbook.getSheetAt(SheetNum);
		return excelwsheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
		

	}


	public static String getIntegerData(int RowNum, int ColNum) throws IOException
	{
		FileInputStream Excel = new FileInputStream("D:\\Eclipse workspace\\ICTWebsite\\src\\main\\resources\\Excelutility.xlsx");
		excelwbook=new XSSFWorkbook(Excel);
    excelwsheet=excelwbook.getSheetAt(0);
    return excelwsheet.getRow(RowNum).getCell(ColNum).getRawValue();

	}
	

	



}
	
	
	

