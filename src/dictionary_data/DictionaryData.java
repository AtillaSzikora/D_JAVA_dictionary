package dictionary_data;

import java.util.HashMap;
import java.util.Map;

public class DictionaryData {
    private static Map<String, MeaningData> dictionary = new HashMap<>();

    public static Map<String, MeaningData> getDictionary() {
        return dictionary;
    }
    public static void setDictionary(Map<String, MeaningData> dictionary) {
        DictionaryData.dictionary = dictionary;
    }

    public static void add(String word, MeaningData meanings){ dictionary.put(word, meanings); }
    public static void delete(String word){ dictionary.remove(word); }

    MeaningData get(String word) {
        return null;
    }
}
