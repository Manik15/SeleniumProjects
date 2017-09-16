package com.eCom.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
public static void main(String[] args) throws IOException {
	String excelPath="pathToexcel";
	FileInputStream fis=new FileInputStream(new File(excelPath));
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
}
}
