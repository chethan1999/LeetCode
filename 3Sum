import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> list = new HashSet<List<Integer>>();

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        if(i!=j && i!=k && j!=k){
                            
                            List<Integer> arr = new ArrayList<Integer>();
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(nums[k]);
                            Collections.sort(arr);
                            list.add(arr);
                        }
                    }
                }
            }
        }
     return new ArrayList(list);
    }
}
