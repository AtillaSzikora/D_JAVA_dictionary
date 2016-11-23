package dictionary_helper;

import dictionary_data.DictionaryData;
import dictionary_data.MeaningData;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryHelperImpl implements DictionaryHelper {

    @Override
    public int initDictFromFile() {
        File myFile = new File("src/dictTexts");
        Scanner scanner = null;
        int lineInFile = 0;
        String lineOfFile, keyFromLine;
        String [] valuesFromLine;

        try { scanner = new Scanner(myFile);
        } catch (FileNotFoundException e) { e.printStackTrace(); }

        while (scanner.hasNextLine()) {
            lineOfFile = scanner.nextLine();
            keyFromLine = lineOfFile.substring(0, lineOfFile.indexOf("="));
            valuesFromLine = lineOfFile.substring(lineOfFile.indexOf('='), lineOfFile.length()).split(",");

            DictionaryData.add(keyFromLine, new MeaningData(valuesFromLine[0], valuesFromLine[1], valuesFromLine[2]));

            lineInFile++;
        }
        return lineInFile;
    }
}
