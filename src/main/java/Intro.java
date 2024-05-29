public class Intro //定义了一个类。 //需要另外开一个新文件，通过写“Intro introduction = new Intro();”来创建类的对象
{
    private String name; //定义若干个成员变量 //不用public而是用private，因为public时别人可以改变你的值，private时只有自己可以改变该值。
    private int age; //变量名name、age都是小写，但是方法名setName、setAge都是大写。
    public void setName(String value) //定义若干个方法
    {
        this.name = value;
    }
    public void setAge(int value)
    {
        if(value < 0)
        {
            System.out.println("Age should not be negative.");
        }
        this.age = value;
    }
    public void sayHello()

    {
        System.out.println("Hello,I am "+this.name+" and I am "+this.age+" years old.");
    }

    public static void hi()
    {
        System.out.println("Hi,I am the best.");
        //this.age = 5; //错误写法，因为static方法中不能直接访问非static的成员变量。static方法只能访问static方法。
    }
}