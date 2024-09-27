class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
      int n = nums.length;
      int count =1;
      int[] arr = new int[n];
      arr[0] = nums[0];
      for(int i=0;i<n-1;i++){
        if(nums[i] != nums[i+1]){
          count++;
          arr[count-1] = nums[i+1];
        }
      }
      for(int i=0;i<n;i++){
        nums[i] = arr[i];
      }
      return count;
    }
}