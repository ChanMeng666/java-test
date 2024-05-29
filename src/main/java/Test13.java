import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.PDFHelpers;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.util.List;

public class Test13
{
    public static void main(String[] args)
    {
        //使用YZK18-DOCS库

        PDDocument pdf = PDFHelpers.openFile("C:/Users/0/Downloads/COMP 636/COMP636 SS 2023 WebApp/COMP636 SS 2023 WebApp - SPB.pdf");

        int pageNumber = pdf.getNumberOfPages();
        System.out.println(pageNumber);

        PDPage page = pdf.getPage(3);
        String text = PDFHelpers.parseText(page);
        System.out.println(text);

        List<byte[]> image = PDFHelpers.parseImages(page,"jpg");
//        //写法一：增强for循环
//        for(byte[] bytes: image)
//        {
//
//        }
        //写法二：普通for循环
        for(int i = 0; i < image.size(); i++)
        {
            byte[] bytes = image.get(i);
            IOHelpers.writeAllBytes("C:/Users/0/Downloads/COMP 636/COMP636 SS 2023 WebApp/1.jpg",bytes);
        }

        //把一个pdf文件中的文字提取到txt文件中，且pdf中的文件保存到同级目录下，图片文件的命名用递增序号。
        String allText = PDFHelpers.parseText(pdf);
        IOHelpers.writeAllText("C:\\Users\\0\\Downloads\\COMP 636\\COMP636 SS 2023 WebApp\\1.txt",allText);

        int imageNumber = 0;
        for(int i = 0; i < pdf.getNumberOfPages(); i++)
        {
            PDPage pages = pdf.getPage(i);
            List<byte[]> images = PDFHelpers.parseImages(pages,"jpg");
            for(byte[] bytes : images)
            {
                IOHelpers.writeAllBytes("C:\\Users\\0\\Downloads\\COMP 636\\COMP636 SS 2023 WebApp\\"+imageNumber+".jpg",bytes);
                imageNumber++;
            }
        }


        PDFHelpers.close(pdf);















    }
}
