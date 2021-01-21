
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import play.twirl.api.Html
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import views.html.helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Option[models.User],Html,RequestHeader,Messages,AssetsFinder,WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(title: String, user: Option[models.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, assets: AssetsFinder, webJarsUtil: WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/assets/*16.65*/.path(s"images/favicon.png")),format.raw/*16.93*/("""">
        <title>"""),_display_(/*17.17*/title),format.raw/*17.22*/("""</title>
        <link """),_display_(/*18.16*/{CSPNonce.attr}),format.raw/*18.31*/(""" """),format.raw/*18.32*/("""href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link """),_display_(/*19.16*/{CSPNonce.attr}),format.raw/*19.31*/(""" """),format.raw/*19.32*/("""href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        """),_display_(/*20.10*/webJarsUtil/*20.21*/.locate("bootstrap.min.css").css(CSPNonce.attrMap)),format.raw/*20.71*/("""
        """),format.raw/*21.9*/("""<link """),_display_(/*21.16*/{CSPNonce.attr}),format.raw/*21.31*/(""" """),format.raw/*21.32*/("""rel="stylesheet" href=""""),_display_(/*21.56*/assets/*21.62*/.path("styles/main.css")),format.raw/*21.86*/(""""/>
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script """),_display_(/*24.22*/{CSPNonce.attr}),format.raw/*24.37*/(""" """),format.raw/*24.38*/("""src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script """),_display_(/*25.22*/{CSPNonce.attr}),format.raw/*25.37*/(""" """),format.raw/*25.38*/("""src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*34.48*/controllers/*34.59*/.routes.ApplicationController.index),format.raw/*34.94*/("""">Silhouette Seed Template</a>

                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-item nav-link" href=""""),_display_(/*38.61*/controllers/*38.72*/.routes.ApplicationController.index),format.raw/*38.107*/("""">"""),_display_(/*38.110*/messages("home")),format.raw/*38.126*/("""</a>
                        <a class="nav-item nav-link" href="https://github.com/mohiva/play-silhouette-seed">GitHub</a>
                    </div>
                </div>

                <div class="collapse navbar-collapse" id="navbarNavAltMarkup2">
                    <div class="navbar-nav">
                        """),_display_(/*45.26*/user/*45.30*/.map/*45.34*/ { u =>_display_(Seq[Any](format.raw/*45.41*/("""
                        """),format.raw/*46.25*/("""<a class="nav-link" href=""""),_display_(/*46.52*/controllers/*46.63*/.routes.ApplicationController.index),format.raw/*46.98*/("""">"""),_display_(/*46.101*/u/*46.102*/.name),format.raw/*46.107*/("""</a>
                        """),_display_(/*47.26*/if(u.loginInfo.providerID == com.mohiva.play.silhouette.impl.providers.CredentialsProvider.ID)/*47.120*/ {_display_(Seq[Any](format.raw/*47.122*/("""
                        """),format.raw/*48.25*/("""<a class="nav-item nav-link" href=""""),_display_(/*48.61*/controllers/*48.72*/.routes.ChangePasswordController.view),format.raw/*48.109*/("""">"""),_display_(/*48.112*/messages("change.password")),format.raw/*48.139*/("""</a>
                        """)))}),format.raw/*49.26*/("""
                        """),format.raw/*50.25*/("""<a class="nav-item nav-link" href=""""),_display_(/*50.61*/controllers/*50.72*/.routes.ApplicationController.signOut),format.raw/*50.109*/("""">"""),_display_(/*50.112*/messages("sign.out")),format.raw/*50.132*/("""</a>
                        """)))}/*51.26*/.getOrElse/*51.36*/ {_display_(Seq[Any](format.raw/*51.38*/("""
                        """),format.raw/*52.25*/("""<a class="nav-item nav-link" href=""""),_display_(/*52.61*/controllers/*52.72*/.routes.SignInController.view),format.raw/*52.101*/("""">"""),_display_(/*52.104*/messages("sign.in")),format.raw/*52.123*/("""</a>
                        <a class="nav-item nav-link" href=""""),_display_(/*53.61*/controllers/*53.72*/.routes.SignUpController.view),format.raw/*53.101*/("""">"""),_display_(/*53.104*/messages("sign.up")),format.raw/*53.123*/("""</a>
                        """)))}),format.raw/*54.26*/("""
                    """),format.raw/*55.21*/("""</div>
                </div>

            </nav>
        </header>
        <main class="container">
            <div class="starter-template row">
                """),_display_(/*62.18*/request/*62.25*/.flash.get("error").map/*62.48*/ { msg =>_display_(Seq[Any](format.raw/*62.57*/("""
                    """),format.raw/*63.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*65.34*/messages("error")),format.raw/*65.51*/("""</strong> """),_display_(/*65.62*/msg),format.raw/*65.65*/("""
                    """),format.raw/*66.21*/("""</div>
                """)))}),format.raw/*67.18*/("""
                """),_display_(/*68.18*/request/*68.25*/.flash.get("info").map/*68.47*/ { msg =>_display_(Seq[Any](format.raw/*68.56*/("""
                    """),format.raw/*69.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*71.34*/messages("info")),format.raw/*71.50*/("""</strong> """),_display_(/*71.61*/msg),format.raw/*71.64*/("""
                    """),format.raw/*72.21*/("""</div>
                """)))}),format.raw/*73.18*/("""
                """),_display_(/*74.18*/request/*74.25*/.flash.get("success").map/*74.50*/ { msg =>_display_(Seq[Any](format.raw/*74.59*/("""
                    """),format.raw/*75.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*77.34*/messages("success")),format.raw/*77.53*/("""</strong> """),_display_(/*77.64*/msg),format.raw/*77.67*/("""
                    """),format.raw/*78.21*/("""</div>
                """)))}),format.raw/*79.18*/("""
                """),_display_(/*80.18*/content),format.raw/*80.25*/("""
            """),format.raw/*81.13*/("""</div>
        </main>
        """),_display_(/*83.10*/webJarsUtil/*83.21*/.locate("jquery.min.js").script(CSPNonce.attrMap)),format.raw/*83.70*/("""
        """),_display_(/*84.10*/webJarsUtil/*84.21*/.locate("bootstrap.min.js").script(CSPNonce.attrMap)),format.raw/*84.73*/("""
        """),format.raw/*85.9*/("""<script """),_display_(/*85.18*/{CSPNonce.attr}),format.raw/*85.33*/(""" """),format.raw/*85.34*/("""src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script """),_display_(/*86.18*/{CSPNonce.attr}),format.raw/*86.33*/(""" """),format.raw/*86.34*/("""src=""""),_display_(/*86.40*/assets/*86.46*/.path("javascripts/zxcvbnShim.js")),format.raw/*86.80*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:Option[models.User],content:Html,request:RequestHeader,messages:Messages,assets:AssetsFinder,webJarsUtil:WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def f:((String,Option[models.User]) => (Html) => (RequestHeader,Messages,AssetsFinder,WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => (request,messages,assets,webJarsUtil) => apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-21T12:56:13.791491
                  SOURCE: /home/lin/slay-auth/app/views/main.scala.html
                  HASH: 54003ade8ec199604b6ea4f1cf8e560d320d31d3
                  MATRIX: 28->1|65->32|106->67|140->95|183->132|222->165|625->194|884->360|912->361|1211->633|1226->639|1275->667|1321->686|1347->691|1398->715|1434->730|1463->731|1612->853|1648->868|1677->869|1807->972|1827->983|1898->1033|1934->1042|1968->1049|2004->1064|2033->1065|2084->1089|2099->1095|2144->1119|2321->1269|2357->1284|2386->1285|2507->1379|2543->1394|2572->1395|3152->1948|3172->1959|3228->1994|3471->2210|3491->2221|3548->2256|3579->2259|3617->2275|3968->2599|3981->2603|3994->2607|4039->2614|4092->2639|4146->2666|4166->2677|4222->2712|4253->2715|4264->2716|4291->2721|4348->2751|4452->2845|4493->2847|4546->2872|4609->2908|4629->2919|4688->2956|4719->2959|4768->2986|4829->3016|4882->3041|4945->3077|4965->3088|5024->3125|5055->3128|5097->3148|5146->3178|5165->3188|5205->3190|5258->3215|5321->3251|5341->3262|5392->3291|5423->3294|5464->3313|5556->3378|5576->3389|5627->3418|5658->3421|5699->3440|5760->3470|5809->3491|6001->3656|6017->3663|6049->3686|6096->3695|6145->3716|6346->3890|6384->3907|6422->3918|6446->3921|6495->3942|6550->3966|6595->3984|6611->3991|6642->4013|6689->4022|6738->4043|6937->4215|6974->4231|7012->4242|7036->4245|7085->4266|7140->4290|7185->4308|7201->4315|7235->4340|7282->4349|7331->4370|7533->4545|7573->4564|7611->4575|7635->4578|7684->4599|7739->4623|7784->4641|7812->4648|7853->4661|7912->4693|7932->4704|8002->4753|8039->4763|8059->4774|8132->4826|8168->4835|8204->4844|8240->4859|8269->4860|8391->4955|8427->4970|8456->4971|8489->4977|8504->4983|8559->5017
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|19->9|20->10|26->16|26->16|26->16|27->17|27->17|28->18|28->18|28->18|29->19|29->19|29->19|30->20|30->20|30->20|31->21|31->21|31->21|31->21|31->21|31->21|31->21|34->24|34->24|34->24|35->25|35->25|35->25|44->34|44->34|44->34|48->38|48->38|48->38|48->38|48->38|55->45|55->45|55->45|55->45|56->46|56->46|56->46|56->46|56->46|56->46|56->46|57->47|57->47|57->47|58->48|58->48|58->48|58->48|58->48|58->48|59->49|60->50|60->50|60->50|60->50|60->50|60->50|61->51|61->51|61->51|62->52|62->52|62->52|62->52|62->52|62->52|63->53|63->53|63->53|63->53|63->53|64->54|65->55|72->62|72->62|72->62|72->62|73->63|75->65|75->65|75->65|75->65|76->66|77->67|78->68|78->68|78->68|78->68|79->69|81->71|81->71|81->71|81->71|82->72|83->73|84->74|84->74|84->74|84->74|85->75|87->77|87->77|87->77|87->77|88->78|89->79|90->80|90->80|91->81|93->83|93->83|93->83|94->84|94->84|94->84|95->85|95->85|95->85|95->85|96->86|96->86|96->86|96->86|96->86|96->86
                  -- GENERATED --
              */
          