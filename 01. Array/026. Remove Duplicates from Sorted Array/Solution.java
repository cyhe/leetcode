/**
 *  File Name: Solution.java
 *  Desc: xxxx 
 *  Author: cyhe 
 *  Created Time: 2016-11-27 21:28:15
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int j = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
