
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
object sobre extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sistema : String)(versaoDoPlay : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>"""),_display_(/*6.9*/sistema),format.raw/*6.16*/("""</title>

<link href=""""),_display_(/*8.14*/routes/*8.20*/.Assets.at("css/bootstrap.min.css")),format.raw/*8.55*/("""" rel="stylesheet" media="screen">
<link rel="stylesheet" media="screen" href=""""),_display_(/*9.46*/routes/*9.52*/.Assets.at("stylesheets/main.css")),format.raw/*9.86*/("""">
<link rel="shortcut icon" type="image.png" href=""""),_display_(/*10.51*/routes/*10.57*/.Assets.at("images/favicon.png")),format.raw/*10.89*/("""">
<script type="text/javascript" src=""""),_display_(/*11.38*/routes/*11.44*/.Assets.at("javascrips/jquery-2.1.1.min.js")),format.raw/*11.88*/("""">
</script>
</head>
<body>
	<div class="container">
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<li class="active"><a href="/">Home</a></li>
			</ul>
			<h3 class="text-muted">"""),_display_(/*20.28*/sistema),format.raw/*20.35*/("""</h3>
		</div>
		<div class="jumbotron">
			<p><a class="btn btn-lg btn-success" href="#">
			powered by Play Framework """),_display_(/*24.31*/versaoDoPlay),format.raw/*24.43*/("""</a></p>
		</div>
	</div>
</body>
</html>"""))}
  }

  def render(sistema:String,versaoDoPlay:String): play.twirl.api.HtmlFormat.Appendable = apply(sistema)(versaoDoPlay)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (sistema) => (versaoDoPlay) => apply(sistema)(versaoDoPlay)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Aug 12 14:40:17 BRT 2014
                  SOURCE: /home/haroldo/projetoseclipse/filmes/app/views/sobre.scala.html
                  HASH: 6680a6e230f0475bbad8c0d8dbd6967c6ff7ee26
                  MATRIX: 730->1|859->42|886->43|972->104|999->111|1048->134|1062->140|1117->175|1223->255|1237->261|1291->295|1371->348|1386->354|1439->386|1506->426|1521->432|1586->476|1815->678|1843->685|1991->806|2024->818
                  LINES: 26->1|29->1|30->2|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|48->20|48->20|52->24|52->24
                  -- GENERATED --
              */
          