package dev.ranieri.servicetests;

import dev.ranieri.daos.SuggestionDaoLocal;
import dev.ranieri.entities.Suggestion;
import dev.ranieri.services.SuggestionService;
import dev.ranieri.services.SuggestionServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SuggestionServiceDeleteTests {

    private SuggestionService suggestionService = new SuggestionServiceImpl(new SuggestionDaoLocal());

    @BeforeEach
    void setUp(){
        Suggestion suggestion1 = new Suggestion(0,"More breaks",10,0);
        Suggestion suggestion2 = new Suggestion(0,"Coffee Maker is broken",7,0);
        Suggestion suggestion3 = new Suggestion(0,"4 day work week",9,0);

        suggestionService.createSuggestion(suggestion1);
        suggestionService.createSuggestion(suggestion2);
        suggestionService.createSuggestion(suggestion3);
    }

    @Test
    void delete_by_id(){
        boolean result = suggestionService.deleteSuggestionById(2);

        Assertions.assertTrue(result);
    }

    @Test
    void delete_by_invalid_id(){
        boolean result = suggestionService.deleteSuggestionById(999);

        Assertions.assertFalse(result);
    }
}
