
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
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/alterarFilme.scala.html
                  HASH: e4ecd903fc9b18a3cddfff2b177c13efcd58af85
                  MATRIX: 740->1|877->35|907->57|935->60|964->81|1003->83|1036->90|1282->310|1325->344|1365->346|1401->355|1439->366|1516->422|1724->603|1739->609|1778->627|1856->675|1891->684|1934->718|1974->720|2016->734|2120->808|2159->820
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|43->16|43->16|43->16|45->18|45->18|45->18|52->25|52->25|52->25|54->27|56->29|56->29|56->29|57->30|58->31|60->33
                  -- GENERATED --
              */
          