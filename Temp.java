package LeetcodeProblems;

public class Temp {

    static int lengthOfLongestSubstring(String s) {
        int count=1;
        String ans=""+s.charAt(0);
        //StringBuilder temp=new StringBuilder("");       // a

        for(int i=1;i<s.length();i++){
            char current=s.charAt(i);
            for(int j=0;j<ans.length();j++){
                if(current==ans.charAt(j)){

                    break;
                }
                else{
                    ans+=current;
                    count++;
                }
            }
        }
        System.out.println(ans);
        return count;
    }
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));

    }
}
