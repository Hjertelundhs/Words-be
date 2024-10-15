package com.synonymous.words.model;

import java.util.HashSet;
import java.util.Set;

public class Word {
    private final String word;
    private final Set<String> synonyms;

    public Word(String word) {
        this.word = word;
        this.synonyms = new HashSet<>();
    }

    public String getWord() {
        return word;
    }

    public Set<String> getSynonyms() {
        return synonyms;
    }

    public void addSynonym(String synonym) {
        this.synonyms.add(synonym);
    }

    // Add all synonyms from a list
    public void addSynonyms(Set<String> synonyms) {
        this.synonyms.addAll(synonyms);
    }
}
