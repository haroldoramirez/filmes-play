
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
                  DATE: Mon Aug 18 16:31:57 BRT 2014
                  SOURCE: /home/haroldo/projetoseclipse/filmes/app/views/main.scala.html
                  HASH: 077636473970da8ac1fbd4883e4fe484fe2f9ca7
                  MATRIX: 727->1|845->31|872->32|949->83|974->88|1062->150|1076->156|1130->190|1217->251|1231->257|1283->289|1334->314|1348->320|1402->354|1485->410|1500->416|1556->451|1647->516|1688->548|1727->549|1758->553|1823->592|1837->597|1873->612|1904->616|1944->626|1974->630|2012->659|2051->660|2082->664|2146->702|2160->707|2193->719|2224->723|2264->733|2301->743|2329->750|2361->755
                  LINES: 26->1|29->1|30->2|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|42->14|43->15|43->15|43->15|44->16|45->17|46->18|46->18|46->18|47->19|48->20|48->20|48->20|49->21|50->22|51->23|51->23|52->24
                  -- GENERATED --
              */
          