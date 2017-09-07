// Pauline Yang
//September 6 2017
//this is the runner for the calculate library
//it is used to test the methods and calculate

public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(-7));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2.5,4.6));
		System.out.println(Calculate.average(3.4, 4.6, 6.0));
		System.out.println(Calculate.toDegrees(6.28));
		System.out.println(Calculate.toRadians(360));
		System.out.println(Calculate.discriminant(3, 10, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
	}
}
