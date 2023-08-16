package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multipleread {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\maven\\excel\\WRITE.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = Workbook.getSheet("sheet1");
		
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(1).getLastCellNum();
		System.out.println(lastRowNum);
		System.out.println(lastCellNum);
		
		for(int r=0; r<=lastRowNum;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<lastCellNum;c++) {
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType()) {
				
				case STRING: System.out.print(cell.getStringCellValue());
				break;
				
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				break;
				default:
					break;
				}
				System.out.print("||");
			}
			System.out.println();
		}
	}

}
