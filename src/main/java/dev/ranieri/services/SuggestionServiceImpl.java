package dev.ranieri.services;

import dev.ranieri.daos.SuggestionDAO;
import dev.ranieri.entities.Suggestion;

import java.util.Set;

public class SuggestionServiceImpl implements SuggestionService{

    private SuggestionDAO suggestionDAO;

    public SuggestionServiceImpl(SuggestionDAO suggestionDAO) {
        this.suggestionDAO = suggestionDAO;
    }

    @Override
    public Suggestion createSuggestion(Suggestion suggestion) {
        return this.suggestionDAO.createSuggestion(suggestion);
    }

    @Override
    public Set<Suggestion> getAllSuggestions() {
        return this.suggestionDAO.getAllSuggestions();
    }

    @Override
    public Suggestion getSuggestionById(int id) {
        return this.suggestionDAO.getSuggestionById(id);
    }

    @Override
    public Suggestion updateSuggestion(Suggestion suggestion) {
        return this.updateSuggestion(suggestion);
    }
}
