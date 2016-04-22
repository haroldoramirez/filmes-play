
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
object novoDiretor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Diretor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(diretorForm : Form[Diretor]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Novo diretor")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

   """),format.raw/*5.4*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="/">Home</a></li>
        </ul>
      </div>
      <div>
      """),_display_(/*12.8*/helper/*12.14*/.form(action=routes.DiretorCRUD.gravar())/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
      """),format.raw/*13.7*/("""<form class="form-horizontal">
		<fieldset>

		<legend>Novo diretor</legend>

		<div class="control-group">
		  <div class="controls">
		    """),_display_(/*20.8*/helper/*20.14*/.inputText(diretorForm("nome"))),format.raw/*20.45*/("""
		    """),format.raw/*21.7*/("""<p class="help-block">informe o nome do diretor</p>
		  </div>
		</div>
		""")))}),format.raw/*24.4*/("""

		"""),format.raw/*26.3*/("""<div class="control-group">
		  <label class="control-label" for="singlebutton"></label>
		  <div class="controls">
		    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Gravar</button>
		  </div>
		</div>
      </div>
""")))}))}
  }

  def render(diretorForm:Form[Diretor]): play.twirl.api.HtmlFormat.Appendable = apply(diretorForm)

  def f:((Form[Diretor]) => play.twirl.api.HtmlFormat.Appendable) = (diretorForm) => apply(diretorForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/novoDiretor.scala.html
                  HASH: f11b6bac4ac9aed18c8e0ae5f042ad045c60a8b3
                  MATRIX: 736->1|853->30|883->35|911->55|950->57|983->64|1212->267|1227->273|1277->314|1317->316|1352->324|1527->473|1542->479|1594->510|1629->518|1737->596|1770->602
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|40->12|40->12|40->12|40->12|41->13|48->20|48->20|48->20|49->21|52->24|54->26
                  -- GENERATED --
              */
          