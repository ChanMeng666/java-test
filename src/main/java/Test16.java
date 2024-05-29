import com.yzk18.docs.ExcelHelpers;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test16
{
    public static void main(String[] args)
    {
        //遍历excel文件

//        Workbook workbook = ExcelHelpers.openFile("C:/Users/0/Documents/Test7/_xb1.2_资产配置账本.xlsx");
//
//        for(int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++)
//        {
//            Sheet sheet = workbook.getSheetAt(sheetIndex);
//
//            for(int rowIndex = sheet.getFirstRowNum(); rowIndex <= sheet.getLastRowNum(); rowIndex++)
//            {
//                Row row = sheet.getRow(rowIndex);
//                if(row == null)
//                {
//                    continue;
//                }
//
//                for(int cellIndex = row.getFirstCellNum(); cellIndex <= row.getLastCellNum(); cellIndex++)
//                {
//                    //Cell cell = row.getCell(cellIndex); 错误写法，报错"cellIndex 应该为 >= 0 "。
//                    Cell cell = row.getCell(Math.max(cellIndex, 0));
//                    if(cell == null)
//                    {
//                        continue;
//                    }
//
//                    // cell.getStringCellValue(); 不建议这么写，因为不会做类型转换。
//                    String value = ExcelHelpers.getCellStringValue(cell);
//                    System.out.println(value);
//                }
//
//                ExcelHelpers.close(workbook);
//
//            }
//        }





        //创建一个excel文件并保存

//        XSSFWorkbook workbook = ExcelHelpers.createXLSX(); //创建xlsx文件
//        XSSFSheet sheet = workbook.createSheet(); //创建sheet
//
//        //XSSFRow row = sheet.createRow(0); 不推荐的写法，用ExcelHelpers更快。
//        ExcelHelpers.setCellValue(sheet,0,0,"Name"); //创建行、列、内容
//        ExcelHelpers.setCellValue(sheet,0,1,"Age");
//        ExcelHelpers.setCellValue(sheet,0,2,"Phone");
//
//        ExcelHelpers.setCellValue(sheet,1,0,"Tomoko");
//        ExcelHelpers.setCellValue(sheet,1,1,31);
//        ExcelHelpers.setCellValue(sheet,1,2,"0226926685"); //手机号、邮编等信息全部视为String最好。
//
//        ExcelHelpers.saveToFile(workbook,"C:/Users/0/Documents/Test7/1.xlsx");
//        ExcelHelpers.close(workbook);



    }
}
