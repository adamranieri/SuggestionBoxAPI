package dev.ranieri.services;

import dev.ranieri.entities.Suggestion;

import java.util.Set;

public interface SuggestionService {

    Suggestion createSuggestion(Suggestion suggestion);

    Set<Suggestion> getAllSuggestions();

    Suggestion getSuggestionById(int id);

}
