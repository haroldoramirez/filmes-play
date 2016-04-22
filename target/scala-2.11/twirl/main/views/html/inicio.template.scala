
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object inicio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Play - Filmes")/*1.23*/ {_display_(Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<style>
<!--
body """),format.raw/*5.6*/("""{"""),format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""padding-top: 50px;
"""),format.raw/*7.1*/("""}"""),format.raw/*7.2*/("""
"""),format.raw/*8.1*/(""".startertemplate """),format.raw/*8.18*/("""{"""),format.raw/*8.19*/("""
	"""),format.raw/*9.2*/("""padding: 40px 15px;
	text-align: center;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""-->
</style>
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapser"></button>
				<a class="navbar-brand" href="/">Filmes - Play</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="/diretor">Diretores</a></li>
					<li><a href="/filme">Filmes</a></li>
					<li><a href="/sobre">Sobre o sistema</a></li>
					<li><a href="https://www.playframework.com/">Sobre o Play Framework</a></li>
					<li>
						<a href="http://getbootstrap.com/">Sobre o Boostrap</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="starter-template">
			<h1>Top 100 filmes Cult</h1>
			<p class="lead">O melhor do cinema está aqui!</p>
		</div>
	</div>

""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/inicio.scala.html
                  HASH: d65cffc994a527afe60eb6da0191b4e99abaacce
                  MATRIX: 799->1|828->22|867->24|897->28|943->48|970->49|999->52|1045->72|1072->73|1100->75|1144->92|1172->93|1201->96|1271->139|1299->140|1328->142
                  LINES: 29->1|29->1|29->1|31->3|33->5|33->5|34->6|35->7|35->7|36->8|36->8|36->8|37->9|39->11|39->11|40->12
                  -- GENERATED --
              */
          