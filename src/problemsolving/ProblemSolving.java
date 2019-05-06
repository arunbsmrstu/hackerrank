/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ProblemSolving {

    
  static final long LIMIT = 1000000000000000000L;
	static final int PRIME_NUM = 15;

	public static void main(String[] args) {
		int[] primes = buildPrimes();

		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			long n = sc.nextLong();

			System.out.println(solve(primes, n));
		}
		sc.close();
	}

	static int[] buildPrimes() {
		int[] primes = new int[PRIME_NUM];

		int prime = 2;
		for (int i = 0; i < primes.length; i++) {
			while (!isPrime(prime)) {
                            prime++;
			}
                        System.out.println("prime "+prime);
			primes[i] = prime;
			prime++;
                        
                        
		}
                
		return primes;
	}

	static boolean isPrime(int x) {
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
//primes.length &&
	static int solve(int[] primes, long n) {
		int result = 0;
		long product = 1;
                System.out.println(">>>"+primes.length);
		for (int i = 0; product * primes[i] <= n; i++) {
			result++;
			product *= primes[i];
		}
		return result;
	}
    
}
