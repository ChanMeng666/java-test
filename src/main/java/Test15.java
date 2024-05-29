import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.PDFHelpers;
import org.apache.pdfbox.io.MemoryUsageSetting;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test15
{
    public static void main(String[] args) throws IOException
    {
        // YZK18-DOCS库 - 案例 - 把一堆pdf文件合并成同一个pdf.


        //尝试一：未成功的编码

//        String[] strs = IOHelpers.getFilesRecursively("C:\\Users\\0\\Downloads\\COMP 637\\Business Analysis\\中文翻译版","pdf");
//
//        PDDocument newPDDoc = new PDDocument(); //创建一个新的pdf
//
//        for(String str : strs)
//        {
//            PDDocument docs = PDFHelpers.openFile(str);
//            for(int i = 0; i < docs.getNumberOfPages(); i++)
//            {
//                PDPage page = docs.getPage(i);
//                newPDDoc.addPage(page);
//
//            }
//
//            PDFHelpers.close(docs);
//        }
//
//        try {
//            newPDDoc.save("C:\\Users\\0\\Downloads\\COMP 637\\Business Analysis\\中文翻译版\\中文合并版.pdf");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



        //尝试二：已成功

//      通过更新了库里的具体方法到2.0.23版本而成功了
//      <artifactId>pdfbox</artifactId>
//      <version>2.0.23</version>

        PDFMergerUtility merger = new PDFMergerUtility();
        String[] pdfFiles = IOHelpers.getFilesRecursively("C:\\Users\\0\\Downloads\\COMP 637\\Business Analysis\\中文翻译版","pdf");
        for(String pdfFile: pdfFiles)
        {
            merger.addSource(pdfFile);
        }
        merger.setDestinationFileName("C:\\Users\\0\\Downloads\\COMP 637\\Business Analysis\\中文翻译版\\中文合并版.pdf");

        merger.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());

    }
}
