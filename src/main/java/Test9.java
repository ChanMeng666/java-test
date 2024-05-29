import com.yzk18.GUI.GUI;
import com.yzk18.commons.IOHelpers;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;

public class Test9
{
    public static void main(String[] args)
    {
//        // GUI库 - 案例1 - 标准体重计算器
//
//        String gender = GUI.buttonsBox("Please choose your gender","female","male");
//        double height = GUI.doubleBox("Please enter your height (cm)");
//        double weight = GUI.doubleBox("Please enter your weight (kg)");
//        double standardWeight;
//
//        if(gender.equals("female"))
//        {
//            standardWeight = (height-70)*0.6; //一开始就声明好变量是double，则if{}内部不用再声明其为double
//            System.out.println(standardWeight);
//        }
//        else
//        {
//            standardWeight = (height-80)*0.7;
//            System.out.println(standardWeight);
//        }
//
//        double differenceWithStandardWeight = (weight-standardWeight)/standardWeight;
//        //若本行代码在上文的if{}内部，则下文的if{}无法读取。
//
//        if(differenceWithStandardWeight >= -0.1 && differenceWithStandardWeight <= 0.1)
//        {
//            GUI.msgBox("normal weight");
//        }
//        else if(differenceWithStandardWeight >= -0.2 && differenceWithStandardWeight < -0.1)
//        {
//            GUI.msgBox("thin");
//        }
//        else if(differenceWithStandardWeight <= 0.2 && differenceWithStandardWeight > 0.1)
//        {
//            GUI.msgBox("obese");
//        }
//        else if(differenceWithStandardWeight <= -0.2)
//        {
//            GUI.msgBox("too thin");
//        }
//        else //只剩最后一个区间要取时，不用再写else if
//        {
//            GUI.msgBox("too fat");
//        }
//
//        //不写退出的话，程序不会停。
//        //System.exit (1)和System.exit (0)都会退出程序，但是System.exit (0)是正常退出，System.exit (1)是异常退出
//        System.exit(0);


        // GUI库 - 案例2 - 保存用户输入的信息

//        //方法一：可以实现，但有一大段重复代码
//        String dir = GUI.dirSaveBox("Please select the folder where you want to save");

//        String[] inputInfo = GUI.multiInputBox("Please enter customer information","name","telephone","email");
//        String name = inputInfo[0];
//        String telephone = inputInfo[1];
//        String email = inputInfo[2];
//        String infoContent = "Name:"+name+"\n"+"Telephone:"+telephone+"\n"+"Email:"+email;

//        IOHelpers.writeAllText(dir+"/"+name+".txt",infoContent);
//
//        while (GUI.yesNoBox("Are you going to continue?"))
//        {
//            dir = GUI.dirSaveBox("Please select the folder where you want to save");

//            inputInfo = GUI.multiInputBox("Please enter customer information","name","telephone","email");
//            name = inputInfo[0];
//            telephone = inputInfo[1];
//            email = inputInfo[2];
//            infoContent = "Name:"+name+"\n"+"Telephone:"+telephone+"\n"+"Email:"+email;

//            IOHelpers.writeAllText(dir+"/"+name+".txt",infoContent);
//        }

//        //方法二：使用do while循环语句
//        String dir = GUI.dirSaveBox("Please select the folder where you want to save");
//        do
//        {
//            String[] inputInfo = GUI.multiInputBox("Please enter customer information","name","telephone","email");
//            String name = inputInfo[0];
//            String telephone = inputInfo[1];
//            String email = inputInfo[2];
//            String infoContent = "Name:"+name+"\n"+"Telephone:"+telephone+"\n"+"Email:"+email;
//            IOHelpers.writeAllText(dir+"/"+name+".txt",infoContent);
//        } while (GUI.yesNoBox("Are you going to continue?"));


        // GUI库 - 案例3 - 文件夹拷贝

//        String sourceFolder = GUI.dirOpenBox("Please select the source folder");
//        String destinationFolder = GUI.dirSaveBox("Please select the destination folder");
//
//
//        //方法一：IOHelpers库存在问题，无法递归获取 对应文件夹下的所有文件及其子文件
//        String[] files = IOHelpers.getFilesRecursively(sourceFolder);
//        System.out.println(Arrays.toString(files));
//
//
//        //方法二：改为使用递归获取
//        //【注意】这个方法只能拷贝选定文件夹中的直系文件（不包括子文件夹），而无法拷贝子文件夹中的文件
//        /*
//        File sourceFile = new File(sourceFolder);
//        String[] files = IOHelpers.getFilesRecursively(sourceFolder);
//        //方法二 - 写法1：这是增强型for循环，显示拷贝进度信息
//        int i = 0;
//        for(File file:sourceFile.listFiles())
//        {
//
//            GUI.showProgressDialog("Copying:"+file.getName(),i,files.length);
//            String destinationFileName = destinationFolder+"/"+file.getName();
//            byte[] formerBytes = IOHelpers.readAllBytes(file);
//            IOHelpers.writeAllBytes(destinationFileName,formerBytes);
//            i++;
//        }
//         */
//
//        //方法二 - 写法2：这是普通for循环，显示拷贝进度信息
//        /*
//        File[] files = sourceFile.listFiles();
//        for(int i = 0; i < files.length; i++)
//        {
//            File file = files[i];
//            GUI.showProgressDialog("Copying:"+file.getName(),i,files.length);
//            String destinationFileName = destinationFolder+"/"+file.getName();
//            byte[] formerBytes = IOHelpers.readAllBytes(file);
//            IOHelpers.writeAllBytes(destinationFileName,formerBytes);
//        }
//         */
//
//
//        GUI.closeProgressDialog();
//        GUI.msgBox("The folder has been successfully copied.");


        //GUI库 - 案例4 - 统计所有文件单词的个数

//        String dir = GUI.dirOpenBox("Please select the folder containing the txt file");
//        String[] files = IOHelpers.getFilesRecursively(dir,"txt");
//        int sum = 0;  //总单词个数的初始值为0
//        for(String file: files)
//        {
//            String strs = IOHelpers.readAllText(file);
//            String[] strsArrays = strs.split("\\s|\\.|\\?|\\!|,");
//            sum = sum + strsArrays.length;
//        }
//        System.out.println(sum);


        //GUI库 - 案例5 - 计算星座
        LocalDate birthday = GUI.dateBox("Please enter your birthday");

        //System.out.println(birthday.getMonthValue());  //先尝试打印，确认好之后再定义变量为int
        int month = birthday.getMonthValue();
        //System.out.println(birthday.getDayOfMonth());
        int day = birthday.getDayOfMonth();


        /* 方法一：
        if(month == 1)
        {
            if(day <= 19)
            {
                GUI.msgBox("摩羯座");
            }
            else
            {
                GUI.msgBox("水瓶座");
            }
        }

        else if (month == 2)
        {
            if(day <= 20)
            {
                GUI.msgBox("双鱼座");
            }
            else
            {
                GUI.msgBox("双鱼座");
            }
        }

        else if (month == 3)
        {
            if(day <= 19)
            {
                GUI.msgBox("水瓶座");
            }
            else
            {
                GUI.msgBox("白羊座");
            }
        }

        else if (month == 4)
        {
            if(day <= 19)
            {
                GUI.msgBox("白羊座");
            }
            else
            {
                GUI.msgBox("金牛座");
            }
        }

        else if (month == 5)
        {
            if(day <= 20)
            {
                GUI.msgBox("金牛座");
            }
            else
            {
                GUI.msgBox("双子座");
            }
        }

        else if (month == 6)
        {
            if(day <= 21)
            {
                GUI.msgBox("双子座");
            }
            else
            {
                GUI.msgBox("巨蟹座");
            }
        }

        else if (month == 7)
        {
            if(day <= 22)
            {
                GUI.msgBox("巨蟹座");
            }
            else
            {
                GUI.msgBox("狮子座");
            }
        }

        else if (month == 8)
        {
            if(day <= 22)
            {
                GUI.msgBox("狮子座");
            }
            else
            {
                GUI.msgBox("处女座");
            }
        }

        else if (month == 9)
        {
            if(day <= 22)
            {
                GUI.msgBox("处女座");
            }
            else
            {
                GUI.msgBox("天秤座");
            }
        }

        else if (month == 10)
        {
            if(day <= 23)
            {
                GUI.msgBox("天秤座");
            }
            else
            {
                GUI.msgBox("天蝎座");
            }
        }

        else if (month == 11)
        {
            if(day <= 22)
            {
                GUI.msgBox("天蝎座");
            }
            else
            {
                GUI.msgBox("射手座");
            }
        }

        else if (month == 12)
        {
            if (day <= 21)
            {
                GUI.msgBox("射手座");
            }
            else
            {
                GUI.msgBox("摩羯座");
            }
        }
         */

        //方法二：
                /* 参考资料：
        白羊座：3月21日~4月19日
        金牛座：4月20日~5月20日
        双子座：5月21日~6月21日
        巨蟹座：6月22日~7月22日
        狮子座：7月23日~8月22日
        处女座：8月23日~9月22日
        天秤座：9月23日~10月23日
        天蝎座：10月24日~11月22日
        射手座：11月23日~12月21日
        摩羯座：12月22日~1月19日
        水瓶座：1月20日~2月18日
        双鱼座：2月19日~3月20日
         */

        // &&和&都可以表示逻辑与，但他们是有区别的，共同点是他们两边的条件都成立的时候最终结果才是true。
        // 不同点是&&只要是第一个条件不成立为false，就不会再去判断第二个条件，最终结果直接为false，而&判断的是所有的条件。
        // ||和|都表示逻辑或，共同点是只要两个判断条件其中有一个成立最终的结果就是true。
        // 区别是||只要满足第一个条件，后面的条件就不再判断，而|要对所有的条件进行判断。

        int sum = month*100 + day;
        if (120 <= sum && sum <= 218)
        {
            GUI.msgBox("水瓶座");
        }
        else if (219 <= sum && sum <= 320)
        {
            GUI.msgBox("双鱼座");
        }
        else if (321 <= sum && sum <= 419)
        {
            GUI.msgBox("白羊座");
        }
        else if (420 <= sum && sum <= 520)
        {
            GUI.msgBox("金牛座");
        }
        else if (521 <= sum && sum <= 621)
        {
            GUI.msgBox("双子座");
        }
        else if (622 <= sum && sum <= 722)
        {
            GUI.msgBox("巨蟹座");
        }
        else if (723 <= sum && sum <= 822)
        {
            GUI.msgBox("狮子座");
        }
        else if (823 <= sum && sum <= 922)
        {
            GUI.msgBox("处女座");
        }
        else if (923 <= sum && sum <= 1023)
        {
            GUI.msgBox("天秤座");
        }
        else if (1024 <= sum && sum <= 1122)
        {
            GUI.msgBox("天蝎座");
        }
        else if (1123 <= sum && sum <= 1221)
        {
            GUI.msgBox("射手座");
        }
        else if (1222 <= sum || sum <= 119)
        {
            GUI.msgBox("摩羯座");
        }

    }
}
