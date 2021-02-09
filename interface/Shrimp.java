package com.inter;

public class Shrimp implements Sandwich {

	@Override
	public int getCalorie() {
		return 253;
	}

	@Override
	public String getIngredient() {
		return "새우 5마리, 치즈 2장, 스위트 칠리, 렌치, 핫칠리";
	}

	@Override
	public String getDescription() {
		return "탱글한 식감이 그대로 살아있는 통새우가 "
				+ "5마리 들어가 한 입 베어 먹을 때 마다 진짜 새우의 풍미가 가득";
	}

}
