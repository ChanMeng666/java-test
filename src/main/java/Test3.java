import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public class Test3
{
    public static void main(String[] args)
    {
        //程序=数据（数组）+命令（方法，函数）+逻辑（for,if,while）

        //20--文件
        //20-1--对文件的打印和判断
        /*
        File f1 = new File("C:/Users/0/Documents/1.txt");
        System.out.println(f1);
        System.out.println(f1.exists());
        System.out.println(f1.getName());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        */

        //20-2--遍历文件夹里的文件（仅下一级）
        /*
        File f2 = new File("C:/Users/0/Documents");
        String[] files = f2.list();
        for(String n:files)
        {
            System.out.println(n);
        }
         */

        //20-3--创建、删除
        /*
        File f3 = new File("C:/Users/0/Documents/a");
        //f3.mkdirs();
        f3.delete();
         */

        //21--日期、时间
        /*
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        LocalDate d2 = LocalDate.of(2023,12,28);
        System.out.println(d2);
        LocalDate d3 = LocalDate.parse("2008-08-08");
        System.out.println(d3);

        System.out.println(d1.getMonth());
        System.out.println(d1.getMonthValue());

        System.out.println(LocalTime.now());//获取此刻时间（法一）

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);//获取此刻时间（法二）
         */


        //22--String常用方法
        /*
        String strs = "tomoko";

        System.out.println(strs.length());//带（），因为length为方法。
        int[] nums = {1,2,3};
        System.out.println(nums.length);//不带（）。

        char c1 = strs.charAt(0);//获取String中的第一个字符。
        System.out.println(c1);

        System.out.println(strs.contains("m"));//检测该字符在String中是否存在。

        String strs2 = strs.replace("o","*");//字符替换
        System.out.println(strs2);
         */

        /*
        String strs3 = "tomoko，kuroki，best，good";
        String[] s = strs3.split("，");//用String中的分隔符（，/；。、或空格等）进行切割
        for(String n:s)
        {
            System.out.println(n);
        }
         */

        /*
        String strs4 = "www.baidu.com";
        if(strs4.startsWith("http://") || strs4.startsWith("https://") || strs4.startsWith("www"))
        {
            System.out.println("是网址");
        }
        else
        {
            System.out.println("不是网址");
        }
        //粗略判断是否是网址

        System.out.println(strs4.endsWith("com"));
        */

        /*
        String email = "904937241@qq.com";
        if(email.contains("@") &&! email.startsWith("@") &&! email.endsWith("@"))
        {
            System.out.println("是邮箱");
        }
        else
        {
            System.out.println("不是邮箱");
        }
        //粗略判断是否是邮箱
         */

        /*
        String s1 = "ABCabc";
        String s2 = "ABcabc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2)); //无视大小写进行比较。

        System.out.println(s1.indexOf("B")); //查找字符位置。
        System.out.println(s1.lastIndexOf("B"));

        String s3 = s1.substring(3,5); //截取字符串的其中一段，相当于[3,5)左闭右开，即从3开始，到5结束（不包括5）。
        System.out.println(s3);
         */

        /*
        String s4 = " A B C D ";

        String s5 = s4.trim(); //去掉字符串的首尾空格
        System.out.println(s5);

        String s6 = s4.replace(" ",""); //去掉全部空格
        System.out.println(s6);

        String s7 = s4.toLowerCase(); //改为小写字母
        System.out.println(s7);
        System.out.println(s7.toUpperCase()); //改为大写字母
         */

    }
}
