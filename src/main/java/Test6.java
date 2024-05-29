import com.google.zxing.Result;
import com.sun.media.jfxmedia.events.NewFrameEvent;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.QRCodeHelpers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6
{
    public static void main(String[] args)
    {
        //检测文件夹中是否含有二维码图片
        /*
        Boolean QRCodeFound = false; //定义一个变量，表示“是否找到二维码”，默认为找不到
        String[] files = IOHelpers.getFilesRecursively("C:/Users/0/Documents","jpg","png","gif");
        for(String file:files) //遍历每一个文件
        {
            Result result = QRCodeHelpers.parseImage(file);
            //System.out.println(result);  //观察二维码图片和非二维码图片的区别
            if(result != null)
            {
                QRCodeFound = true;
                break;
            }
        }

        if(QRCodeFound)
        {
            System.out.println("Find the QRCode");
        }
        else
        {
            System.out.println("Can't find the QRCode");
        }
         */


        //[作业] 检测文件夹中是否存在二维码图片，如果有，则检查是否为网址。是的话，输出“有链接”，否则，输出“检测通过”。
        /*
        String[] files = IOHelpers.getFilesRecursively("C:/Users/0/Documents","jpg","png","gif");
        //System.out.println(Arrays.toString(files));
        for(String file:files)
        {
            //System.out.println(file);
            Result result = QRCodeHelpers.parseImage(file);
            System.out.println(result);

            if(result != null)
            {
                if(result.getText().startsWith("http://") || result.getText().startsWith("https://") || result.getText().startsWith("www"))
                {
                    System.out.println("Have link");
                    continue;
                }
                else
                {
                    System.out.println("Pass");
                }
            }
            else
            {
                System.out.println("Non-QRCode");
            }
        }
        */


        //分析学生成绩并输出到单人专属的新文件
        /*
        String[] lines = IOHelpers.readAllLines("C:/Users/0/Documents/1.txt");
        for(String line:lines)
        {
            //System.out.println(line);
            String[] strs = line.split(",");

            String name = strs[0];
            double course1 = Double.parseDouble(strs[1]);
            double course2 = Double.parseDouble(strs[2]);
            double course3 = Double.parseDouble(strs[3]); //数组中的字符串 转 小数

            double average = (course1 + course2 + course3)/3;
            String averageKeepTwoDecimals = String.format("%.2f",average); //平均分算完之后，保留两位小数
            double averageShort = Double.parseDouble(averageKeepTwoDecimals);

            String individualScore = name+"\n"+"course1:"+course1+"  "+"course2:"+course2+"  "+"course3:"+course3+"  "+"Average:"+averageShort;
            String fileName = "C:/Users/0/Documents/"+name+".txt";
            IOHelpers.writeAllText(fileName,individualScore); //分别创建个人的txt文件
        }
        */


        //[作业] 读取一个文件（各科成绩），并生成另一个文件（平均成绩）

        String[] lines = IOHelpers.readAllLines("C:/Users/0/Documents/2.txt");


        for(String line:lines)
        {
            //System.out.println(line);
            String lineReplace = line.replace(" ","");
            //System.out.println(lineReplace);

            String[] strs = lineReplace.split("，"); //注意查看，在我预设的txt文件中，分隔符是中文字符“，”！！
            //System.out.println(Arrays.toString(strs)); //已弄出四个数组

            String name = strs[0];
            //System.out.println(name);

            double sum = 0;
            for(int x = 1; x < strs.length; x++)
            {
                sum = sum + Double.parseDouble(strs[x]);
            }
            //System.out.println(sum);

            double average = sum/(strs.length-1);
            String averagaKeepTwoDecimals = String.format("%.2f",average);
            //System.out.println(averagaKeepTwoDecimals);

            //鸡肋，可不用
            //double averageShort = Double.parseDouble(averagaKeepTwoDecimals);

            String content = name+"\n"+"Overall Bandscore："+averagaKeepTwoDecimals+"\n";
            //System.out.println(content);


            //~以下出现两条分支~

            //【创建、写入txt文件--法一】
            /*
            String fileName = "C:/Users/0/Documents/Overall Bandscore.txt";

            IOHelpers.appendAllText(fileName,content);
            //此处若写writeAllText，则出现 前一个元素被后一个元素覆盖，txt里只显示最后一个元素的情况。
            */



            //【创建、写入txt文件--法二】

            //创建新txt（这步可省去）
            /*
            try
                File file = new File("C:/Users/0/Documents/Overall Bandscore.txt");
                file.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            */

            //在txt文件中写入内容（只做这一步就能直接实现 创建+写入）
            /*
            try
            {
                FileWriter fW = new FileWriter("C:/Users/0/Documents/Overall Bandscore.txt",true);
                //append:true 即为 不覆盖式写入

                // 【法一】
                fW.write(content);
                fW.close();

                // 【法二】
                //BufferedWriter bW = new BufferedWriter(fW);
                //bW.write(content);
                //bW.close();
                //fW.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            */

        }
    }
}
