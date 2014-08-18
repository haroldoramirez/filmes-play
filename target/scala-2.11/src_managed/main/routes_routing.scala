// @SOURCE:/home/haroldo/projetoseclipse/filmes/conf/routes
// @HASH:ca47de636cd53773f05dc1565704f79f90dafd6d
// @DATE:Mon Aug 18 16:31:55 BRT 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Inicio_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Inicio_index0_invoker = createInvoker(
controllers.Inicio.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Inicio", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_sobre1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sobre"))))
private[this] lazy val controllers_Application_sobre1_invoker = createInvoker(
controllers.Application.sobre(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sobre", Nil,"GET", """""", Routes.prefix + """sobre"""))
        

// @LINE:8
private[this] lazy val controllers_Application_index2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play"))))
private[this] lazy val controllers_Application_index2_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """play"""))
        

// @LINE:11
private[this] lazy val controllers_DiretorCRUD_lista3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor"))))
private[this] lazy val controllers_DiretorCRUD_lista3_invoker = createInvoker(
controllers.DiretorCRUD.lista(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "lista", Nil,"GET", """ Diretores""", Routes.prefix + """diretor"""))
        

// @LINE:12
private[this] lazy val controllers_DiretorCRUD_novoDiretor4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/novo"))))
private[this] lazy val controllers_DiretorCRUD_novoDiretor4_invoker = createInvoker(
controllers.DiretorCRUD.novoDiretor(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "novoDiretor", Nil,"GET", """""", Routes.prefix + """diretor/novo"""))
        

// @LINE:13
private[this] lazy val controllers_DiretorCRUD_detalhar5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DiretorCRUD_detalhar5_invoker = createInvoker(
controllers.DiretorCRUD.detalhar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "detalhar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """diretor/$id<[^/]+>"""))
        

// @LINE:14
private[this] lazy val controllers_DiretorCRUD_alterar6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DiretorCRUD_alterar6_invoker = createInvoker(
controllers.DiretorCRUD.alterar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "alterar", Seq(classOf[Long]),"POST", """""", Routes.prefix + """diretor/$id<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_DiretorCRUD_gravar7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/"))))
private[this] lazy val controllers_DiretorCRUD_gravar7_invoker = createInvoker(
controllers.DiretorCRUD.gravar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "gravar", Nil,"POST", """""", Routes.prefix + """diretor/"""))
        

// @LINE:16
private[this] lazy val controllers_DiretorCRUD_remover8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/"),DynamicPart("id", """[^/]+""",true),StaticPart("/remover"))))
private[this] lazy val controllers_DiretorCRUD_remover8_invoker = createInvoker(
controllers.DiretorCRUD.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "remover", Seq(classOf[Long]),"POST", """""", Routes.prefix + """diretor/$id<[^/]+>/remover"""))
        

// @LINE:19
private[this] lazy val controllers_FilmeCRUD_lista9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filme"))))
private[this] lazy val controllers_FilmeCRUD_lista9_invoker = createInvoker(
controllers.FilmeCRUD.lista(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "lista", Nil,"GET", """ Filmes""", Routes.prefix + """filme"""))
        

// @LINE:20
private[this] lazy val controllers_FilmeCRUD_novoFilme10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filme/novo"))))
private[this] lazy val controllers_FilmeCRUD_novoFilme10_invoker = createInvoker(
controllers.FilmeCRUD.novoFilme(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "novoFilme", Nil,"GET", """""", Routes.prefix + """filme/novo"""))
        

// @LINE:21
private[this] lazy val controllers_FilmeCRUD_detalhar11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filme/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FilmeCRUD_detalhar11_invoker = createInvoker(
controllers.FilmeCRUD.detalhar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "detalhar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """filme/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_FilmeCRUD_alterar12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filme/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FilmeCRUD_alterar12_invoker = createInvoker(
controllers.FilmeCRUD.alterar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "alterar", Seq(classOf[Long]),"POST", """""", Routes.prefix + """filme/$id<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_FilmeCRUD_gravar13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filme/"))))
private[this] lazy val controllers_FilmeCRUD_gravar13_invoker = createInvoker(
controllers.FilmeCRUD.gravar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "gravar", Nil,"POST", """""", Routes.prefix + """filme/"""))
        

// @LINE:24
private[this] lazy val controllers_FilmeCRUD_remover14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filme/"),DynamicPart("id", """[^/]+""",true),StaticPart("/remover"))))
private[this] lazy val controllers_FilmeCRUD_remover14_invoker = createInvoker(
controllers.FilmeCRUD.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "remover", Seq(classOf[Long]),"POST", """""", Routes.prefix + """filme/$id<[^/]+>/remover"""))
        

// @LINE:25
private[this] lazy val controllers_FilmeCRUD_upload15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filmesUpload"))))
private[this] lazy val controllers_FilmeCRUD_upload15_invoker = createInvoker(
controllers.FilmeCRUD.upload(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "upload", Nil,"POST", """""", Routes.prefix + """filmesUpload"""))
        

// @LINE:26
private[this] lazy val controllers_Services_listaFilmesEmJSON16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filmesJSON"))))
private[this] lazy val controllers_Services_listaFilmesEmJSON16_invoker = createInvoker(
controllers.Services.listaFilmesEmJSON(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Services", "listaFilmesEmJSON", Nil,"GET", """""", Routes.prefix + """filmesJSON"""))
        

// @LINE:27
private[this] lazy val controllers_Services_listaFilmesEmXML17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filmesXML"))))
private[this] lazy val controllers_Services_listaFilmesEmXML17_invoker = createInvoker(
controllers.Services.listaFilmesEmXML(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Services", "listaFilmesEmXML", Nil,"GET", """""", Routes.prefix + """filmesXML"""))
        

// @LINE:28
private[this] lazy val controllers_FilmeCRUD_imagem18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("filmeImagem"))))
private[this] lazy val controllers_FilmeCRUD_imagem18_invoker = createInvoker(
controllers.FilmeCRUD.imagem(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "imagem", Seq(classOf[Long]),"GET", """""", Routes.prefix + """filmeImagem"""))
        

// @LINE:31
private[this] lazy val controllers_Assets_at19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Inicio.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sobre""","""controllers.Application.sobre()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor""","""controllers.DiretorCRUD.lista()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/novo""","""controllers.DiretorCRUD.novoDiretor()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>""","""controllers.DiretorCRUD.detalhar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>""","""controllers.DiretorCRUD.alterar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/""","""controllers.DiretorCRUD.gravar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>/remover""","""controllers.DiretorCRUD.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filme""","""controllers.FilmeCRUD.lista()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filme/novo""","""controllers.FilmeCRUD.novoFilme()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filme/$id<[^/]+>""","""controllers.FilmeCRUD.detalhar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filme/$id<[^/]+>""","""controllers.FilmeCRUD.alterar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filme/""","""controllers.FilmeCRUD.gravar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filme/$id<[^/]+>/remover""","""controllers.FilmeCRUD.remover(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filmesUpload""","""controllers.FilmeCRUD.upload()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filmesJSON""","""controllers.Services.listaFilmesEmJSON()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filmesXML""","""controllers.Services.listaFilmesEmXML()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """filmeImagem""","""controllers.FilmeCRUD.imagem(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Inicio_index0_route(params) => {
   call { 
        controllers_Inicio_index0_invoker.call(controllers.Inicio.index())
   }
}
        

// @LINE:7
case controllers_Application_sobre1_route(params) => {
   call { 
        controllers_Application_sobre1_invoker.call(controllers.Application.sobre())
   }
}
        

// @LINE:8
case controllers_Application_index2_route(params) => {
   call { 
        controllers_Application_index2_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:11
case controllers_DiretorCRUD_lista3_route(params) => {
   call { 
        controllers_DiretorCRUD_lista3_invoker.call(controllers.DiretorCRUD.lista())
   }
}
        

// @LINE:12
case controllers_DiretorCRUD_novoDiretor4_route(params) => {
   call { 
        controllers_DiretorCRUD_novoDiretor4_invoker.call(controllers.DiretorCRUD.novoDiretor())
   }
}
        

// @LINE:13
case controllers_DiretorCRUD_detalhar5_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiretorCRUD_detalhar5_invoker.call(controllers.DiretorCRUD.detalhar(id))
   }
}
        

// @LINE:14
case controllers_DiretorCRUD_alterar6_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiretorCRUD_alterar6_invoker.call(controllers.DiretorCRUD.alterar(id))
   }
}
        

// @LINE:15
case controllers_DiretorCRUD_gravar7_route(params) => {
   call { 
        controllers_DiretorCRUD_gravar7_invoker.call(controllers.DiretorCRUD.gravar())
   }
}
        

// @LINE:16
case controllers_DiretorCRUD_remover8_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiretorCRUD_remover8_invoker.call(controllers.DiretorCRUD.remover(id))
   }
}
        

// @LINE:19
case controllers_FilmeCRUD_lista9_route(params) => {
   call { 
        controllers_FilmeCRUD_lista9_invoker.call(controllers.FilmeCRUD.lista())
   }
}
        

// @LINE:20
case controllers_FilmeCRUD_novoFilme10_route(params) => {
   call { 
        controllers_FilmeCRUD_novoFilme10_invoker.call(controllers.FilmeCRUD.novoFilme())
   }
}
        

// @LINE:21
case controllers_FilmeCRUD_detalhar11_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FilmeCRUD_detalhar11_invoker.call(controllers.FilmeCRUD.detalhar(id))
   }
}
        

// @LINE:22
case controllers_FilmeCRUD_alterar12_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FilmeCRUD_alterar12_invoker.call(controllers.FilmeCRUD.alterar(id))
   }
}
        

// @LINE:23
case controllers_FilmeCRUD_gravar13_route(params) => {
   call { 
        controllers_FilmeCRUD_gravar13_invoker.call(controllers.FilmeCRUD.gravar())
   }
}
        

// @LINE:24
case controllers_FilmeCRUD_remover14_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FilmeCRUD_remover14_invoker.call(controllers.FilmeCRUD.remover(id))
   }
}
        

// @LINE:25
case controllers_FilmeCRUD_upload15_route(params) => {
   call { 
        controllers_FilmeCRUD_upload15_invoker.call(controllers.FilmeCRUD.upload())
   }
}
        

// @LINE:26
case controllers_Services_listaFilmesEmJSON16_route(params) => {
   call { 
        controllers_Services_listaFilmesEmJSON16_invoker.call(controllers.Services.listaFilmesEmJSON())
   }
}
        

// @LINE:27
case controllers_Services_listaFilmesEmXML17_route(params) => {
   call { 
        controllers_Services_listaFilmesEmXML17_invoker.call(controllers.Services.listaFilmesEmXML())
   }
}
        

// @LINE:28
case controllers_FilmeCRUD_imagem18_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_FilmeCRUD_imagem18_invoker.call(controllers.FilmeCRUD.imagem(id))
   }
}
        

// @LINE:31
case controllers_Assets_at19_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at19_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     