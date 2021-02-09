package com.inter;

public class Subway2 {

	public static void main(String[] args) {
		Sandwich[] sandwich = new Sandwich[3];
		
		sandwich[0]=new EggMayo();
		sandwich[1]=new Shrimp();
		sandwich[2]=new EggMayo();
		for(Sandwich sw : sandwich) {
			System.out.println(sw.getClass().getName());
			System.out.println(sw.getCalorie()+"kal");
			System.out.println(sw.getIngredient());
			System.out.println(sw.getDescription());
			System.out.println();
		}
	}

}
