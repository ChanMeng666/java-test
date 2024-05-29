public class Test1
{
    public static void main(String[] args)
    {
        //1--输出、换行
        /*
        System.out.println("tomoko\nkuroki\\123");
        */

        //2--为已有变量重新赋值
        /*
        int x = 2;
        System.out.println(x);
        x = 3;
        System.out.println(x);
         */

        //3--运算符
        /*
        int x = 1+2-3*4/1;
        double y = 1/3;
        double z = 1.0/3;
        System.out.println(x+"\n"+y+"\n"+z);
         */

        //4--字符串
        /*
        String name1 = "tomoko";
        String name2 = "kuroki";
        String name = name1 +" "+ name2;
        System.out.println(name);
        System.out.println("1"+1+1);
        System.out.println(1+"1"+1);
        System.out.println(1+1+"1");
         */

        //5--关系运算符
        /*
        System.out.println(1!=2);
        System.out.println(1==2);
        boolean x = 1<2;
        System.out.println(x);
        String name1 = "tomoko";
        String name2 = "kuroki";
        boolean y = name1.equals(name2);
        System.out.println(y);
         */

        // x&&y--x且y
        // x||y--x或y
        // ！x--非x

        //6--（若第一项为真？则为第二项：否则为第三项）
        /*
        int a = 9;
        int b = 10;
        int c = (a>b?1:2);
        System.out.println(c);
         */

        //7--if语句--一层、二层
        /*
        int age = 10;
        if(age>18)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("children");
        }
         */

        //8--if语句--多层
        /*
        int age = 17;
        if(age>18)
        {
            System.out.println("adult");
        }
        else if(age<0)
        {
            System.out.println("X");
        }
        else if(age<=6)
        {
            System.out.println("baby");
        }
        else if(age<=12)
        {
            System.out.println("kid");
        }
        else if(age<=18)
        {
            System.out.println("youth");
        }
         */

        //9--if语句--外层套内层（套娃型）

        //10--switch语句
        /*
        int x = 11;
        switch(x)
        {
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
            case 4:
                System.out.println("c");
                break;
            case 5:
                System.out.println("d");
                break;
            default:
                System.out.println("e");
         */

        //11--while语句
        //11-1-顺序从1数到8
        /*
        int x = 1;
        while(x<=8)
        {
            System.out.println(x);
            x++;
        }
         */

        //11-2-倒序从8数到1
        /*
        int x = 8;
        while(x>=1)
        {
            System.out.println(x);
            x--;
        }
         */

        //11-3-求等差数列之和(1+2+...+10)
        /*
        int x = 1;
        int sum = 0;
        while (x<=10)
        {
            sum = sum + x;
            x++;
        }
        System.out.println(sum);
         */

        //12--for语句
        //12-1-顺序从1数到8
        /*
        for(int x=1;x<=8;x++)
        {
            System.out.println(x);
        }
         */

        //12-2-倒序从8数到1
        /*
        for(int x=8;x>=1;x--)
        {
            System.out.println(x);
        }
        */

        /*
        int y = 1;
        for(y=1;y<=4;y++)
        {
            System.out.println("内层"+y);
        }
        System.out.println("外层"+y);
         */

        //12-3-求等差数列之和(2+4+6+8+10)
        /*
        int x = 2;
        int sum = 0;
        for(x=2;x<=10;x=x+2)
        {
            sum = sum+x;
        }
        System.out.println(sum);
        */

        //13--for语句套娃
        /*
        for(int x=1;x<=3;x++)
        {
            for(int y=1;y<=3;y++)
            {
                System.out.println(x+","+y);
            }
        }
         */

        //14--break,continue
        /*
        for(int x=1;x<=5;x++)
        {
            if(x==3)
            {
                break; //到3时中断，最后值为2。
            }
            System.out.println(x);
        }
         */

        /*
        for(int x=1;x<=5;x++)
        {
            if(x==3)
            {
                continue; //跳过3，再继续。
            }
            System.out.println(x);
        }
         */

        //找出所有奇数（即排除掉所有偶数）
        /*
        for(int x=1;x<=10;x++)
        {
            if(x%2==0)
            {
                continue;
            }
            System.out.println(x);
        }
        */

        //找出所有偶数
        /*
        for(int x=1;x<=10;x++)
        {
            if(x%2==0)
            {
                System.out.println(x);
            }
        }
         */

    }
}
