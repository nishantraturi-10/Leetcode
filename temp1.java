package LeetcodeProblems;

public class temp1 {
    static String[] allSubstring(String str){
        int possibleSubStrings=str.length()*(str.length()+1)/2;
        String[] sub=new String[possibleSubStrings];

        int index=0;
        // traversing in the string.
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                sub[index]=str.substring(i,j);
                index++;
            }
        }
        return  sub;
    }

    static int lengthOfLongestSubstring(String s) {
        int count=1;
        String[] result1=allSubstring(s);

        for(int i=0;i<result1.length;i++){
            if(result1[i].length()>count){
                count=result1[i].length();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String mainn="abc";
        String[] result=allSubstring(mainn);

        System.out.print("All possible substrings are : ");
        for(String x:result){
            System.out.print(x+" ");
        }

        int result2=lengthOfLongestSubstring(mainn);
        System.out.println("");
        System.out.println("Length of largest substring is : "+result2);
    }
}
