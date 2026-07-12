class Solution {

    public double myPow(double x, int n) {

        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        if (x == 1) return 1.0;
        if (x == -1 && n % 2 == 0) return 1.0;
        if (x == -1 && n % 2 != 0) return -1.0;

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double answer = 1.0;

        while (power > 0) {

            if (power % 2 == 1) {
                answer *= x;
            }

            x *= x;

            power /= 2;
        }

        return answer;
    }
}