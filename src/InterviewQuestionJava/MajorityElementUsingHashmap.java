package InterviewQuestionJava;

import java.util.HashMap;

public class MajorityElementUsingHashmap {

	public static void main(String[] args) {
		
		int[] arr = {1,1,1,1,2,3};
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		hmap.put(arr[0], 1);
		
		int maxFrequency =  1;
		int maxElement = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			boolean keyExists = hmap.containsKey(arr[i]);
			if(keyExists) {
				int existingFreq = hmap.get(arr[i]);
				hmap.put(arr[i], existingFreq+1);
			}else {
				hmap.put(arr[i],1);
			}
			
			int freq = hmap.get(arr[i]);
			if(freq > maxFrequency) {
				maxFrequency = freq;
				maxElement = arr[i];
			}
		}
		
		int sizeOfArray = arr.length;
		if(maxFrequency > (sizeOfArray/2)) {
			System.out.println(maxElement);
		}else {
			System.out.println("-1");
		}	
		
	}
}
