import com.yzk18.GUI.GUI;
import com.yzk18.commons.IOHelpers;

import java.time.LocalDate;
import java.util.Arrays;

public class Test8
{
    public static void main(String[] args)
    {
        // GUI库的学习

        //1--以下均为 模态对话框，即窗口关闭之后才往下执行

//        String mesg = GUI.buttonsBox("hello","tomoko","kuroki");
//        System.out.println(mesg);

//        String pic = GUI.imgBox("hello","C:/Users/0/Documents/1.jpg","tomoko","kuroki"); //可以给用户看图选选项
//        System.out.println(pic);

//        String choi = GUI.choiceBox("hello",new String[]{"tomoko","kuroki"}); //第二段为选项内容
//        System.out.println(choi);

//        LocalDate localDate = GUI.dateBox("Please choose your birthday",LocalDate.now()); //第二段为设置默认日期，可不设
//        System.out.println(localDate);

//        String title = GUI.dirOpenBox("请选择打开文件夹");
//        System.out.println(title); //返回的是 所选择的文件路径

//        String save = GUI.dirSaveBox("请选择保存文件夹");
//        System.out.println(save);

//        double doubleWeight = GUI.doubleBox("Please input your weight",50.0);
//        System.out.println(doubleWeight);

//        GUI.errorBox("oppos,something wrong");

//        String ppt = GUI.fileOpenBox("choose your Powerpoint","ppt","pptx"); //用后缀名过滤，缩小可选文件范围
//        System.out.println(ppt);

//        String[] files = GUI.filesOpenBox("111","txt");
//        System.out.println(files);

//        int height = GUI.getScreenHeight();
//        System.out.println(height);
//        System.out.println(GUI.getScreenSize()); //返回的是 屏幕分辨率 长和宽

//        String name = GUI.inputBox("请输入名字","N/A");
//        System.out.println(name); //返回的是 用户输入的文字信息

//        String[] strs = GUI.loginBox("请登录");
//        System.out.println(Arrays.toString(strs)); //获取用户的用户名和密码

//        GUI.msgBox("Finish");

//        String[] strs = GUI.multiInputBox("More information","Name","Sex","Age");
//        System.out.println(Arrays.toString(strs));

//        boolean b = GUI.yesNoBox("Do you feel good?"); // 类似的还有 GUI.okCancelBox
//        System.out.println(b);


        //2--非模态对话框，即无需窗口关闭就可以往下执行

        //大部分情况，Java中，main函数执行结束之后，程序就退出了。但对于下文的show，则需要加close来关闭。

//        GUI.showIndeterminateProgressDialog("正在导入");
//        for(int i = 0; i < 100; i++)  //用拷贝文件（拷贝100遍）举例，看上文设置的进度条（进度条只能看见左右移动状态）
//        {
//            byte[] bytes = IOHelpers.readAllBytes("C:/Users/0/Documents/1.jpg");
//            IOHelpers.writeAllBytes("C:/Users/0/Documents/666.jpg",bytes);
//        }
//        GUI.closeIndeterminateProgressDialog(); //上文的show对话框不会自己关，必须加一个close
//        GUI.msgBox("导入完成");


//        for(int i = 0; i < 100; i++)  //用拷贝文件（拷贝100遍）举例，看下文设置的进度条（进度条能看见正在导入第X次）
//        {
//            GUI.showProgressDialog("正在导入第"+i+"次",100,i);
//            byte[] bytes = IOHelpers.readAllBytes("C:/Users/0/Documents/1.jpg");
//            IOHelpers.writeAllBytes("C:/Users/0/Documents/666.jpg",bytes);
//        }
//        GUI.closeProgressDialog();
//        GUI.msgBox("导入完成");

        //更多的功能去看 GUI库的doc
    }
}
