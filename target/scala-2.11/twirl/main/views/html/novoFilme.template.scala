
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
object novoFilme extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Filme],List[Diretor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(filmeForm : Form[Filme],diretores: List[Diretor]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitField/*3.15*/ = {{ FieldConstructor(campo.f) }};
Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*3.48*/("""

"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main(Messages("filme.novo"))/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<div class="container">

   <ul class="nav nav-pills pull-right">
     <li class="active"><a href=""""),_display_(/*12.35*/routes/*12.41*/.FilmeCRUD.lista()),format.raw/*12.59*/("""">Home</a></li>
   </ul>

  <div class="row clearfix">
    <div class="col-md-12 column">

	"""),_display_(/*18.3*/form(action=routes.FilmeCRUD.gravar(),'class->"form-horizontal")/*18.67*/ {_display_(Seq[Any](format.raw/*18.69*/("""

	"""),format.raw/*20.2*/("""<fieldset>

 	 	<legend>"""),_display_(/*22.14*/Messages("filme.novo")),format.raw/*22.36*/("""</legend>

           """),_display_(/*24.13*/select(
                       filmeForm("ano"),
                       options(Filme.anoOptions),
                       '_label -> Messages("filme.ano"),
                       '_default -> Messages("filme.ano.combo")
            )),format.raw/*29.14*/("""

			"""),_display_(/*31.5*/inputText(filmeForm("nome"),'_label -> Messages("filme.nome"))),format.raw/*31.67*/("""

	        """),_display_(/*33.11*/select(
                       filmeForm("diretor.id"),
                      options(Diretor.options),
                       '_label -> Messages("filme.diretor"), '_default -> Messages("filme.diretor.combo")
            )),format.raw/*37.14*/("""

			"""),_display_(/*39.5*/inputText(filmeForm("duracao"),'_label -> Messages("filme.duracao"))),format.raw/*39.73*/("""

			"""),_display_(/*41.5*/inputText(filmeForm("genero"),'_label ->Messages("filme.genero"))),format.raw/*41.70*/("""

				"""),format.raw/*43.5*/("""</fieldset>

				<div class="form-group">
				  <label class="col-md-3 col-md-3 control-label" for="singlebutton"> </label>
				  <div class="col-lg-6">
				    <button id="singlebutton" name="singlebutton" class="btn btn-primary">"""),_display_(/*48.80*/Messages("global.gravar")),format.raw/*48.105*/("""</button>
				     <a href=""""),_display_(/*49.20*/routes/*49.26*/.FilmeCRUD.lista()),format.raw/*49.44*/("""" class="btn btn-primary">"""),_display_(/*49.71*/Messages("global.cancel")),format.raw/*49.96*/("""</a>
				  </div>
				</div>
			""")))}),format.raw/*52.5*/("""
	"""),format.raw/*53.2*/("""</div>
	""")))}))}
  }

  def render(filmeForm:Form[Filme],diretores:List[Diretor]): play.twirl.api.HtmlFormat.Appendable = apply(filmeForm,diretores)

  def f:((Form[Filme],List[Diretor]) => play.twirl.api.HtmlFormat.Appendable) = (filmeForm,diretores) => apply(filmeForm,diretores)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Aug 18 16:31:57 BRT 2014
                  SOURCE: /home/haroldo/projetoseclipse/filmes/app/views/novoFilme.scala.html
                  HASH: 760b60f8871b4dc73e9bdb02f0751b9961a3f1a8
                  MATRIX: 746->1|891->54|912->67|975->51|1004->100|1032->119|1059->121|1095->149|1134->151|1162->153|1289->253|1304->259|1343->277|1462->370|1535->434|1575->436|1605->439|1657->464|1700->486|1750->509|2004->742|2036->748|2119->810|2158->822|2402->1045|2434->1051|2523->1119|2555->1125|2641->1190|2674->1196|2933->1428|2980->1453|3036->1482|3051->1488|3090->1506|3144->1533|3190->1558|3253->1591|3282->1593
                  LINES: 26->1|28->3|28->3|29->1|31->3|33->6|34->7|34->7|34->7|36->9|39->12|39->12|39->12|45->18|45->18|45->18|47->20|49->22|49->22|51->24|56->29|58->31|58->31|60->33|64->37|66->39|66->39|68->41|68->41|70->43|75->48|75->48|76->49|76->49|76->49|76->49|76->49|79->52|80->53
                  -- GENERATED --
              */
          