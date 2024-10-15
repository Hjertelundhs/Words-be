package com.synonymous.words.controller;

import com.synonymous.words.model.WordInput; // New model for input
import com.synonymous.words.service.SynonymService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/synonyms")
public class SynonymController {

    private SynonymService synonymService;

    public SynonymController(SynonymService synonymService) {
        this.synonymService = synonymService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addSynonym(@RequestBody WordInput wordInput) {
        synonymService.addSynonym(wordInput.getWord(), wordInput.getSynonyms());
        return ResponseEntity.ok("Synonyms added successfully.");
    }

    @GetMapping("/lookup/{word}")
    public ResponseEntity<Set<String>> getSynonyms(@PathVariable String word) {
        Set<String> synonyms = synonymService.getSynonyms(word);
        return ResponseEntity.ok(synonyms);
    }
}
