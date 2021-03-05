package dev.ranieri.app;

import dev.ranieri.controllers.SuggestionController;
import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        // small little edit
        Javalin app = Javalin.create();

        SuggestionController suggestionController = new SuggestionController();

        app.get("/suggestions",suggestionController.getAllSuggestions);

        app.get("/suggestions/:id",suggestionController.getSuggestionById);

        app.post("/suggestions", suggestionController.createSuggestion);

        app.put("/suggestions/:id", suggestionController.updateSuggestion);

        app.start();

    }
}
