class SecondLargest {
    public int print2largest(int[] arr) {
        // Code Here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secmax = max;
                max= arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] !=max && arr[i]>secmax){
                secmax = arr[i];
            }
        }
        
        return secmax;
    }
}