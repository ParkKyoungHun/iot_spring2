package com.iot.sp2.test;

import java.util.Arrays;

public class Solution {
	public int solution(int arr[]) {
		int answer = 0;
		int pIdx = 0;
		int aIdx = 0;
        for(int i=0,max=arr.length;i<max;i++){
        	pIdx = i-1;
        	aIdx = i+1;
        	if(i%2==0){
        		
        	}
        }
		return answer;
	}
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] a = {14, 6, 5, 11, 3, 9, 2, 10};
    	System.out.println(s.solution(a));
    }
}
