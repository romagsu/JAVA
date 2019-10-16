package by.gsu.pmslab;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalculatorThread extends Thread {

    public int sumOfPrimes(int n, int threadNumber)
    {
        //pool
        ExecutorService executor = Executors.newFixedThreadPool(threadNumber);

        boolean prime[]=new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++)
            if (prime[i])
                sum += i;

        executor.shutdown();
        return sum;
    }
}