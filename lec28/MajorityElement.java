package lec28;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int majority_element = 0;
            int n=nums.length;
            int count = 0;
            if(n==1){
                return nums[0];
            }
            for(int i = 0 ; i<n ;i++ ){
                if(count==0){
                    majority_element=nums[i];
                    count++;
                }
                else if(nums[i]==majority_element){
                    count++;
                }
                else if(nums[i]!=majority_element){
                    count--;
                }
            }
            return majority_element;
        }
    }

}
