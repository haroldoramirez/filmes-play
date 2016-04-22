
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
object campo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.1*/("""<div class=""""),_display_(/*2.14*/if(elements.hasErrors)/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""error""")))}/*2.45*/else/*2.50*/{_display_(Seq[Any](format.raw/*2.51*/("""form-group""")))}),format.raw/*2.62*/("""">
    <label for=""""),_display_(/*3.18*/elements/*3.26*/.id),format.raw/*3.29*/("""" class="col-sm-2 control-label">"""),_display_(/*3.63*/elements/*3.71*/.label),format.raw/*3.77*/("""</label>
   <div class="col-sm-10">
     """),_display_(/*5.7*/elements/*5.15*/.input),format.raw/*5.21*/("""
   """),format.raw/*6.4*/("""</div>
</div>"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:16:22 BRT 2016
                  SOURCE: C:/Users/Haroldo/sources/filmes-play/app/views/campo.scala.html
                  HASH: efeaa7121cae19d4c0019dcfa03c4191d5603826
                  MATRIX: 737->1|857->33|885->35|924->48|954->70|993->72|1017->79|1029->84|1067->85|1108->96|1155->117|1171->125|1194->128|1254->162|1270->170|1296->176|1365->220|1381->228|1407->234|1438->239
                  LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2|31->3|31->3|31->3|31->3|31->3|31->3|33->5|33->5|33->5|34->6
                  -- GENERATED --
              */
          