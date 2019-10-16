package by.gsu.pmslab;

import java.util.List;
import java.util.Scanner;

public class Operations {

    private int operation;
    private Scanner in = new Scanner(System.in);

    public int operation(List<Integer> allThread){
        int result = 0;
        System.out.println("Enter operation number for threads ");
        System.out.println("1 - Addition ");
        System.out.println("2 - Subtraction ");
        System.out.println("3 - Multiplication ");
        operation = in.nextInt();
        System.out.println("Array in method ==> "+allThread);
        switch (operation){
            case 1:
                for(int item : allThread){
                    result += item;
                }
                break;
            case 2:
                for (int i = 0; i <= allThread.size() - 1; i++) {
                    result = allThread.get(0);
                    for (int j = 1; j <= allThread.size() - 1; j++){
                        result -= allThread.get(j);
                    }
                }
                break;
            case 3:
                result = 1;
                for(int item : allThread){
                    result *= item;
                }
                break;
        }
        return result;
    }
}