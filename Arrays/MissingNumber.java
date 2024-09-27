class MissingNumber {
    public int missingNumber(int[] arr) {
        int n = arr.length;
     int actualsum = 0;
    for(int i=0;i<n;i++){
      actualsum += arr[i];
    }
  int totalsum = 0;
   for(int i=1;i<=n;i++){
     totalsum+= i;
   }
    return totalsum - actualsum;
    }
}

//You can also use hash array