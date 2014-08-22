
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
object alterarFilme extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Filme],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, filmeForm: Form[Filme]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Alterar filme")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""

   """),format.raw/*7.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/">Home</a></li>
        </ul>
      </div>

    <h1>Alterar filme</h1>

    """),_display_(/*16.6*/form(routes.FilmeCRUD.alterar(id))/*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""

     """),format.raw/*18.6*/("""<fieldset>"""),_display_(/*18.17*/inputText(filmeForm("nome"), '_label -> "Nome do filme")),format.raw/*18.73*/("""</fieldset>

      <div class="control-group">
        <div class="actions">

            <input type="submit" value="Gravar" class="btn btn-primary">

            <a href=""""),_display_(/*25.23*/routes/*25.29*/.FilmeCRUD.lista()),format.raw/*25.47*/("""" class="btn btn-primary ">Cancelar</a>

    """)))}),format.raw/*27.6*/("""

    """),_display_(/*29.6*/form(routes.FilmeCRUD.remover(id))/*29.40*/ {_display_(Seq[Any](format.raw/*29.42*/("""
            """),format.raw/*30.13*/("""<input type="submit" value="Remover esse filme" class="btn danger">
    """)))}),format.raw/*31.6*/("""

        """),format.raw/*33.9*/("""</div>
      </div>

</div>

""")))}))}
  }

  def render(id:Long,filmeForm:Form[Filme]): play.twirl.api.HtmlFormat.Appendable = apply(id,filmeForm)

  def f:((Long,Form[Filme]) => play.twirl.api.HtmlFormat.Appendable) = (id,filmeForm) => apply(id,filmeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Aug 20 14:21:52 BRT 2014
                  SOURCE: /home/haroldo/Projetos/filmes-play/app/views/alterarFilme.scala.html
                  HASH: 198cde7c386ce62c37e2f23ebb1a1bcb177caf36
                  MATRIX: 740->1|877->35|905->54|932->56|961->77|1000->79|1031->84|1268->295|1311->329|1351->331|1385->338|1423->349|1500->405|1701->579|1716->585|1755->603|1831->649|1864->656|1907->690|1947->692|1988->705|2091->778|2128->788
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|43->16|43->16|43->16|45->18|45->18|45->18|52->25|52->25|52->25|54->27|56->29|56->29|56->29|57->30|58->31|60->33
                  -- GENERATED --
              */
          