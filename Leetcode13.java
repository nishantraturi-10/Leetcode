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
            // value of first symbol.
            int s1=getValue(str.charAt(i));

            // this code will execute if string has more than single characters.
            if((i+1) < str.length())
            {
                // value of second symbol.
                int s2=getValue(str.charAt(i+1));

                if(s1>=s2)
                {
                    result=result+s1;
                }
                else
                {
                    result=result+(s2-s1);
                    i++;
                }
            }
            else    // for a single character left in the string this code will run .
            {
                result=result+s1;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int output=romanToInteger("IX");
        System.out.println(output);
    }
}
