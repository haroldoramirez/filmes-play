
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
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/sobre.scala.html
                  HASH: a8298a30baf6d92fb98aa97b6bbe1a608e9f755d
                  MATRIX: 730->1|859->42|887->44|977->109|1004->116|1055->141|1069->147|1124->182|1231->263|1245->269|1299->303|1380->357|1395->363|1448->395|1516->436|1531->442|1596->486|1834->697|1862->704|2014->829|2047->841
                  LINES: 26->1|29->1|30->2|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|48->20|48->20|52->24|52->24
                  -- GENERATED --
              */
          