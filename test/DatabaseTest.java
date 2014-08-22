import java.io.File;

import models.Diretor;
import models.Filme;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import play.Configuration;
import play.test.Helpers;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import static org.fest.assertions.Assertions.assertThat;


public class DatabaseTest {
	
	private static Configuration additionalConfigurations;

	public static play.test.FakeApplication app;
	
	@BeforeClass
	public static void startApp() {

		Config additionalConfig = ConfigFactory.parseFile(new File("conf/testes.conf"));
		additionalConfigurations = new Configuration(additionalConfig);
		System.out.println(additionalConfigurations.asMap());

		app = Helpers.fakeApplication(additionalConfigurations.asMap());

		Helpers.start(app);
	}
	
	@AfterClass
	public static void stopApp() {
		Helpers.stop(app);
	}

	@Test
	public void testaDiretor() {

		Diretor diretor = new Diretor();
		diretor.nome = "Santa Tartaruga";
		diretor.save();
		assertThat(diretor.id).isNotNull();

	}
	
	@Test
	public void testaFilme() {

		Filme filme = Filme.find.byId((long) 1);
		assertThat("The Terminator").isEqualTo(filme.nome);

	}
	
	@Test
	public void testaSaveFilme() {

		Filme filme = new Filme();
		filme.nome = "O máscara";
		filme.save();
		assertThat("O máscara").isEqualTo(filme.nome);

	}
	
}