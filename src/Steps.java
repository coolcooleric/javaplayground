
public class Steps {
	static void f1() {
		long counter = 0;
		for (int i = 0; i <= 500; i++) {
			for (int j = 0; j <= 333; j++) {
				for (int k = 0; k <= 1000; k++) {
					if (i * 2 + j * 3 + k == 1000) {
						System.out.println("i=" + i + "\tj=" + j + "\tk=" + k);
						counter++;
					}
				}
			}
		}
		System.out.println("counter=" + counter);
	}

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
//		f1();
	}
}
