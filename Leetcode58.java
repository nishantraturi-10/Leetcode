package LeetcodeProblems;

public class Leetcode58 {
    public static int lengthOfLastWord(String s) {
        int count=0;
        String str=s.trim();
        int index=str.length()-1;
        while(index>=0 && str.charAt(index)!=' '){
            count++;
            index--;
        }
        return count;
    }
    public static void main(String[] args) {
     String str=" Hello World ";    // original string
     System.out.println("The length of last wrod is : "+lengthOfLastWord(str));      // result
    }
}
