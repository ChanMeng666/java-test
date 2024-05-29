import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test18
{
    public static void main(String[] args) throws IOException {
        //Jsoup 爬虫工具的应用

//        Document doc = Jsoup.connect("https://www.youzack.com/").get();

        //根据网页元素的ID获取信息
//        Element link = doc.getElementById("tucao"); //一定注意拼写！第一次时代码写成了tocao，结果打印为null
//        String href = link.attr("href");
//        String text = link.text();
//        System.out.println(href+"~~~"+text);

        //根据网页的tag获取信息
//        Elements links = doc.getElementsByTag("a");
//        for(Element a : links)
//        {
//            System.out.println(a.attr("href")+"~~~"+a.text());
//        }

        //获取图片路径
//        Elements elements = doc.getElementsByTag("img");
//        for(Element img : elements)
//        {
//            System.out.println(img.attr("src"));
//        }

        //获取特定样式的元素（比如class="cover"） 所对应的文本
//        Elements covers = doc.getElementsByClass("cover");
//        for(Element c : covers)
//        {
//            System.out.println(c.text());
//        }

        //获取某个页面下 所有音频的名字和超链接
        //事先用浏览器的”开发人员工具“确认了只有这一板块的样式class="weui-cells"
//        Document doc = Jsoup.connect("https://www.youzack.com/ListeningExercise/AlbumIndex/128/").get();
//        Element div = doc.getElementsByClass("weui-cells").get(0); //获取第0个元素 是div
//        Elements links = div.getElementsByTag("a"); //在class="weui-cells"的div内部，找所有的标签a
//
//        for(Element link: links)
//        {
//            String text = link.text();
//            String href = link.attr("href");
//            System.out.println(text+"~~~"+href);
//        }










    }
}
