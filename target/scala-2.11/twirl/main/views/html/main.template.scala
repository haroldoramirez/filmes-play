
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css")),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/hello.js")),format.raw/*9.63*/("""" type="text/javascript"></script>
        <link href=""""),_display_(/*10.22*/routes/*10.28*/.Assets.at("css/bootstrap.min.css")),format.raw/*10.63*/("""" rel="stylesheet" media="screen">
    </head>
    <body>
      """),_display_(/*13.8*/if(flash.containsKey("sucesso"))/*13.40*/{_display_(Seq[Any](format.raw/*13.41*/("""
			"""),format.raw/*14.4*/("""<div class="alert alert-success">
				"""),_display_(/*15.6*/flash/*15.11*/.get("sucesso")),format.raw/*15.26*/("""
			"""),format.raw/*16.4*/("""</div>
		""")))}),format.raw/*17.4*/("""
		"""),_display_(/*18.4*/if(flash.containsKey("erro"))/*18.33*/{_display_(Seq[Any](format.raw/*18.34*/("""
			"""),format.raw/*19.4*/("""<div class="alert alert-danger">
				"""),_display_(/*20.6*/flash/*20.11*/.get("erro")),format.raw/*20.23*/("""
			"""),format.raw/*21.4*/("""</div>
		""")))}),format.raw/*22.4*/("""
        """),_display_(/*23.10*/content),format.raw/*23.17*/("""
    """),format.raw/*24.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/main.scala.html
                  HASH: 69cb3e8e5a88fa4e8f78d5b26501267edfa91a5a
                  MATRIX: 727->1|845->31|873->33|954->88|979->93|1068->156|1082->162|1136->196|1224->258|1238->264|1290->296|1342->322|1356->328|1410->362|1494->419|1509->425|1565->460|1659->528|1700->560|1739->561|1771->566|1837->606|1851->611|1887->626|1919->631|1960->642|1991->647|2029->676|2068->677|2100->682|2165->721|2179->726|2212->738|2244->743|2285->754|2323->765|2351->772|2384->778
                  LINES: 26->1|29->1|30->2|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|42->14|43->15|43->15|43->15|44->16|45->17|46->18|46->18|46->18|47->19|48->20|48->20|48->20|49->21|50->22|51->23|51->23|52->24
                  -- GENERATED --
              */
          