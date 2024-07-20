package LeetcodeProblems;

public class Leetcode26
{
    public static int removeDuplicates(int[] nums)
    {
        //  {1,1,1,1,1,2,2}     {1,2}
        int numberOfUniqueElements=1;       // the minimum number of unique elements could be 1.
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[numberOfUniqueElements]=nums[i];
                numberOfUniqueElements++;   // increase number by 1;
            }
        }
        return  numberOfUniqueElements;

    }

    public static void getUniqueElements(int[] nums)
    {
        System.out.println("The unique elements in the array are :");
        for(int x:nums)
        {
            System.out.print(x+" ");
        }
    }



    public static void main(String[] args)
    {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int result=removeDuplicates(nums);
        System.out.println(result);

        getUniqueElements(nums);
    }
}
