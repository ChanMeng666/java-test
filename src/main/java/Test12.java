public class Test12
{
    //例子3
    static void change(Intro i)
    {
        i.setAge(666);
    }

    //例子4
    static void changeInt(int i)
    {
        i = 1;
    }







    public static void main(String[] args)
    {
        //类变量的赋值

        //例子1

//        int i = 10;
//        int j = i; //把当前的i赋值给j。
//        i = 20; //上文已经声明过i的数据类型是int，所以无需再写“int i”。 //后面i再改变，也不影响上文中j已赋值为10。
//        System.out.println(j);



        //例子2

//        Intro intro1 = new Intro();
//        intro1.setName("Tomoko");
//        intro1.setAge(1);
//        intro1.sayHello();
//
//
//        //写法一
//         Intro intro2 = new Intro();
//         intro2.sayHello(); //此时输出的是默认值，名字为null，年龄为0。
             //所有类型的局部变量（方法中的参数也可以看作局部变量）必须初始化（即先赋初始值，才能打印出来），但成员变量声明的时候可以不初始化（即可以不给也可以给初始值）。
             //如果不初始化：对于成员变量，基本数值类型（如int、byte、short、long、float、double、char、boolean，一般是小写字母开头）的默认初始值为0和false，
             // 而非基本类型（如Strin、自创的Intro，一般是大写字母开头）的默认初始值为null（null表示变量不指向任何对象）。
             //对于一个指向null的变量，调用任何方法都会报错：NullPointerException。


//        //写法二：把intro1当前指向的对象赋值给intro2，或者说让intro2变量指向“intro1当前所指向的对象”。
//        Intro intro2 = intro1;
//        intro2.sayHello();
//
//
//        intro2.setName("Kuroki");
//        intro2.setAge(2);
//        intro2.sayHello();
//
//        intro1.sayHello();
//        //按照写法一往下走：第三段输出“1”
//        //按照写法二往下走：第三段输出“2”


        //例子3

//        Intro intro3 = new Intro();
//        intro3.setAge(777);
//        intro3.sayHello();
//
//        change(intro3);
//        intro3.sayHello();


        //例子4

//        int i = 2;
//        changeInt(i); //不会改为1，而是沿用上文的2。
//        //对于普通类型（如int类型）的变量来说，内部（changeInt）改变时不会影响到外部（main）；
//        //对于类的类型（如自创的Intro类型）的变量来说，内部（change）改变时会影响到外部（main），改的是同一个对象。
//        System.out.println(i);






        //int和Integer的关系

        //java中有说法“一切皆对象”，但是int等不是对象。因此要用Integer这样的包装类，把一个整数包装成对象。
        //常见包装类：int-Integer,long-Long,boolean-Boolean

        //int i1 = null; //错误写法
        Integer i1 = null; //正确写法
        Integer i2 = 3;

        int i3 = i2;
        System.out.println(i3);





    }
}
