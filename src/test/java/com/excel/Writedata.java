package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\maven\\excel\\excelcolour.xlsx");
        FileInputStream fis= new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.createSheet("exelcolour");
        XSSFRow row = sheet.createRow(2);
        
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        cellStyle.setFillPattern(FillPatternType.FINE_DOTS);
        
        XSSFCell cell = row.createCell(3);
        cell.setCellValue("nadhan");
        cell.setCellStyle(cellStyle);
        
        FileOutputStream fos = new FileOutputStream(file);
        workbook.write(fos);
        workbook.close();
	}
}