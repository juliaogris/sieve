// Java
class SieveOfEratosthenes {
    void sieveOfEratosthenes(int n) {
        // Initialize all elements of boolean array `prime[0..n]` with true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                // Update all multiples of p to false, i.e. not prime
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i])
                System.out.println(i + " ");
        }
    }

    public static void main(String args[]) {
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        s.sieveOfEratosthenes(20);
    }
}
