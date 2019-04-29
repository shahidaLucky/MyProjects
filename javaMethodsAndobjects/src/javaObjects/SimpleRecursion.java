package javaObjects;

public class SimpleRecursion {

	public static void main(String[] args) {
		int num = 10;
		recFun(num);

	}

	static void recFun(int num) {
		if (num == 0) {
			System.out.println("Reached 0 :" + num);
		} else {
			num = num - 2;
			System.out.println(num);
			recFun(num);
		}
	}
}
