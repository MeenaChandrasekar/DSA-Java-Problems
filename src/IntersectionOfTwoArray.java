package JobPreparation.TwoPointers;

import java.util.HashSet;

public class IntersectionOfTwoArray {
	public static int NumberofElementsInIntersection(int[]a,int[]b, int n,int m) {
		HashSet<Integer> Intersection=new HashSet<>();
		int i=0;
		int j=0;
		
		while(i<n && j<m) {
			if(a[i]==b[j]) {
				Intersection.add(a[i]);
				i++;
				j++;
			}else if(a[i]<b[j]) {
				i++;
			}else {
				j++;
			}
		}
		return Intersection.size();
		}

public static void main(String[] args) {
	int[] a1= {1,2,2,3,3,4,6};
	int[] b1= {2,2,3,4};          
	//intersection of two arrays - distinct common elements between the two arrays. 


	
	int n=a1.length;
	int m=b1.length;
	System.out.println(IntersectionOfTwoArray.NumberofElementsInIntersection(a1, b1, n, m));
}
}
