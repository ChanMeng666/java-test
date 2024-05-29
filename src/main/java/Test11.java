import com.yzk18.commons.IOHelpers;

import java.io.File;

public class Test11
{
    //如果方法有返回值，则return后的数据类型必须和返回值的数据类型一致。
    //并且要讨论完整全部情况，即返回语句要涵盖所有情况。比如返回值为int,则整个数轴范围内的int都要在if和else中体现。
    static int getNumber(int i)
    {
        if(i == 0)
        {
            return 666; //不能return字符串“666”
        }
        else if (i != 0) //如果没有下面的else,看似讨论完了数轴中的所有情况，实则报错 java: 缺少返回语句
        {
            return 888;
        }
        else //就算上面已经讨论完数轴中的所有情况，也必须再单独加上else
        {
            return 777;
        }
    }

    //编写方法--取最大值
    static int getMax(int i1, int i2)
    {
        if(i1 > i2)
        {
            return i1;
        }
        else
        {
            return i2;
        }
    }

    //编写方法--接收文件名，读取并输出文件内容，若文件不存在则提示“不存在”
    static void getFile(String filename)
    {
        File file = new File(filename);
        if(file.exists() == false)
        {
            System.out.println("File not Found.");
        }
        else
        {
            String str = IOHelpers.readAllText(file);
            System.out.println(str);
        }

//        //写法二：
//        if(!file.exists())
//        {
//            System.out.println("File not Found.");
//            return; //如执行了上述代码（not found）之后return，则不再执行下述代码（read all text）
//                    //return只是结束当前的方法，并不会结束整个程序。只有main方法执行完毕后，程序才会结束。
//        }
//        String str = IOHelpers.readAllText(file);
//        System.out.println(str);
    }




    public static void main(String[] args)
    {
//        int x = 10, y = 5;
//        int z = getMax(x,y);
//        System.out.println(z);

//        getFile("C:/Users/0/Downloads/COMP 637/翻译.txt");

//        System.out.println(getNumber(0));

    }
}
