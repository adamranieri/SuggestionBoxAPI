package dev.ranieri.services;

import dev.ranieri.daos.SuggestionDAO;
import dev.ranieri.entities.Suggestion;

import java.util.*;

public class SuggestionServiceImpl implements SuggestionService{

    private SuggestionDAO suggestionDAO;

    public SuggestionServiceImpl(SuggestionDAO suggestionDAO) {
        this.suggestionDAO = suggestionDAO;
    }

    @Override
    public Suggestion createSuggestion(Suggestion suggestion) {
        if (suggestion.getPriority() > 10){
            suggestion.setPriority(10);
        }else if(suggestion.getPriority() < 0){
            suggestion.setPriority(0);
        }

        suggestion.setDateSubmitted(System.currentTimeMillis()/1000);

        return this.suggestionDAO.createSuggestion(suggestion);
    }

    @Override
    public Set<Suggestion> getAllSuggestions() {
        Set<Suggestion>  suggestions =this.suggestionDAO.getAllSuggestions();

        Comparator<Suggestion> orderByPriority = (sugg1, sugg2) ->{

            if(sugg1.getPriority()<sugg2.getPriority()){
                return  1;
            }
            if(sugg1.getPriority()>sugg2.getPriority()){
                return  -1;
            }
            return 0;
        };

        Set<Suggestion> orderedSuggestions = new TreeSet<>(orderByPriority);
        orderedSuggestions.addAll(suggestions);
        return orderedSuggestions;
    }

    @Override
    public Suggestion getSuggestionById(int id) {
        return this.suggestionDAO.getSuggestionById(id);
    }
}
