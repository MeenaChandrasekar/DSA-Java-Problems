package InterviewQuestionJava;
//import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums= {0,1,2,2,3,0,4,2};
		int val=3;
		
	System.out.println(removeElements(nums,val));
}


static int removeElements(int nums[],int val) {
	int count=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]!=val) {
			nums[count]=nums[i];
			count++;
		}
	}
	return count;
}
}