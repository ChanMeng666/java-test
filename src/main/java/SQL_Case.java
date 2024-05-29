import com.yzk18.commons.JDBCExecutor;
import com.yzk18.commons.JDBCRow;
import com.yzk18.docs.ExcelHelpers;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

public class SQL_Case
{
    public static void main(String[] args)
    {
        //JDBC案例：excel表格分析

        JDBCExecutor jdbcExecutor = new JDBCExecutor("jdbc:sqlite:D:/test1.db",null,null);

//        //打开excel文件
//        Workbook workbook = ExcelHelpers.openFile("C:/Users/0/Documents/Test7/JDBC_Test_1.xlsx");
//
//        //读取excel数据
//        Sheet sheet = workbook.getSheetAt(0);
//        for(int i = 1; i <= sheet.getLastRowNum(); i++)
//        {
//            String date = ExcelHelpers.getCellStringValue(sheet,i,0);
//            String name = ExcelHelpers.getCellStringValue(sheet,i,1);
//            String ID = ExcelHelpers.getCellStringValue(sheet,i,2);
//            Double buy = ExcelHelpers.getCellDoubleValue(sheet,i,3);
//            Double sell = ExcelHelpers.getCellDoubleValue(sheet,i,4);
//            //System.out.println("Date:"+date+",Name:"+name+",ID:"+ID+",Buy:"+buy+",Sell:"+sell);
//
//            //将excel数据插入数据库.db文件的table中
//            String Buy_or_Sell = buy!=null?"Buy":"Sell"; //buy是否非空？是 为Buy，否 为Sell，接着赋值给Buy_or_Sell
//            Double amount = buy!=null?buy:sell;
//            jdbcExecutor.execute("insert into T_JDBC_Test1(Date,Name,ID,Amount,Buy_or_Sell) values(?,?,?,?,?)",date,name,ID,amount,Buy_or_Sell);
//        }


        //数据库添加内容完成后，记得注释掉（关掉）

        //统计总Sell(总卖出金额)
//        JDBCRow row = jdbcExecutor.query("select sum(Amount) as 总卖出金额 from T_JDBC_Test1 where Buy_or_Sell='Sell'").get(0);
//        Double amount = row.getDouble("总卖出金额");
//        System.out.println(amount);

        //分组统计
        List<JDBCRow> rows = jdbcExecutor.query("select name,sum(amount) as 总卖出金额 from T_JDBC_Test1 where Buy_or_Sell='Sell' group by name");
        for(JDBCRow row : rows)
        {
            String name = row.getString("name");
            Double amount = row.getDouble("总卖出金额");
            System.out.println(name+"总卖出金额为"+amount);
        }



    }
}
