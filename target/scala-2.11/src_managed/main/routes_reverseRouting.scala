// @SOURCE:/home/haroldo/projetoseclipse/filmes/conf/routes
// @HASH:ca47de636cd53773f05dc1565704f79f90dafd6d
// @DATE:Mon Aug 18 15:04:28 BRT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:31
class ReverseAssets {


// @LINE:31
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:6
class ReverseInicio {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseFilmeCRUD {


// @LINE:22
def alterar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "filme/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:28
def imagem(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "filmeImagem" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:25
def upload(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "filmesUpload")
}
                        

// @LINE:23
def gravar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "filme/")
}
                        

// @LINE:24
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "filme/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
}
                        

// @LINE:20
def novoFilme(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "filme/novo")
}
                        

// @LINE:19
def lista(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "filme")
}
                        

// @LINE:21
def detalhar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "filme/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseDiretorCRUD {


// @LINE:14
def alterar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "diretor/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:12
def novoDiretor(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "diretor/novo")
}
                        

// @LINE:15
def gravar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "diretor/")
}
                        

// @LINE:16
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "diretor/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
}
                        

// @LINE:11
def lista(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "diretor")
}
                        

// @LINE:13
def detalhar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "diretor/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:8
// @LINE:7
class ReverseApplication {


// @LINE:7
def sobre(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "sobre")
}
                        

// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "play")
}
                        

}
                          

// @LINE:27
// @LINE:26
class ReverseServices {


// @LINE:26
def listaFilmesEmJSON(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "filmesJSON")
}
                        

// @LINE:27
def listaFilmesEmXML(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "filmesXML")
}
                        

}
                          
}
                  


// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:31
class ReverseAssets {


// @LINE:31
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseInicio {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Inicio.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseFilmeCRUD {


// @LINE:22
def alterar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.alterar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:28
def imagem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.imagem",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filmeImagem" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:25
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filmesUpload"})
      }
   """
)
                        

// @LINE:23
def gravar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.gravar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/"})
      }
   """
)
                        

// @LINE:24
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.remover",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
      }
   """
)
                        

// @LINE:20
def novoFilme : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.novoFilme",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/novo"})
      }
   """
)
                        

// @LINE:19
def lista : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.lista",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme"})
      }
   """
)
                        

// @LINE:21
def detalhar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FilmeCRUD.detalhar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseDiretorCRUD {


// @LINE:14
def alterar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.alterar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def novoDiretor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.novoDiretor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/novo"})
      }
   """
)
                        

// @LINE:15
def gravar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.gravar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/"})
      }
   """
)
                        

// @LINE:16
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.remover",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
      }
   """
)
                        

// @LINE:11
def lista : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.lista",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor"})
      }
   """
)
                        

// @LINE:13
def detalhar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.detalhar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:8
// @LINE:7
class ReverseApplication {


// @LINE:7
def sobre : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sobre",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sobre"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play"})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:26
class ReverseServices {


// @LINE:26
def listaFilmesEmJSON : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Services.listaFilmesEmJSON",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filmesJSON"})
      }
   """
)
                        

// @LINE:27
def listaFilmesEmXML : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Services.listaFilmesEmXML",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filmesXML"})
      }
   """
)
                        

}
              
}
        


// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:31
class ReverseAssets {


// @LINE:31
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:6
class ReverseInicio {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Inicio.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Inicio", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseFilmeCRUD {


// @LINE:22
def alterar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.alterar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "alterar", Seq(classOf[Long]), "POST", """""", _prefix + """filme/$id<[^/]+>""")
)
                      

// @LINE:28
def imagem(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.imagem(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "imagem", Seq(classOf[Long]), "GET", """""", _prefix + """filmeImagem""")
)
                      

// @LINE:25
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.upload(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "upload", Seq(), "POST", """""", _prefix + """filmesUpload""")
)
                      

// @LINE:23
def gravar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.gravar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "gravar", Seq(), "POST", """""", _prefix + """filme/""")
)
                      

// @LINE:24
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "remover", Seq(classOf[Long]), "POST", """""", _prefix + """filme/$id<[^/]+>/remover""")
)
                      

// @LINE:20
def novoFilme(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.novoFilme(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "novoFilme", Seq(), "GET", """""", _prefix + """filme/novo""")
)
                      

// @LINE:19
def lista(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.lista(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "lista", Seq(), "GET", """ Filmes""", _prefix + """filme""")
)
                      

// @LINE:21
def detalhar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FilmeCRUD.detalhar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FilmeCRUD", "detalhar", Seq(classOf[Long]), "GET", """""", _prefix + """filme/$id<[^/]+>""")
)
                      

}
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseDiretorCRUD {


// @LINE:14
def alterar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.alterar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "alterar", Seq(classOf[Long]), "POST", """""", _prefix + """diretor/$id<[^/]+>""")
)
                      

// @LINE:12
def novoDiretor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.novoDiretor(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "novoDiretor", Seq(), "GET", """""", _prefix + """diretor/novo""")
)
                      

// @LINE:15
def gravar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.gravar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "gravar", Seq(), "POST", """""", _prefix + """diretor/""")
)
                      

// @LINE:16
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "remover", Seq(classOf[Long]), "POST", """""", _prefix + """diretor/$id<[^/]+>/remover""")
)
                      

// @LINE:11
def lista(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.lista(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "lista", Seq(), "GET", """ Diretores""", _prefix + """diretor""")
)
                      

// @LINE:13
def detalhar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.detalhar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiretorCRUD", "detalhar", Seq(classOf[Long]), "GET", """""", _prefix + """diretor/$id<[^/]+>""")
)
                      

}
                          

// @LINE:8
// @LINE:7
class ReverseApplication {


// @LINE:7
def sobre(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sobre(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sobre", Seq(), "GET", """""", _prefix + """sobre""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """play""")
)
                      

}
                          

// @LINE:27
// @LINE:26
class ReverseServices {


// @LINE:26
def listaFilmesEmJSON(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Services.listaFilmesEmJSON(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Services", "listaFilmesEmJSON", Seq(), "GET", """""", _prefix + """filmesJSON""")
)
                      

// @LINE:27
def listaFilmesEmXML(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Services.listaFilmesEmXML(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Services", "listaFilmesEmXML", Seq(), "GET", """""", _prefix + """filmesXML""")
)
                      

}
                          
}
        
    