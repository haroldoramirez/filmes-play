
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
object alterarDiretor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Diretor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, diretorForm: Form[Diretor]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Alterar diretor")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

   """),format.raw/*7.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/">Home</a></li>
        </ul>
      </div>

    <h1>Alterar diretor</h1>

    """),_display_(/*16.6*/form(routes.DiretorCRUD.alterar(id))/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""

     """),format.raw/*18.6*/("""<fieldset>"""),_display_(/*18.17*/inputText(diretorForm("nome"), '_label -> "Nome do diretor")),format.raw/*18.77*/("""</fieldset>

      <div class="control-group">
        <div class="actions">

            <input type="submit" value="Gravar" class="btn btn-primary">

            <a href=""""),_display_(/*25.23*/routes/*25.29*/.DiretorCRUD.lista()),format.raw/*25.49*/("""" class="btn btn-primary ">Cancelar</a>

    """)))}),format.raw/*27.6*/("""

    """),_display_(/*29.6*/form(routes.DiretorCRUD.remover(id))/*29.42*/ {_display_(Seq[Any](format.raw/*29.44*/("""
            """),format.raw/*30.13*/("""<input type="submit" value="Remover esse diretor" class="btn danger">
    """)))}),format.raw/*31.6*/("""

        """),format.raw/*33.9*/("""</div>
      </div>

</div>

""")))}))}
  }

  def render(id:Long,diretorForm:Form[Diretor]): play.twirl.api.HtmlFormat.Appendable = apply(id,diretorForm)

  def f:((Long,Form[Diretor]) => play.twirl.api.HtmlFormat.Appendable) = (id,diretorForm) => apply(id,diretorForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Aug 20 14:21:52 BRT 2014
                  SOURCE: /home/haroldo/Projetos/filmes-play/app/views/alterarDiretor.scala.html
                  HASH: 68d089e484fc968cb8a3442dd753e31a5d0b65ac
                  MATRIX: 744->1|885->39|913->58|940->60|971->83|1010->85|1041->90|1280->303|1325->339|1365->341|1399->348|1437->359|1518->419|1719->593|1734->599|1775->619|1851->665|1884->672|1929->708|1969->710|2010->723|2115->798|2152->808
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|43->16|43->16|43->16|45->18|45->18|45->18|52->25|52->25|52->25|54->27|56->29|56->29|56->29|57->30|58->31|60->33
                  -- GENERATED --
              */
          