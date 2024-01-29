// JavaScript
function sieveOfEratosthenes(n) {
  // Initialize all elements of boolean array `prime[0..n]` with true.
  const prime = Array.from({ length: n + 1 }, () => true)
  for (let p = 2; p * p <= n; p++) {
    if (prime[p]) {
      // Update all multiples of p to false, i.e. not prime
      for (i = p * p; i <= n; i += p) prime[i] = false
    }
  }

  // Print all prime numbers
  for (let i = 2; i <= n; i++) {
    if (prime[i] == true) console.log(i)
  }
}

sieveOfEratosthenes(20)
