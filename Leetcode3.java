package LeetcodeProblems;

public class Leetcode3 {
    static int lengthOfLongestSubstring(String s) {
        StringBuilder temp=new StringBuilder("");
        int count =0;
        char firstCh=s.charAt(0);
        temp.append(firstCh);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)==s.charAt(i)){
                temp.delete(0,i);       // empty the entire string
            }
            else{
                for(int j=i;i>0;j--){
                  if(s.charAt(j)==s.charAt(j-1)){
                      temp.delete(0,j);
                  }
                  else{
                      temp.append(s.charAt(i));
                      count++;
                  }
                }
            }
        }
        System.out.println("String is  : "+temp);
        return count;
    }
    public static void main(String[] args) {
        String str="abcabcbb";
        int result=lengthOfLongestSubstring(str);
        System.out.println("Answer : "+result);
    }
}
