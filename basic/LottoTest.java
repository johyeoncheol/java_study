package com.practice;

public class LottoTest {
		//45(1~45) -> 6°³
	public static void main(String[] args) {
		int[] nums = new int[6];
		//...Math.random()
		for(int i =0 ; i<nums.length;i++) {
			nums[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i;++j) {
				if(nums[j]==nums[i]) {
					i--;
					break;
				}
			}
		}
		for(int i: nums) {		
			System.out.print(i + " ");
		}
		
	}

}
