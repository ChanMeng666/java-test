import java.io.File;
import java.sql.SQLOutput;

public class Test4
{
    public static void main(String[] args)
    {
        //23--练习题

        //23-1--获取路径中的文件名
        /* 法一
        File f1 = new File("C:/a/b/c.txt");
        String f2 = f1.getName();
        System.out.println(f2);
         */

        /* 法二
        String s = "C:/a/b/c.txt";
        int lastIndexOfFlash = s.lastIndexOf("/");
        String fileName = s.substring(lastIndexOfFlash+1);
        System.out.println(fileName);
         */

        /* （只打印文件拓展名）
        String s = "C:/a/b/c.txt";
        int lastIndexOfFlash = s.lastIndexOf(".");
        String fileName = s.substring(lastIndexOfFlash+1);
        System.out.println(fileName);
         */

        /* 法三
        String s = "C:/a/b/c.txt";
        String[] strs = s.split("/"); //在数组中以“/”为分界线进行切割
        String fileName = strs[strs.length-1]; //找到切割后的最后一坨
        System.out.println(fileName);
         */


        //23-2--用户名和密码的正确性判断（无视大小写）
        /*
        String username = " ADmIn ";
        String password = "123456";

        //法一
        String username2 = username.replace(" ","");
        System.out.println(username2.equalsIgnoreCase("admin"));
        System.out.println(password.equals("123456"));

        //法二
        if(username.trim().equalsIgnoreCase("admin") && password.equals("123456"))
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("error");
        }

         */

        //23-3--获取等号前后的值
        /*
        String s1 = "name=tomoko";
        String[] s2 = s1.split("=");
        System.out.println(s2[0]+"\n"+s2[1]);
         */

        //23-4--判断文件路径是否为jpg文件
        /*
        String s1 = "C:/a/b/Picture.JPG";

        //法一
        String s2 = s1.toLowerCase();
        System.out.println(s2.endsWith(".jpg"));

        //法二
        System.out.println(s2.toLowerCase().endsWith(".jpg"));

         */

    }
}
