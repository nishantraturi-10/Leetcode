package LeetcodeProblems;

public class Leetcode11
{
    static int maxArea(int[] height)
    {
        int max=0;
        int currentWater=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {



            int minLength=Math.min(height[left],height[right]);
            currentWater=minLength*(right-left);    // current area

            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
            max=Math.max(max,currentWater);     // max area found by comparing current and max.
        }
        return max;
    }
    public static void main(String[] args)
    {

        int[] height={1,1};

        int result=maxArea(height);
        System.out.println("Max area :"+result);

    }
}
