package com.amazon.utilities;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider {
 @DataProvider(name = "TC_001")
 
 public String[][] getexceldata() throws IOException {
 String [][] data = new String[1][8];
 String excelpath= "C:\\Users\\anandhakrishnan.b\\OneDrive - HCL Technologies Ltd\\Documents\\AmazonTestData.xlsx";
 FileInputStream input1=new FileInputStream(excelpath);
 XSSFWorkbook workbook=new XSSFWorkbook(input1);
 XSSFSheet sheet=workbook.getSheet("Sheet1");
 int rowcount=sheet.getPhysicalNumberOfRows();
 for(int i=0;i<rowcount;i++)
{
 data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
 System.out.println(data[i][0]);
 
 data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
 System.out.println(data[i][1]);

 data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
 System.out.println(data[i][2]);

 data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
 System.out.println(data[i][3]);

 data[i][4]= String.valueOf(sheet.getRow(i).getCell(4).getRawValue());
  System.out.println(data[i][4]);
 data[i][5]= String.valueOf(sheet.getRow(i).getCell(5).getRawValue());
 System.out.println(data[i][5]);
 data[i][6]=sheet.getRow(i).getCell(6).getStringCellValue();
 System.out.println(data[i][6]);
 data[i][7]=sheet.getRow(i).getCell(7).getStringCellValue();
 System.out.println(data[i][7]);
}
 return data; }
 
 
 

@DataProvider(name = "TC_002")

public String[][] getexceldata1() throws IOException {
String [][] data = new String[1][3];
String excelpath= "C:\\\\Users\\\\anandhakrishnan.b\\\\OneDrive - HCL Technologies Ltd\\\\Documents\\\\AmazonTestData.xlsx";
FileInputStream input1=new FileInputStream(excelpath);
XSSFWorkbook workbook=new XSSFWorkbook(input1);
XSSFSheet sheet=workbook.getSheet("Sheet2");
int rowcount=sheet.getPhysicalNumberOfRows();
for(int i=0;i<rowcount;i++)
{
data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
System.out.println(data[i][0]);

data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
System.out.println(data[i][1]);

data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
System.out.println(data[i][2]);

}
return data; }

}
