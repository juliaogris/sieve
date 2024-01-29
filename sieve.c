// C
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

void sieveOfEratosthenes(int n) {
    // Initialize all elements of boolean array `prime[0..n]` with true.
    bool prime[n + 1];
    memset(prime, true, sizeof(prime));

    for (int p = 2; p * p <= n; p++) {
        if (prime[p]) {
            // Update all multiples of p to false, i.e. not prime
            for (int i = p * p; i <= n; i += p)
                prime[i] = false;
        }
    }

    // Print all prime numbers
    for (int p = 2; p <= n; p++)
        if (prime[p])
            printf("%d \n",p);
}

int main() {
    sieveOfEratosthenes(20);
    return 0;
}
