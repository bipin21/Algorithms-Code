package Lab1;

public class Problem1gcd {
    static int gcd(int m, int n) {
        int temp = m;
        if (m > n) {
            m = n;
            n = temp;
        }
        if (n % m == 0) return m;
        int range = m / 2;
        int max = -1;
        for (int i = 2; i < range; i++) {
            if (m % i == 0) {
                if (n % i == 0) {
                    max = i;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("GCD is : " + gcd(24, 20));
        System.out.println("GCD is : " + gcd(20, 24));

        System.out.println("GCD is : " + gcd(98, 56));
        System.out.println("GCD is : " + gcd(56, 98));

        System.out.println("GCD is : " + gcd(13, 17));
        System.out.println("GCD is : " + gcd(13, 15));
    }
}
