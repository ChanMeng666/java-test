public class Person //extends Object 可省去，因为java里所有的类都直接或间接继承自Object类。
{
//    // javabean 主要规则
//    1.必须是public类。
//    2.成员变量用private，通过public的setter、getter方法来访问。
//    3.可以只提供getter方法，这样的属性叫只读属性。
//    4.可以只提供setter方法，这样的属性叫只写属性。如两者都有，则叫可读可写属性。

    //链式编程
    private String name;
    private int age;
    private int height;
    public Person setName(String value) //把返回值改为Person，不再是返回void了（原来的写法：public void setName(String value)）
    {
        this.name = value;
        return this; //把当前对象作为方法的返回值
    }
    public Person setAge(int value)
    {
        this.age = value;
        return this;
    }
    public Person setHeight(int value)
    {
        this.height = value;
        return this;
    }

}
