package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Arrays {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int minCount = n/2;
        
        Map<Integer,Integer> visited = new HashMap<>();

        for(int num: nums) {
            int count = visited.getOrDefault(num, 0) + 1; 
            if(count > minCount)
            {
                return num;
            }
            visited.put(num, count);
        }
        return -1;        
    } 
}