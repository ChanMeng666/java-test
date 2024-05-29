public class Main
{
    public static void main(String[] args)
    {
//        Intro intro1 = new Intro();
//        // Intro introduction：声明Intro类型的变量introduction。
//        // new Intro()：创建Intro类的一个对象，或者说把Intro类实例化。
//        // 接着把变量introduction指向这个对象。
//        //注意：一个变量在同一时刻只能指向唯一对象。
//
//        intro1.setName("Tomoko");
//        //调用introduction变量的当前所指向对象的setName方法。
//        intro1.setAge(31);
//        intro1.sayHello();
//
//        Intro.hi();
//        //对于类中的static的方法，可以直接写“类名.方法名”来调用。
//        //对于其它非static的方法，由于有若干不同的对象（如intro1，intro2，intro3等），就需要如上所写的“Intro introduction = new Intro()”，通过对象来调用。


        //链式编程 CHAIN SETTER（用起来更简单，但不符合javabean的规范，因为该规范要求setter方法返回值必须是void。）
//        Person p = new Person().setName("Tomoko").setAge(31).setHeight(170);
//        test(p);
//
//        //上述代码等价于：
//        Person p = new Person();
//        Person p1 = p.setName("Tomoko");
//        Person p2 = p1.setAge(31);
//        Person p3 = p2.setHeight(170);
//        test(p3);

        //继承

        Female f1 = new Female();
        f1.setName("Tomoko");
        f1.setAge(31);
        f1.setHeight(170);
        f1.setClit("666");

        Person p1 = new Female(); //母类类型的变量，可以指向子类类型的对象。

        //p1.setClit(); //这是错误写法，因为变量p1是Person类型的，无法使用Female的方法。
        // 能调用什么方法，取决于变量的类型。

        Female p2 = (Female) p1; //显式转换，即程序员确认p1指向的一定是Female对象。
        p2.setClit("666"); //这是正确写法，因为上一行已确认了指向。
        System.out.println(p2.getClit());




    }
}
