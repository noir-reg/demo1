/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author mical
 */
public class Demo {

    public static final double PI = 3.1415;

    public static long getPowerForInt(int a, int b) {

        if (a < 0 || a > 9) {
            throw new IllegalArgumentException("Invalid a. a must be between 0..9");
        }
        if (b < 0 || b > 9) {
            throw new IllegalArgumentException("Invalid b. b must be between 0..9");
        }
        long product = a;
        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException("Undefined.");
            } else {
                product = 0;
            }
        } else {
            if (b == 0) {
                product = 1;
            } else if (b == 1) {
                product = a;
            } else {
                for (int i = 2; i <= b; i++) {
                    product *= a;
                }

            }
        }

        return product;
    }

    public static void main(String[] args) {
        System.out.println(getPowerForInt(5, 3));
        System.out.println(isPrime(5));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
