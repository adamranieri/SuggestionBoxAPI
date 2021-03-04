package dev.ranieri.servicetests;

import dev.ranieri.daos.SuggestionDAO;
import dev.ranieri.entities.Suggestion;
import dev.ranieri.services.SuggestionService;
import dev.ranieri.services.SuggestionServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class SuggestionServiceTest {

    @Mock
    private SuggestionDAO suggestionDAO;

    private SuggestionService suggestionService = null;

    @BeforeEach
    void setUp(){
        Suggestion suggestion1 = new Suggestion(0,"More breaks",10,0);
        Suggestion suggestion2 = new Suggestion(0,"Coffe Maker is broken",7,0);
        Suggestion suggestion3 = new Suggestion(0,"4 day work week",9,0);

        Set<Suggestion> suggestionSet = new HashSet<>();
        suggestionSet.add(suggestion1);
        suggestionSet.add(suggestion2);
        suggestionSet.add(suggestion3);
        Mockito.when(suggestionDAO.getAllSuggestions()).thenReturn(suggestionSet);
        this.suggestionService = new SuggestionServiceImpl(this.suggestionDAO);
    }

    @Test
    void priority_sorting(){

    Set<Suggestion> suggestions = this.suggestionService.getAllSuggestions();

    int lastPriority =999;

        for(Suggestion suggestion : suggestions){
            System.out.println(suggestion);
            if(suggestion.getPriority()<=lastPriority){
                lastPriority = suggestion.getPriority();
            }else{
                Assertions.fail();
            }
        }

    }
}
