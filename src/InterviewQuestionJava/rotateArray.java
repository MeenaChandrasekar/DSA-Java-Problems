package InterviewQuestionJava;

 class rotateArray {
	/*
	    public void rotate(int[] nums, int k) {
	   
	        k %= nums.length;
	        int n = nums.length;
	        reverseNum(nums,0,n-1);
	        reverseNum(nums,0,k-1);
	        reverseNum(nums,k,n-1);
	    }
	    public void reverseNum(int[] nums, int start, int end) {
	        while(start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}*/
	 
	 static void reverse(int[] a, int start,int end) {
		 while(start<end) {
           int temp=a[start];
           a[start]=a[end];
           a[end]=temp;
           start++;
           end--;
		 }
	 }
	 
	 static void rotate(int[] a,int k) {
		 k=k%a.length;
		 if(k<0) {
			 k=k+a.length;
		 }
		 
		 reverse(a,0,k-1);
		 reverse(a,k,a.length-1);
		 reverse(a,0,a.length-1);
	 }

	 public static void main(String[] args) {
		 int[] a= {1,2,3,4,5};
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]+" ");
		 }
		 System.out.println();
		 rotate(a,3);
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]+" ");

		 }

	 }
 }
 


