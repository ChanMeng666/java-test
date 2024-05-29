import com.yzk18.commons.IOHelpers;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.util.Arrays;

public class Test7
{
    public static void main(String[] args)
    {
        //整理文件夹中的文件，有序地重命名并复制到新的文件夹中
        /*
        File file = new File("C:/Users/0/Documents/Test7");
        File[] dirs = file.listFiles();
        for(File dir:dirs) //先遍历文件夹
        {
            for(File fileTxt:dir.listFiles()) //再遍历文件夹下的文件
            {
                //System.out.println(fileTxt);


                //拿到各个文件名--法一
                //fileTxt.getName();

                //拿到各个文件名--法二
                String filePath = fileTxt.getPath();
                filePath = filePath.replace("\\","/"); //把Windows或其他操作系统的路径分隔符 统一为“/”
                String[] strs = filePath.split("/");
                //System.out.println(Arrays.toString(strs));
                String fileName = strs[strs.length-1]; //取倒数第0个元素，即文件名


                String folderName = strs[strs.length-2]; //取倒数第1个元素，即文件夹名
                String outputFileName = "C:/Users/0/Documents/Test7/"+folderName+"-"+fileName;
                //System.out.println(outputFileName);

                byte[] bytes = IOHelpers.readAllBytes(fileTxt); //复制文件第一步--读取原文件
                IOHelpers.writeAllBytes(outputFileName,bytes); //复制文件第二步--写入新文件
            }
        }
        */


        //[作业] 一个文件夹下的若干txt复制到output文件夹中,并在output文件夹中创建每个歌手各自的文件夹，且文件名只包含歌名

        File file = new File("C:/Users/0/Documents/Test7");

        File[] fileArr = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith("txt");
            }
        }); //只选出以txt为后缀的文件
        //System.out.println(Arrays.toString(fileArr));

        for(File fileTxt:fileArr) //遍历可以让文件从数组中走出来
        {
            //System.out.println(fileTxt);

            String[] fileName = fileTxt.getName().replace("、","-").split("-");
            //System.out.println(Arrays.toString(fileName));

            String folderName = fileName[fileName.length-2];
            //System.out.println(folderName);
            File dirs = new File("C:/Users/0/Documents/Test7/output/"+folderName);
            dirs.mkdirs();

            String outputFileName = dirs.getPath()+ "/" + fileName[fileName.length-1];
            //此路径写法，可以保证对应文件进入与之相对应的文件夹。
            //System.out.println(outputFileName);

            byte[] bytes = IOHelpers.readAllBytes(fileTxt);
            IOHelpers.writeAllBytes(outputFileName,bytes);
        }
    }
}
