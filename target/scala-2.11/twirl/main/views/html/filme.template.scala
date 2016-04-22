
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
object filme extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Filme],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(filmes: List[Filme]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""
"""),_display_(/*2.2*/main("Filmes")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""
    """),format.raw/*3.5*/("""<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
	      <li class="active"><a href=""""),_display_(/*6.37*/routes/*6.43*/.FilmeCRUD.novoFilme()),format.raw/*6.65*/("""">Novo filme</a></li>
          <li class="active"><a href="/">Home</a></li>
        </ul>
        <h3 class="text-muted">Filmes</h3>
      </div>
     <table class="table table-striped table-bordered" id="example" cellpadding="0" cellspacing="0" border="0" width="100%">
	    <tfoot>
	          <tr>
	            <th>Ano</th>
	            <th>Filme</th>
 	            <th>Diretor</th>
	            <th>Duração</th>
	            <th>Gênero</th>
	        </tr>

	      """),_display_(/*21.9*/for(filme <- filmes) yield /*21.29*/ {_display_(Seq[Any](format.raw/*21.31*/("""
	        """),format.raw/*22.10*/("""<tr>
	            <td>"""),_display_(/*23.19*/filme/*23.24*/.ano),format.raw/*23.28*/("""</td>
  	            <td>
	             <a href=""""),_display_(/*25.25*/routes/*25.31*/.FilmeCRUD.detalhar(filme.id)),format.raw/*25.60*/("""">"""),_display_(/*25.63*/filme/*25.68*/.nome),format.raw/*25.73*/("""</a>
	             <img src=""""),_display_(/*26.26*/routes/*26.32*/.FilmeCRUD.imagem(filme.id)),format.raw/*26.59*/("""" alt="">
	            </td>
 	            <td>"""),_display_(/*28.20*/filme/*28.25*/.diretor.getNome),format.raw/*28.41*/("""</td>
	            <td>"""),_display_(/*29.19*/filme/*29.24*/.duracao),format.raw/*29.32*/("""</td>
	            <td>"""),_display_(/*30.19*/filme/*30.24*/.genero),format.raw/*30.31*/("""</td>
	        </tr>
	             """)))}),format.raw/*32.16*/("""
	    """),format.raw/*33.6*/("""</tfoot>
	   </table>

	   	   <br/>
	   <br/>
		     """),_display_(/*38.9*/helper/*38.15*/.form(action = routes.FilmeCRUD.upload(), 'enctype -> "multipart/form-data")/*38.91*/ {_display_(Seq[Any](format.raw/*38.93*/("""
	    """),format.raw/*39.6*/("""<table class="table table-striped table-bordered" cellpadding="0" cellspacing="0" border="0" width="100%">
	      <tr>
	       <th>Escolha o filme</th>
		   <td>
			<select name="filmeId" >
			 """),_display_(/*44.6*/for(filme <- filmes) yield /*44.26*/ {_display_(Seq[Any](format.raw/*44.28*/("""
			   """),format.raw/*45.7*/("""<option value=""""),_display_(/*45.23*/filme/*45.28*/.id),format.raw/*45.31*/("""">"""),_display_(/*45.34*/filme/*45.39*/.id),format.raw/*45.42*/(""" """),format.raw/*45.43*/("""- """),_display_(/*45.46*/filme/*45.51*/.nome),format.raw/*45.56*/("""</option>
			   """)))}),format.raw/*46.8*/("""
			"""),format.raw/*47.4*/("""</select>
		  </td>
		 </tr>
		 <tr>
		  <th>Escolha uma imagem para fazer upload:</th>
		  <td>
		      <input type="file" name="picture" class="form-control">
		   </td>
		  </tr>
		  <tr>
		    <td colspan="2">
	          <input type="submit" class="btn btn-primary" value="Enviar imagem">
	       </td>
	      </tr>
	      </table>
		     """)))}),format.raw/*62.9*/("""
      """),format.raw/*63.7*/("""</div>
""")))}))}
  }

  def render(filmes:List[Filme]): play.twirl.api.HtmlFormat.Appendable = apply(filmes)

  def f:((List[Filme]) => play.twirl.api.HtmlFormat.Appendable) = (filmes) => apply(filmes)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/filme.scala.html
                  HASH: 0f6704f85d7e80be1371e175cf830a8ee4054421
                  MATRIX: 728->1|837->22|865->25|887->39|925->40|957->46|1117->180|1131->186|1173->208|1683->692|1719->712|1759->714|1798->725|1849->749|1863->754|1888->758|1967->810|1982->816|2032->845|2062->848|2076->853|2102->858|2160->889|2175->895|2223->922|2300->972|2314->977|2351->993|2403->1018|2417->1023|2446->1031|2498->1056|2512->1061|2540->1068|2609->1106|2643->1113|2729->1173|2744->1179|2829->1255|2869->1257|2903->1264|3129->1464|3165->1484|3205->1486|3240->1494|3283->1510|3297->1515|3321->1518|3351->1521|3365->1526|3389->1529|3418->1530|3448->1533|3462->1538|3488->1543|3536->1561|3568->1566|3957->1925|3992->1933
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|34->6|34->6|34->6|49->21|49->21|49->21|50->22|51->23|51->23|51->23|53->25|53->25|53->25|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|60->32|61->33|66->38|66->38|66->38|66->38|67->39|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|74->46|75->47|90->62|91->63
                  -- GENERATED --
              */
          