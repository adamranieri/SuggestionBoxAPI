package dev.ranieri.services;

import dev.ranieri.entities.Suggestion;

import java.util.Set;

public interface SuggestionService {

    Suggestion createSuggestion(Suggestion suggestion);

    Set<Suggestion> getAllSuggestions();

    Set<Suggestion> getSuggestionByKeyword(String keyword);

    Suggestion getSuggestionById(int id);

    boolean deleteSuggestionById(int id);

    Suggestion updateSuggestion(Suggestion suggestion);

}
