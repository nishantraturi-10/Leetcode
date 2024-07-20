package LeetcodeProblems;

public class Leetcode1
{
    public static int[] TwoSum(int[] nums, int target)
    {
        //{2,7,11,15}      t=9
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)    // j is iterated to nums.length to insure that no pair is left behind.
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }

        return new int[] {};        //else return empty array.
    }


    public static void main(String[] args)
    {

        int[] arr={2,-7,11,15};
        int target=5;

        TwoSum(arr,target);

        int[] result=TwoSum(arr,target);

        if(result.length == 0)
        {
            System.out.println("No solution found.");
        }
        else
        {
            System.out.println("Indices are :");
            for(int x:result)
            {
                System.out.print(x+" ");
            }
        }

    }


}
