class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int l=0, r=0, product=1; int count=0;
        while(r<nums.length){
            product*=nums[r];
            while(product>=k && l<=r){
                product = product / nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}