package play.algorithm;

public class Steps {
	static long f2(int n) {
		long [] a = new long[n];
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		for (int i = 3; i < a.length; i++) {
			a[i] = a[i-1] + a[i-2] + a[i-3];
		}
		return a[n - 1];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(f2(10));
	}
}
