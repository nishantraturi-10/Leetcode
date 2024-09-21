package LeetcodeProblems;

public class temp2 {
    static int lengthOfLongestSubstring(String s) {
        int possibleSubStrings=s.length()*(s.length()+1)/2;
        String[] sub=new String[possibleSubStrings];

        int index=0;
        // traversing in the string.
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                sub[index]=s.substring(i,j);
                index++;
            }
        }

        // now all the substrings are stored in the sub array , we will now traverse the array
        int count=1;

        for(int i=0;i<sub.length;i++) {
            if (sub[i].length() > count) {
                count = sub[i].length();
            }
        }
        return count;
    }
}
