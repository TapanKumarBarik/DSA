Given an array of real numbers greater than zero in form of strings.

Find if there exists a triplet (a,b,c) such that 1 < a+b+c < 2 . 

 Return 1 for true or 0 for false.

Example:

Given [0.6, 0.7, 0.8, 1.2, 0.4] ,

You should return 1

as

0.6+0.7+0.4=1.7

1<1.7<2

Hence, the output is 1.

O(n) solution is expected.

Note: You can assume the numbers in strings don’t overflow the primitive data type and there are no leading zeroes in numbers. Extra memory usage is allowed.

  
  
  
  public class Solution {
	double[] Amins = new double[2];
	double[] Amaxs = new double[4];
	double C = 3d;
	double[] Bmins = new double[2];

	public int solve(String[] A) {
		int n = A.length;
		double value;
		for (int i = 0; i < Amins.length; i++) {
			Amins[i] = 3d;
		}
		for (int i = 0; i < Bmins.length; i++) {
			Bmins[i] = 3d;
		}
		for (int i = 0; i < n; i++) {
			value = Double.valueOf(A[i]);
			if (value <= 0 || value >= 2) {
				continue;
			}
			if (value < 2d / 3) {
				updateARange(value);
			} else if (value < 1d) {
				updateBRange(value);
			} else {
				C = Math.min(C, value);
			}
		}

		// case 1 A,A,A
		if (Amaxs[1] != 0d && Amaxs[2] != 0d && Amaxs[3] != 0d) {
			if (inRange(Amaxs[1] + Amaxs[2] + Amaxs[3])) {
				return 1;
			}
		}
		// case 2 A A B
		if (Amaxs[2] != 0d && Amaxs[3] != 0d) {
			double sum = Amaxs[2] + Amaxs[3];
			double temp;
			for (int i = 0; i < n; i++) {
				temp = Double.valueOf(A[i]);
				if(temp<2d/3 || temp >= 1d){
					continue;
				}
				if (inRange(sum + temp)) {
					return 1;
				}
			}
		}

		// case 3 A A C
		if (inRange(Amins[0] + Amins[1] + C)) {
			return 1;
		}

		// case 4 A B B
		if (inRange(Amins[0] + Bmins[0] + Bmins[1])) {
			return 1;
		}
		// case 5 A B C
		if (inRange(Amins[0] + Bmins[0] + C)) {
			return 1;
		}

		return 0;
	}

	private boolean inRange(double value) {
		return (value > 1d && value < 2d);
	}

	private void updateBRange(double value) {
		if (value < Bmins[0]) {
			Bmins[1] = Bmins[0];
			Bmins[0] = value;
		} else if (value < Bmins[1]) {
			Bmins[1] = value;
		}
	}

	private void updateARange(double value) {
		if (value < Amins[0]) {
			Amins[1] = Amins[0];
			Amins[0] = value;
		} else if (value < Amins[1]) {
			Amins[1] = value;
		}

		Amaxs[0] = value;
		Arrays.sort(Amaxs);
	}

}
