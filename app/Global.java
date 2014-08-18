import static play.mvc.Results.notFound;
import play.Application;
import play.GlobalSettings;
import play.libs.F.Promise;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;

public class Global extends GlobalSettings {

	@Override
	public Promise<Result> onHandlerNotFound(RequestHeader request) {
		return Promise.<Result> pure(notFound(views.html.paginaNaoEncontrada.render(request.uri())));
	}

	@Override
	public void onStart(Application app) {

		System.out.println("Top 100 filmes cult no ar!");

	}
}