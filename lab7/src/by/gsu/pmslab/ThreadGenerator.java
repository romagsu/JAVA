package by.gsu.pmslab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadGenerator {

    private Scanner in = new Scanner(System.in);
    private int numberThread;
    private int nextMass;
    private int sum;
    private int mainResult;
    private List<Integer> endThread = new ArrayList();

    public void execute() throws java.io.IOException{
        Operations operations = new Operations();
        int[] mass;
        System.out.println("Enter the number of threads: ");
        Scanner scanner = new Scanner(System.in);
        numberThread=scanner.nextInt();
        mass = new int[numberThread];
        for (int i =1; i <= numberThread; i++){
            CalculatorThread calculatorThread = new CalculatorThread();
            System.out.println("Enter a number for " + i);
            mass[i-1] = in.nextInt();
            nextMass = mass[i-1];
            sum = calculatorThread.sumOfPrimes(nextMass, numberThread);
            System.out.println(sum);
            endThread.add(sum);
        }
        System.out.println(endThread);
        mainResult = operations.operation(endThread);
    }

    public int getResult(){
        return mainResult;
    }
}