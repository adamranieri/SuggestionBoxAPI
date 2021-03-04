package dev.ranieri.servicetests;

import dev.ranieri.daos.SuggestionDaoLocal;
import dev.ranieri.entities.Suggestion;
import dev.ranieri.services.SuggestionService;
import dev.ranieri.services.SuggestionServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateSuggestionTest {

    @Test
    void create_suggestion_test_1()
    {
        SuggestionService suggestionService = new SuggestionServiceImpl(new SuggestionDaoLocal());
        Suggestion suggestion1 = new Suggestion(0,"More breaks",100,0);
        Suggestion updatedSuggestion1= suggestionService.createSuggestion(suggestion1);

        Assertions.assertTrue(updatedSuggestion1.getPriority()>=0 && updatedSuggestion1.getPriority()<=10);
    }

    @Test
    void create_suggestion_test_2()
    {
        SuggestionService suggestionService = new SuggestionServiceImpl(new SuggestionDaoLocal());
        Suggestion suggestion2 = new Suggestion(0,"Coffe Maker is broken",-10,0);
        Suggestion updatedSuggestion1= suggestionService.createSuggestion(suggestion2);

        Assertions.assertTrue(updatedSuggestion1.getPriority()>=0 && updatedSuggestion1.getPriority()<=10);
    }

    @Test
    void create_suggestion_test_3()
    {
        SuggestionService suggestionService = new SuggestionServiceImpl(new SuggestionDaoLocal());
        Suggestion suggestion3 = new Suggestion(0,"4 day work week",9,0);
        Suggestion updatedSuggestion1= suggestionService.createSuggestion(suggestion3);

        Assertions.assertTrue(updatedSuggestion1.getPriority()>=0 && updatedSuggestion1.getPriority()<=10);
    }
}
