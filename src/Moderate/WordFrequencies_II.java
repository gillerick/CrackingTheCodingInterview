package Moderate;

//Solution for word frequency counter for repeated queries

import java.util.HashMap;

public class WordFrequencies_II {
    HashMap<String, Integer> setupDictionary(String[] book){
        HashMap<String, Integer> table = new HashMap<String, Integer>();
        for (String word: book){
            word = word.toLowerCase();
            if (!word.trim().equals("")){
                table.put(word, 0);
            }
            table.put(word, table.get(word) + 1);
        }
        return table;
    }

    int getFrequency(HashMap<String, Integer> table, String word){
        if (table == null || word == null) return -1;
        word = word.toLowerCase();
        if (table.containsKey(word)){
            return table.get(word);
        }
        return 0;
    }
}

