package com.nicollefavero.madlibs.words;

import java.util.Map;

public abstract class RepeatedWords {

    Map<String, Integer> repeatedWords;

    abstract void initializeRepeatedWordsTable(Map<String, Integer> tableFromFileJson);

    protected void setRepeatedWords(Map<String, Integer> repeatedWords) {
        this.repeatedWords = repeatedWords;
    }

    public boolean contains(String blanksIndex){
        return repeatedWords.containsKey(blanksIndex);
    }

    public Integer getRepeatedWord(String blanksIndex){
        return repeatedWords.get(blanksIndex);
    }
}
