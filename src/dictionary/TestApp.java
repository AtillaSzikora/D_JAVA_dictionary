package dictionary;

import dictionary_data.DictionaryData;
import dictionary_data.MeaningData;
import dictionary_helper.DictionaryHelper;
import dictionary_helper.DictionaryHelperImpl;
import java.util.Map;

public class TestApp {
    
    private static DictionaryHelper dictHelper = new DictionaryHelperImpl();

    public static void main(String[] args) {
        System.out.println("Line in dictTexts: " + dictHelper.initDictFromFile());

        System.out.println(DictionaryData.getDictionary().size());
        for (Map.Entry<String, MeaningData> entry : DictionaryData.getDictionary().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
