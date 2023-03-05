/* 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_len = 10000000;

        if(strs.length == 1){
            return strs[0];
        }
        for(String str : strs){
            if(str.length()<min_len){
                min_len = str.length();
                if(min_len == 1 && strs.length == 1){
                    return str;
                }
            }
        }
        System.out.println("Minimum length: " + min_len);

        String sub_str = "";
        for(int j=1;j<=min_len;j++){
            String sub = strs[0].substring(0,j);
            System.out.println("Fisrst: "+sub);
            boolean flag = true;
            for(int i=0;i<strs.length;i++){
                System.out.println("Second: "+sub);
                if(strs[i].substring(0,j).equals(sub)){
                    System.out.println("Equal");
                }
                else{
                    flag = false;
                }
            }
            if(flag == true){
                sub_str = sub;
            }
        }

        return sub_str;
    }
}
