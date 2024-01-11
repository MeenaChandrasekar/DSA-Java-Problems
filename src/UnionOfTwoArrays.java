package JobPreparation.TwoPointers;

import java.util.HashSet;

public class UnionOfTwoArrays {
	public static int doUnion(int a[],int n,int b[], int m) {
		HashSet<Integer> union=new HashSet<>();
		for(int i=0;i<n;i++) {
			union.add(a[i]);
		}
		for(int j=0;j<m;j++) {
			union.add(b[j]);
		}
	return union.size();
	}	

public static void main(String[] args) {
	int a1[]= {1,2,3,4,5};
	int b1[]= {1,2,3,6};
	
	int n1=a1.length;
	int m1=b1.length;
	
	System.out.println(doUnion(a1,n1,b1,m1)); //output 6
}
}
