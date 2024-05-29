import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.PDFHelpers;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.util.LinkedHashMap;

public class Test14
{
    public static void main(String[] args)
    {
        //YZK18-DOCS库 - 案例 - 统计pdf文件的英文单词词频

        String[] pdfFiles = IOHelpers.getFilesRecursively("C:\\Users\\0\\Downloads\\COMP 637\\Business Analysis","pdf");
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();

        for(String pdfFile: pdfFiles )
        {
            PDDocument docs = PDFHelpers.openFile(pdfFile); //***有开***
            String text = PDFHelpers.parseText(docs);

            String[] words = text.toLowerCase().split("\\,|\\.|\\s|\\?|\\!|\\:|\\，|\\。|\\;|\\：|\\-");
            for(String word: words)
            {
                if(isEnglishWord(word) == false) //或写为 if(!isEnglishWord(word))，即如果遍历到的不是英语单词，则跳过，再遍历下一个。
                {
                    continue;
                }

                if(word.equals(" ")) //跳过空格符)
                {
                    continue;
                }

                //统计词频
                Integer freq = map.get(word);
                if(freq == null)
                {
                    map.put(word,1); //若之前没出现过这个单词，则记录词频为1
                }
                else
                {
                    map.put(word,freq+1); //若之前已经出现过这个单词，则记录词频为递增
                }
            }

            PDFHelpers.close(docs); //***就有关***
        }

        //将拿到的单词和词频 输出到txt文件中
        String outputString = "";
        for(String word : map.keySet()) //map.keySet() 是map中所有key的集合。
        {
            Integer freq = map.get(word);
            //System.out.println(word+"出现了"+freq+"次。");
            outputString = outputString+word+"出现了"+freq+"次。"+"\r\n"; // \r\n 为移到最前，然后换行。 //Windows10 idea2020 环境jdk8中 \n 与 \r\n 是等同效用的。
            IOHelpers.writeAllText("C:/Users/0/Documents/词频统计.txt",outputString);

        }
    }






    //  判断读取的内容是否是英文单词（即判断是否全部由英文字母组成）
    public static boolean isEnglishWord(String strs)
    {
        for(int i = 0; i < strs.length(); i++) // 错误写法 for(char str : strs)，因为字符串不能用增强for循环来遍历。
        {
            char ch = strs.charAt(i);
            if(Character.isLowerCase(ch) == false) //只要碰到一个非字母（中文或数字等），函数就返回false。
            {
                return false;
            }
        }

        return true; //如果运行到这里，则说明每个都是字母。
    }






}
