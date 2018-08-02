package august1;

public class Euclid {
	public Euclid() {}
	
	/**
	 * recursive method to find greatest common divisor
	 * @param m
	 * @param n
	 * @return
	 */
	public int findGreatestCommonDivisor(int m, int n) {
		int r = m % n;
		if(r == 0) {
			return n;
		}
		return findGreatestCommonDivisor(n, r);
	}

}
																				