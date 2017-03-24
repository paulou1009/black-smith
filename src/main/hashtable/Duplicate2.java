package main.hashtable;

import java.util.HashSet;
import java.util.Set;

public class Duplicate2 {

    public static boolean hasDuplicate(int[] nums, int k){
        if(nums.length < 2) return false;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }

            if( i > k - 1 ) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
