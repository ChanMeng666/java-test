import com.google.zxing.Result;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.ImageHelpers;
import com.yzk18.commons.QRCodeHelpers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

public class Test5
{
    public static void main(String[] args)
    {
        //24--【yzk库】的使用
        /*
        String s = IOHelpers.readAllText("C:/Users/0/Documents/Test/1.txt/");
        System.out.println(s);
         */

        /* 此库可以把非空文件夹也删掉。
        File file = new File("C:\\Users\\0\\Documents\\Test\\");
        IOHelpers.deleteDir(file);
         */

        /* 自动检测编码
        System.out.println(IOHelpers.detectTextEncoding("C:\\Users\\0\\Documents\\NZ Student Visa\\免服务费学生签证合同AGREEMENT FOR SERVICES AND FEES.pdf"));
         */

        /*
        System.out.println(IOHelpers.getExtension("C:/Users/0/Documents/NZ Student Visa/免服务费学生签证合同AGREEMENT FOR SERVICES AND FEES.pdf"));
         */

        /* 列出 文件夹及其子代文件夹内 所有相应后缀名的文件
        String[] files = IOHelpers.getFilesRecursively("C:/Users/0/Documents/","pdf");
        System.out.println(Arrays.toString(files));
         */

        /* 中小文件的复制
        byte[] bytes = IOHelpers.readAllBytes("C:\\Users\\0\\Documents\\NZ Student Visa\\Curriculum Vitae.pdf");
        IOHelpers.writeAllBytes("C:\\Users\\0\\Documents\\1.pdf",bytes);
         */

        /* 文字写入（如果没有该文件，则先创建文件，再写入）
        //方法一
        String[] lines = {"tomoko","good","hello"};
        IOHelpers.writeAllLines("C:\\Users\\0\\Documents\\2.txt",lines);

        //方法二
        IOHelpers.writeAllText("C:\\Users\\0\\Documents\\3.txt","best");
         */

        /*
        //生成指定内容的二维码图片
        BufferedImage img = QRCodeHelpers.generateQRCodeImage("www.baidu.com",200,200);
        ImageHelpers.writeToFile(img,"png","C:\\Users\\0\\Documents\\5.png");

        //读取上述的二维码里的内容
        Result result = QRCodeHelpers.parseImage("C:\\Users\\0\\Documents\\5.png");
        System.out.println(result.getText());
        */

        //更多功能去查yzk doc
    }
}
