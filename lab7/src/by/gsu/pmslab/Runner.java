package by.gsu.pmslab;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        ThreadGenerator threadGenerator = new ThreadGenerator();
        threadGenerator.execute();
        System.out.println("Result ===> " + threadGenerator.getResult());

    }
}
