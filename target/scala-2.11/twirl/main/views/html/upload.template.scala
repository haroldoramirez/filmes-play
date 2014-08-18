
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
object upload extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("Upload finalizado com sucesso")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

   """),format.raw/*5.4*/("""<div class="container">
    <div class="header">
        <h2>"""),_display_(/*7.14*/mensagem),format.raw/*7.22*/("""</h2>
      </div>
		<div class="control-group">
		  <label class="control-label" for="singlebutton"></label>
		  <div class="controls">
		     <a href="/filme" class="btn btn-primary">retornar para lista de filmes</a>
		  </div>
		</div>
      </div>
""")))}))}
  }

  def render(mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => apply(mensagem)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Aug 15 16:10:32 BRT 2014
                  SOURCE: /home/haroldo/projetoseclipse/filmes/app/views/upload.scala.html
                  HASH: 6a570833d78cc2a1de065c98125680f6a8e06396
                  MATRIX: 724->1|830->19|858->22|903->59|942->61|973->66|1061->128|1089->136
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7
                  -- GENERATED --
              */
          