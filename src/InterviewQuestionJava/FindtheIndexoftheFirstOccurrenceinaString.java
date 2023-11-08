package InterviewQuestionJava;

public class FindtheIndexoftheFirstOccurrenceinaString {
	public static void main(String[] args) {
		String haystack="sadbutsad";
		String needle="sad"; //sad=0. any other word condition is -1.
		System.out.println(strStr(haystack,needle));
		
	}

 public static int strStr(String haystack, String needle) {
	 return haystack.indexOf(needle);
	 
 }
}
/*
class Solution {
public int strStr(String haystack, String needle){
	
 return haystack.indexOf(needle);
 
}
}*/