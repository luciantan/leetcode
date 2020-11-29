package amazon.vo201911.a683_wordBreakIII;

import java.util.HashSet;
import java.util.Set;

//683. Word Break III
//        中文English
//        Give a dictionary of words and a sentence with all whitespace removed, return the number of sentences you can form by inserting whitespaces to the sentence so that each word can be found in the dictionary.
//
//        Example
//        Example1
//
//        Input:
//        "CatMat"
//        ["Cat", "Mat", "Ca", "tM", "at", "C", "Dog", "og", "Do"]
//        Output: 3
//        Explanation:
//        we can form 3 sentences, as follows:
//        "CatMat" = "Cat" + "Mat"
//        "CatMat" = "Ca" + "tM" + "at"
//        "CatMat" = "C" + "at" + "Mat"
//        Example1
//
//        Input:
//        "a"
//        []
//        Output: 0
//        Notice
//        Ignore case

public class Solution {
    /*
     * @param : A string
     * @param : A set of word
     * @return: the number of possible sentences.
     */
    public int wordBreak3(String s, Set<String> dict) {
        int n = s.length();
        String lowerS = s.toLowerCase();

        Set<String> lowerDict = new HashSet<String>();
        for(String str : dict) {
            lowerDict.add(str.toLowerCase());
        }
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = i; j < n;j++){
                String sub = lowerS.substring(i, j + 1);
                if(lowerDict.contains(sub)){
                    dp[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k < j; k++){
                    dp[i][j] += (dp[i][k] * dp[k + 1][j]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
