import java.util.Arrays;

public class Test2
{
    public static void main(String[] args)
    {
        //15--数组
        /*
        int[] nums1 = new int[3];
        double[] nums2 = new double[3];
        boolean[] tf = new boolean[3];
        String[] strs = new String[3];
        int len = nums1.length;
        System.out.println(nums1[0]+","+nums2[0]+","+tf[0]+","+strs[0]); //各项默认值。
        System.out.println(len);//获取数组长度（法一）
        System.out.println(strs.length);//获取数组长度（法二）
         */

        //16--列出所有数组元素
        //顺序（方法一）
        /*
        int[] nums = {1,2,3,4,5,6};
        for(int x=0;x<nums.length;x++)
        {
            System.out.println(nums[x]);
        }
        */

        //顺序（方法二）
        /*
        int[] nums = {1,2,3,4,5,6};
        for(int n:nums)
        {
            System.out.println(n);
        }

        String[] strs = {"tomoko","kuroki","good","perfect"};
        for(String s:strs)
        {
            System.out.println(s);
        }
        */

        //倒序
        /*
        int[] nums = {1,2,3,4,5,6};
        for(int x=nums.length-1;x>=0;x--)
        {
            System.out.println(nums[x]);
        }
         */

        //17--数组打印(数组转化为字符串)
        //方法一：上文16
        //方法二：
        /*
        int[] nums = {1,2,3,4,5,6};
        String n = Arrays.toString(nums);
        System.out.println(n);
         */

        //18--两个等长数组的元素逐位求和
        /*
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9,10};
        int[] nums3 = new int[nums1.length];
        for(int x = 0; x < nums1.length; x++)
        {
            nums3[x] = nums1[x] + nums2[x];
        }
        System.out.println(Arrays.toString(nums3));
         */

        //19--找出数组中的元素最大值
        /*
        int[] nums = {1,5,2,6,8,9,3,4};
        int max1 = nums[0];
        for(int x = 0;x < nums.length;x++)
        {
            int max2 = nums[x];
            if(max2 > max1)
            {
                max1 = max2;
            }
        }
        System.out.println(max1);
         */
    }
}
