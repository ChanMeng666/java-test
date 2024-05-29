import com.yzk18.commons.CommonHelpers;
import com.yzk18.commons.JDBCExecutor;
import com.yzk18.commons.JDBCRow;

import java.util.List;

public class SQL
{
    public static void main(String[] args)
    {
        //JDBC库的使用


        JDBCExecutor jdbcExecutor = new JDBCExecutor("jdbc:sqlite:D:/test1.db",null,null);

        //插入数据，直插入一次的话，用完记得关
        //jdbcExecutor.execute("insert into T_Authors(Name,Age) values('hahaha',20)");

        //SQL select 写法一：

//        List<JDBCRow> rows =  jdbcExecutor.query("select * from T_Books");
//        for(JDBCRow row: rows)
//        {
//            long ID = row.getLong("id");
//            String name = row.getString("name");
//            int page = row.getInt("page");
//            System.out.println("ID："+ID+",Name:"+name+",Page:"+page);
//        }


        //SQL select 写法二：

//        // 先新建一个类（即新的java文件），命名跟table一致，叫Authors
//        List<Authors> authors = jdbcExecutor.query(Authors.class,"select * from T_Authors where age > 30");
//        //Authors.class, //注意前一个是句号，后一个是逗号！
//        for(Authors a: authors)
//        {
//            System.out.println(a);
//            System.out.println(a.getName());
//        }


        //JDBC的参数化查询

        //容易出现“SQL注入漏洞”的写法：

//        System.out.println("请输入用户名：");
//        String name = CommonHelpers.readLine();
//        System.out.println("请输入年龄：");
//        int age = CommonHelpers.readInt();
//
//        String sql = "insert into T_Authors(name,age) values('"+name+"',"+age+")";
//        System.out.println(sql);
//        jdbcExecutor.execute(sql);
        //'"+name+"',"+age+" //' " + name + " '  这个写法叫字符串拼接，name为String类型，age为int类型
        //这样拼接的写法非常危险。


        //容易出现“SQL注入漏洞”的写法： //再次举例，解释漏洞

//        System.out.println("请输入用户名：");
//        String username = CommonHelpers.readLine();
//        System.out.println("请输入密码：");
//        String password = CommonHelpers.readLine();
//
//        String sql = "select * from T_Users where Username = '"+username+"' and Password = '"+password+"'";
//        System.out.println(sql);
//        List<JDBCRow> rows = jdbcExecutor.query(sql);
//        if(rows.size() <= 0)
//        {
//            System.out.println("登陆失败。");
//        }
//        else
//        {
//            System.out.println("登录成功。");
//        }
        //当密码输入' or '1'='1时，SQL语句字符串拼接成了：
        //select * from T_Users where Username = 'kuroki' and Password = '' or '1'='1'
        //where之后这句话是恒TRUE的，则相当于只执行select * from T_Users
        //这就是“SQL注入漏洞”的危险之处


        //解决SQL注入漏洞：参数化查询（杜绝字符串拼接）

        System.out.println("请输入用户名：");
        String username = CommonHelpers.readLine();
        System.out.println("请输入密码：");
        String password = CommonHelpers.readLine();

        List<JDBCRow> rows = jdbcExecutor.query("select * from T_Users where Username = ? and Password = ?",username,password);
        //不再字符串拼接，而是用？代替输入，直接比较输入的字符串值 和 数据库的字符串值。
        // " ' or '1'='1 " != "真正的密码"
        if(rows.size() <= 0)
        {
            System.out.println("登陆失败。");
        }
        else
        {
            System.out.println("登录成功。");
        }


        //总结：使用JDBC时，尽量避免SQL拼接。（用？代替，后面再按顺序提供值）
        //execute方法也支持参数化查询



    }
}
