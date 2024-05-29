import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.ExcelHelpers;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Test17
{
    public static void main(String[] args)
    {
        //遍历文件夹中每一个excel文件中的每一个单元格，模糊查找并定位所需信息

//        String[] files = IOHelpers.getFilesRecursively("C:/Users/0/Documents/Test7","xlsx");
//        for(String file: files)
//        {
//            Workbook workbook = ExcelHelpers.openFile(file);
//
//            for(int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++)
//            {
//                Sheet sheet = workbook.getSheetAt(sheetIndex);
//
//                for(int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++)
//                {
//                    Row row = sheet.getRow(rowIndex);
//
//                    if(row == null)
//                    {
//                        continue;
//                    }
//
//                    for(int cellIndex = 0; cellIndex <= row.getLastCellNum(); cellIndex++)
//                    {
//                        Cell cell = row.getCell(cellIndex);
//
//                        if(cell == null)
//                        {
//                            continue;
//                        }
//
//                        String value = ExcelHelpers.getCellStringValue(cell);
//
//                        if(value == null)
//                        {
//                            continue;
//                        }
//
//                        if(value.contains("5"))
//                        {
//                            System.out.println("文件位置："+file+",表格位置："+sheet.getSheetName()+",第"+rowIndex+"行,第"+cellIndex+"列。");
//                        }
//
//                    }
//                }
//            }
//        }




        //





    }
}
