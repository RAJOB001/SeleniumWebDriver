package com.datadriventests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		// file -> workbook -> sheet -> row -> cell
		//FileInputStream ->XSSFWorkbook -> XSSFSheet -> XSSFRow -> XSSFCell
		FileInputStream file = new FileInputStream("C:\\Users\\RAJOB001\\Documents\\02May_08May_Panel Availability_DU2.xlsx");    // instancing file

		XSSFWorkbook book = new XSSFWorkbook(file);
		//XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\RAJOB001\\Documents\\02May_08May_Panel Availability_DU2.xlsx");    // creating object for book class

		XSSFSheet sheet = book.getSheetAt(0);  // object for sheet

		int row_count = sheet.getLastRowNum();

		int col_count = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < row_count; i++) {

			XSSFRow current_row = sheet.getRow(i);   // focussed on current row
			for (int j = 0; j < i; j++) {
				String value= current_row.getCell(j).toString();
				System.out.println("    "+value);
			}
		}

	}

}
