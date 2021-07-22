package Lab1;

public class Problem1gcd {

    // using brute force
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

    // using Eucladian algortihm
    public static int gcdE(int m, int n) {
       if(m==0) return n;
       return gcdE(n%m, m);
    }

    public static void main(String[] args) {
        System.out.println("\nUsing Normal algortihm: \n");
        // for 20 & 24
        System.out.println("GCD is : " + gcd(24, 20));
        System.out.println("GCD is : " + gcd(20, 24));
        // for 50 & 70
        System.out.println("GCD is : " + gcd(50, 70));
        System.out.println("GCD is : " + gcd(70, 50));


        // using Eucladian algortihm
        System.out.println("\nUsing Eucladian algortihm: \n");
        // for 20 & 24
        System.out.println("GCD is : " + gcdE(24, 20));
        System.out.println("GCD is : " + gcdE(20, 24));
        // for 98 & 56
        System.out.println("GCD is : " + gcdE(98, 56));
        System.out.println("GCD is : " + gcdE(56, 98));
    }
}
