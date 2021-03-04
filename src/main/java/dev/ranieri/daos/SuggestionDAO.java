package dev.ranieri.daos;

import dev.ranieri.entities.Suggestion;

import java.util.Set;

public interface SuggestionDAO {

    Suggestion createSuggestion(Suggestion suggestion);

    Suggestion getSuggestionById(int id);
    Set<Suggestion> getAllSuggestions();

    Suggestion updateSuggestion(Suggestion suggestion);

    boolean deleteSuggestionById(int id);

}
