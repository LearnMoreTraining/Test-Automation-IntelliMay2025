package base;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandler {

    public static String getExcelData(String SheetName , int row , int column){
        FileInputStream fileInputStream ;
        try {
             fileInputStream =
                    new FileInputStream(new File("src/main/resources/data/TestData.xlsx"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook;
        try {
             workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

      XSSFSheet sheet=  workbook.getSheet(SheetName);
      return  sheet.getRow(row).getCell(column).getStringCellValue();
    }
}
