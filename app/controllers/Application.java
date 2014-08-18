package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.index.render("Your new application is ready."));
    }
    
    public static Result sobre() {
    	return ok(views.html.sobre.render("Top 100 Filmes Cult", play.core.PlayVersion.current()));
    }

}
