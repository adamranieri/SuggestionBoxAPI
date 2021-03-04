package dev.ranieri.daos;

import dev.ranieri.entities.Suggestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SuggestionDaoLocal implements  SuggestionDAO {

    private static Map<Integer,Suggestion> suggestionTable = new HashMap<>();
    private static int counter = 0;

    @Override
    public Suggestion createSuggestion(Suggestion suggestion) {
        suggestion.setId(++counter);
        suggestionTable.put(counter,suggestion);
        return suggestion;
    }

    @Override
    public Suggestion getSuggestionById(int id) {
        return suggestionTable.get(id);
    }

    @Override
    public Set<Suggestion> getAllSuggestions() {
        Set<Suggestion> suggestions = new HashSet<>(suggestionTable.values());
        return suggestions;
    }

    @Override
    public Suggestion updateSuggestion(Suggestion suggestion) {
        suggestionTable.put(suggestion.getId(),suggestion);
        return suggestion;
    }

    @Override
    public boolean deleteSuggestionById(int id) {
        Suggestion suggestion = suggestionTable.remove(id);
        return  suggestion != null;
    }
}
