package com.nicollefavero.madlibs.words;


import java.util.Map;

public class RepeatedWordsImpl extends RepeatedWords {

    @Override
    public void initializeRepeatedWordsTable(Map<String, Integer> tableFromFileJson) {
        setRepeatedWords(tableFromFileJson);
    }
}
