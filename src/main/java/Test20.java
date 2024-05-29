import org.openqa.selenium.chrome.ChromeDriver;

public class Test20
{
    public static void main(String[] args) throws InterruptedException {
        //Selenium 操作动态网页
        //chromedriver的最新版本还是太低，没有跟上chrome浏览器的版本更新，以下程序无法运行

        System.setProperty("webdriver.chrome.diver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://image.baidu.com/");

        Thread.sleep(2000); //millisecond 为毫秒
        driver.close();
        driver.quit();

         






        

    }
}
