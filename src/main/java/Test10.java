public class Test10
{
    //编写自己的方法

    // 方法-1
    static int add(int i1, int i2)
    {
        return i1+i2;
        //int x = 10; //若是这么写，则x为局部变量，命名不能和方法参数名字重复，且无法跨方法访问到该值。
    }

    //方法-2
    static void show(int a, int b)
    {
        System.out.println(a+"\n"+b);
    }

    //方法-3
    static  void  test(int a)
    {
        System.out.println("before:"+a);
        a = 10;
        System.out.println("after:"+a);
    }





    //以下是主方法
    public static void main(String[] args)
    {

//        //输入的是常量
//        int i = add(3,5);
//
//        //输入的是变量x
//        int i1 = 3;
//        int i =add(i1,5);
//
//        System.out.println(i);


//        int a = 10, b = 20;
//        show(b,a); //赋值的顺序只与参数的顺序有关，与方法中的变量命名无关。


        int a = 5;
        test(a);
        System.out.println(a); //进行方法调用的时候，传递的是数据的副本，在方法内部对参数赋值，不会影响外部的参数和变量。














    }


}
