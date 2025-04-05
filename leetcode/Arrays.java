package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Arrays {

    // return the number which's count is greater than n/2
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
    
    public void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int leftIndex = m - 1;
        int rightIndex = n - 1;
        int index = m + n -1;

        while(leftIndex >= 0 && rightIndex >= 0) {
            if(nums1[leftIndex] >= nums2[rightIndex]) {
                nums1[index] = nums1[leftIndex];
                leftIndex--;
            }
            else {
                nums1[index] = nums2[rightIndex];
                rightIndex--;
            }
            index--;
        }

        while(rightIndex >= 0) {
            nums1[index] = nums2[rightIndex];
            rightIndex--;
            index--;
        }
    }

    // remove element equals to val
    // return the number of elements remaining
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int number : nums) {
            if(number != val) {                
                nums[k] = number;
                k++;
            }         
        }

        return k;
    }

    // remove duplicates from sorted array
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 1;

        for(int i = 1; i < n; i++) {
            if(nums[i] != nums[i-1])
            {
                nums[k] = nums[i]; 
                k++;
            }
        }

        return k;
    }
}