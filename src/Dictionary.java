import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 54167208T on 31/01/2017.
 */
public class Dictionary {
    private List<String> wordSet = Arrays.asList("abase", "abbey", "abbot", "abdicate", "abducens", "aberration", "abbeted", "abhorrent", "abject", "abjude", "abnegate", "abnormal", "abomination", "aboriginal");

    public String getRandomWord() {
        Collections.shuffle(wordSet);
        return wordSet.get(0);
    }
}
