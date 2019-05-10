import by.gsu.pms.Lexeme;
import by.gsu.pms.Sentence;
import by.gsu.pms.Text;

import java.io.File;

public class Runner {
    public static void main(String[] args) {
        final String FILE_PATH= "src/in.txt";
        final int SEARCH_LENGTH = 5;

        Text text = new Text(new File(FILE_PATH));
        System.out.println(text);
        System.out.println("Result of search:");
        for (Sentence sentence : text.getSentences()){
            if (sentence.getLexemes().contains(new Lexeme("?"))){
                for (Lexeme lexeme : sentence.getLexemes()){
                    if (lexeme.getLexeme().length() == SEARCH_LENGTH){
                        System.out.println(lexeme);
                    }
                }
            }
        }
    }
}
