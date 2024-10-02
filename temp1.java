package LeetcodeProblems;

public class temp1 {
    static String[] subStrings(String s) {
        int n=s.length();
        int possibleSubStrings=n*(n+1)/2;
        String[] arr=new String[possibleSubStrings];    // defining size of the array.

        int index=0;
        // traversing through the string.
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                arr[index]=s.substring(i,j);
                index++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String[] result=subStrings(s);

        for(String x:result){
            System.out.print(x+" ");
        }

    }
}
