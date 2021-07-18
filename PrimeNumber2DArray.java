package com;

public class PrimeNumber2DArray {
    public static void main(String[] args) {
        PrimeNumber2DArray p = new PrimeNumber2DArray();

        int start = 0;
        int end = 100;

        int[][] primeNumber = new int[10][];
        int j1 = 0, j2 = 0;

        // declaring array
        for (int i = 0; i < 10; i++) {

            for (int j = start; j <= end; j++) {

                if (p.isPrime(j))
                    j1++;

            }

            primeNumber[i] = new int[j1];
            start = end + 1;
            end += 100;
            j1 = 0;

        }

        start = 0;
        end = 100;

        // putting values inside the array
        for (int i = 0; i < 10; i++) {

            for (int j = start; j <= end; j++) {

                if (p.isPrime(j)) {
                    primeNumber[i][j2] = j;
                    j2++;
                }
            }

            start = end + 1;
            end += 100;
            j2 = 0;

        }

        // printing the array
        for (int i = 0; i < primeNumber.length; i++) {
            for (int j = 0; j < primeNumber[i].length; j++) {
                System.out.print(primeNumber[i][j]+" ");
            }
            System.out.println();
        }

    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
