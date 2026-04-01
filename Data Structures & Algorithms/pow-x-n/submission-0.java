class Solution {

    public double pow(double x, long n){
        if (n == 0) return 1.0;
        double halfPow = pow(x, n/2);
        if (n % 2 == 0) {
            return halfPow * halfPow;
        }
        return x * halfPow * halfPow;
    }


    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            power = -power;
            x = 1/x;
        }
        return pow(x, power);
    }
}
