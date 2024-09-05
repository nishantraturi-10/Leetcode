package LeetcodeProblems;

public class Leetcode13
{
    static int getValue(char ch)
    {
        switch (ch)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }

    }
    static int romanToInteger(String str)   // IV
    {
        int result=0;

        // iterating through the string
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if((i+1) < str.length())
            {

            }
            else    // for a single character this code will run
            {
                result=getValue(c);
                return result;
            }
        }


        return result;
    }
    public static void main(String[] args) {

        int output=romanToInteger("C");
        System.out.println(output);
    }
}
