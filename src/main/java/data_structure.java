import javax.naming.Name;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class data_structure
{
    public static void main(String[] args)
    {
        // LinkedList:一种能在运行时动态添加内容的数据结构。（数组不行，数组长度在声明的时候已经确定）
        //常见写法：list.add("3")添加元素, list.size()获取数据个数, list.get(3)获取指定序号的元素

//        LinkedList list = new LinkedList();
//
//        list.add(0,2);
//        list.add(1,4);
//        list.add(2,6);
//        list.add(3,"hello");
//        list.add(4,0.1); //非泛型的list,可以add任何类型的数据
//
//        System.out.println(list);
//        System.out.println(list.size());
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(list.toArray().length-1)); //获取倒数第一个元素:list.size()-1或者list.toArray().length-1
//
//        //遍历这个list
//
//        //写法一：
//        for(int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i));
//        }
//
//        //写法二：增强型for循环，对于非泛型list.get的写法
//        for(Object obj: list)
//        {
//            System.out.println(obj);
//        }


        // LinkedHashMap:类似dictionary的数据结构。
        // 键和值要对应，键不能重复,值可以重复。
        //常见写法：map.put("Key","Value") 放入键值时，如果已存在则会被覆盖。map.get("Key") 根据键，获取值，如果不存在则返回null。

//        LinkedHashMap map1 = new LinkedHashMap();
//        map1.put("Name","Tomoko");
//        map1.put("Age","31");
//        System.out.println(map1.get("Name"));
//
//        map1.put("Name","Kuroki");
//        System.out.println(map1.get("Name"));
//
//        Object obj = map1.get("Height");
//        System.out.println(obj);
//
//        if(obj == null)
//        {
//            System.out.println("键不存在");
//        }
//        else
//        {
//            System.out.println(obj);
//        }



//        //泛型：限制放入的数据类型。
//        //LinkedList,LinkedHashMap中的数据，则可以放入任何类型。
//
//        LinkedList<String> list1 = new LinkedList<String>();
//        list1.add(0,"1");
//
//        LinkedHashMap<String,String> map1 = new LinkedHashMap<String,String>();
//        map1.put("Name","Tomoko");
//
//        //对于int等基本数据类型(原始类型)，不能直接用在声明泛型类型中，必须用对应的包装类。
//        LinkedHashMap<Integer,Integer> map2 = new LinkedHashMap<>();
//        map2.put(0,1);
//        map2.put(1,3);
//        map2.put(2,5);
//
////        //此为确定都有值的情况：
////        int i = map2.get(0);
////        System.out.println(i);
//
//        //若有无值的可能，则改为：
//        Integer i = map2.get(0); //只有写成Integer才能被赋值为null
//        if(i == null)
//        {
//            System.out.println("not found");
//        }
//        else
//        {
//            System.out.println(i);
//        }


    }

}
