# Python
def sieve_of_eratosthenes(n):
    # Initialize all elements of boolean array `prime[0..n]` with true.
    prime = [True for i in range(n+1)]
    p = 2
    while p * p <= n:
        if prime[p]:
            # Update all multiples of p to false, i.e. not prime
            for i in range(p * p, n+1, p):
                prime[i] = False
        p += 1
 
    # Print all prime numbers
    for p in range(2, n+1):
        if prime[p]:
            print(p)
 
if __name__ == '__main__':
    sieve_of_eratosthenes(20)
