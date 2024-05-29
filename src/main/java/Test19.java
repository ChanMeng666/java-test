import com.yzk18.commons.IOHelpers;
import com.yzk18.net.HttpSender;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test19
{
    public static void main(String[] args) throws IOException
    {
        //Jsoup案例 -- 1 -- 批量下载文章（非登录情况下，下载公开内容）

        //前提是必须为网页静态内容，而不是动态内容。
        // 确认方法：查看网页源代码--搜索文章标题--能搜到则为静态内容

        //定位特定的元素要根据其独有的特征，即在开发人员工具模式下，自行对比查看

//        Document doc = Jsoup.connect("https://www.cnblogs.com/").get();
//        Elements links = doc.getElementsByClass("post-item-title");
//        for(Element link: links)
//        {
//            String text = link.text();
//            String href = link.attr("href");
//            //System.out.println(text+"~~~"+href);
//
//            String article = Jsoup.connect(href).get().getElementsByClass("post").get(0).text();
//
//            // 使用正则表达式去除非法文件名的字符串
//            String filename = text.replaceAll("[^a-zA-Z0-9_\\u4e00-\\u9fa5]", "");
//            //System.out.println(text);
//
//            IOHelpers.writeAllText("C:/Users/0/Documents/Test7/"+filename+".txt",article);
//
//        }


        //Jsoup案例 -- 2 -- 批量下载图片（非登录情况下，下载公开内容）

        Document indexDoc = Jsoup.connect("https://www.nipic.com/photo/jingguan/ziran/index.html?page=1").get();

        String strPageNum = indexDoc.getElementsByClass("totalPage").get(0).text();
        //System.out.println(strPageNum);
        int totalPage = Integer.parseInt(strPageNum);

        for(int pageIndex = 1; pageIndex <= totalPage; pageIndex++)
        {
            //System.out.println("第"+pageIndex+"页：");

            String pageUrl = "https://www.nipic.com/photo/jingguan/ziran/index.html?page="+pageIndex;
            //System.out.println(pageUrl);

            Document docPage = Jsoup.connect(pageUrl).get();
            Elements imgs = docPage.getElementsByClass("new-search-result-box clearfix").get(0).getElementsByTag("img");
            for(Element img : imgs)
            {
                String imgSrc = "https:"+img.attr("data-src");
                //System.out.println(imgSrc);

                String fileName = getFileName(imgSrc);
                byte[] bytes = new HttpSender().sendGetBytes(imgSrc); //图片文件是byte[]格式
                IOHelpers.writeAllBytes("C:/Users/0/Documents/Test7/"+fileName,bytes);

            }

        }

    }


    //可以自行封装一个简单的类，拿到imgSrc路径中的最后一项
    //比如//pic.nximg.cn/pic/20240105/35119139_134952142129_4.jpg中的35119139_134952142129_4.jpg
    static String getFileName(String url)
    {
        String[] strs = url.split("/");
        return strs[strs.length-1];
    }


}
