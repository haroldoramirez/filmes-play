
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
object paginaNaoEncontrada extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Página Não Encontrada")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

   """),format.raw/*5.4*/("""<div class="container">
    <div class="header">
    	<h1>Top 100 filmes Cult</h1>
    	<h2>Essa página não existe...</h2>
        <h4>"""),_display_(/*9.14*/url),format.raw/*9.17*/("""</h4>
      </div>
		<div class="control-group">
		  <label class="control-label" for="singlebutton"></label>
		  <div class="controls">
		     <a href="/" class="btn btn-primary">Retornar</a>
		  </div>
		</div>
      </div>
""")))}))}
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/paginaNaoEncontrada.scala.html
                  HASH: ba946740d01172f95cd1ab1b9a7da1091e0a6d92
                  MATRIX: 737->1|838->14|868->19|905->48|944->50|977->57|1143->197|1166->200
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|37->9|37->9
                  -- GENERATED --
              */
          