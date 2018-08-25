package com.referenceCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FindOccurrencesOfWordsInFile {

    public static void main(String[] args) throws Exception {
//        TODO:using path and paths for getting text files
        Path path = Paths.get(System.getProperty("user.dir"))
                .resolve("article.txt");
//        TODO:using bufferedReader for FileReader
        BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));

        Map<String, Integer> frequency = new HashMap<>();

        String line = reader.readLine();

        while (line != null) {
//            System.out.println("Processing Line: " + line);

            if (!line.trim().equals("")) {
//                TODO:using split
                String[] words = line.split(" ");

                for (String word : words) {
                    if (word == null || word.trim().equals("")) {
                        continue;
                    }
                    String processed = word.toLowerCase();
                    processed = processed.replace(",", "");

//                    TODO:incrementing the value of a map.
                    if (frequency.containsKey(processed)) {
                        frequency.put(processed, frequency.get(processed) + 1);
                    } else {
                        frequency.put(processed, 1);
                    }
                }
            }
            line = reader.readLine();
        }


        System.out.println(frequency);

        int mostFrequentlyUsed = 0;
        String theWord = null;

        for (String word : frequency.keySet()) {
            Integer theVal = frequency.get(word);
            if (theVal > mostFrequentlyUsed) {
                mostFrequentlyUsed = theVal;
                theWord = word;
            }
        }

        System.out.printf("The most frequently used word is %s, %d times",
                theWord, mostFrequentlyUsed);
    }

}
