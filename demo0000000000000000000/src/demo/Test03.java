package demo;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		/*
		 * BigInteger zero = BigInteger.ZERO; System.out.println(zero);
		 */
		/*int[] a = { 1, 8, 6, 7, 5, 3, 4 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));*/
		ThreadLocal<Quick> t = new ThreadLocal<>();
		Quick q = new Quick();
		Quick q1 = new Quick();
		System.out.println(q);
		System.out.println(q1);
		t.set(q);
		t.set(q1);
		Quick quick = t.get();
		System.out.println(quick);

		System.out.println(9);

		System.out.println(8);

	}
}
