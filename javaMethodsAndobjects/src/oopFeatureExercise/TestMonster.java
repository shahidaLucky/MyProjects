package oopFeatureExercise;

public class TestMonster {

	public static void main(String[] args) {

		System.out.println("----FireMonster----");
		Monster m1 = new FireMonster("r2u2");
		System.out.println(m1.attack());

		System.out.println("----WaterMonster----");
		Monster m2 = new WaterMonster("u2r2");
		System.out.println(m2.attack());

		System.out.println("----StoneMonster----");
		Monster m3 = new StoneMonster("r2r2");
		System.out.println(m3.attack());

		System.out.println("----Monster----");
		Monster m4 = new Monster("u2u2");
		System.out.println(m4.attack());

	}

}
