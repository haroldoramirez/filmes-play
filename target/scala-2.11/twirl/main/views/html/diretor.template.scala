
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
object diretor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Diretor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(diretores: List[Diretor]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/main("Diretores")/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
"""),format.raw/*3.1*/("""<div class="container">
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<li class="active">
					<a href=""""),_display_(/*7.16*/routes/*7.22*/.DiretorCRUD.novoDiretor()),format.raw/*7.48*/("""">Novo Diretor</a>
				</li>
				<li class="active"><a href="/">Home</a></li>
			</ul>
			<h3 class="text-muted">Diretores</h3>
		</div>
	<table class="table table-striped table-bordered" id="example" cellpadding="0" cellspacing="0" border="0" width="100%">
		<tfoot>
			"""),_display_(/*15.5*/for(diretor <- diretores) yield /*15.30*/ {_display_(Seq[Any](format.raw/*15.32*/("""
				"""),format.raw/*16.5*/("""<tr>
				 	<th>
						<a href=""""),_display_(/*18.17*/routes/*18.23*/.DiretorCRUD.detalhar(diretor.id)),format.raw/*18.56*/("""">
				  			"""),_display_(/*19.11*/diretor/*19.18*/.nome),format.raw/*19.23*/("""
				 	 	"""),format.raw/*20.9*/("""</a>
				 	</th>
				</tr>
			""")))}),format.raw/*23.5*/("""
		"""),format.raw/*24.3*/("""</tfoot>
	</table>
</div>
""")))}))}
  }

  def render(diretores:List[Diretor]): play.twirl.api.HtmlFormat.Appendable = apply(diretores)

  def f:((List[Diretor]) => play.twirl.api.HtmlFormat.Appendable) = (diretores) => apply(diretores)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/diretor.scala.html
                  HASH: f1a8b4886d9fa7eb991a9ea303c83b9da9297b40
                  MATRIX: 732->1|846->27|874->30|899->47|937->48|965->50|1122->181|1136->187|1182->213|1488->493|1529->518|1569->520|1602->526|1663->560|1678->566|1732->599|1773->613|1789->620|1815->625|1852->635|1916->669|1947->673
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|35->7|35->7|35->7|43->15|43->15|43->15|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|51->23|52->24
                  -- GENERATED --
              */
          