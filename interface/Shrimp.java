package com.inter;

public class Shrimp implements Sandwich {

	@Override
	public int getCalorie() {
		return 253;
	}

	@Override
	public String getIngredient() {
		return "���� 5����, ġ�� 2��, ����Ʈ ĥ��, ��ġ, ��ĥ��";
	}

	@Override
	public String getDescription() {
		return "�ʱ��� �İ��� �״�� ����ִ� ����찡 "
				+ "5���� �� �� �� ���� ���� �� ���� ��¥ ������ ǳ�̰� ����";
	}

}
