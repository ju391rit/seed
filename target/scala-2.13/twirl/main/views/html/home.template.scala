
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import org.webjars.play.WebJarsUtil
/*4.2*/import controllers.AssetsFinder
/*5.2*/import play.api.data._
/*6.2*/import forms.TotpSetupForm.Data
/*7.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpCredentials
/*8.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo

/**/
class home @javax.inject.Inject() /*10.6*/()(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(user: models.User, totpInfoOpt: Option[GoogleTotpInfo], totpDataOpt: Option[(Form[Data], GoogleTotpCredentials)] = None)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*13.2*/implicitFieldConstructor/*13.26*/ = {{
    b4.vertical.fieldConstructor()
}};
Seq[Any](format.raw/*11.176*/("""

"""),format.raw/*15.2*/("""

"""),_display_(/*17.2*/main(messages("home.title"), Some(user))/*17.42*/ {_display_(Seq[Any](format.raw/*17.44*/("""
    """),format.raw/*18.5*/("""<div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12" />
            <h4 class="col-md-8">"""),_display_(/*21.35*/messages("welcome.signed.in")),format.raw/*21.64*/("""</h4>
            <div class="col-md-4 text-right">
                <img src=""""),_display_(/*23.28*/user/*23.32*/.avatarURL.getOrElse(assets.path("images/silhouette.png"))),format.raw/*23.90*/("""" height="40px" />
            </div>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*30.50*/messages("first.name")),format.raw/*30.72*/("""
                        """),format.raw/*31.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*31.60*/user/*31.64*/.firstName.getOrElse("None")),format.raw/*31.92*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*34.50*/messages("last.name")),format.raw/*34.71*/("""
                        """),format.raw/*35.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*35.60*/user/*35.64*/.lastName.getOrElse("None")),format.raw/*35.91*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*38.50*/messages("full.name")),format.raw/*38.71*/("""
                        """),format.raw/*39.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*39.60*/user/*39.64*/.fullName.getOrElse("None")),format.raw/*39.91*/("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""),_display_(/*42.50*/messages("email")),format.raw/*42.67*/("""
                        """),format.raw/*43.25*/(""":</strong></p><p class="col-md-6">"""),_display_(/*43.60*/user/*43.64*/.email.getOrElse("None")),format.raw/*43.88*/("""</p>
                </div>
                <div class="row">
                    <button type="button" class="btn btn-primary"><a href="http://localhost:8080" style="color: green">Let's Play Slay!</a></button>
                </div>
            </div>
        </div>
        <div class="row data">
        """),_display_(/*51.10*/if(totpInfoOpt.nonEmpty)/*51.34*/ {_display_(Seq[Any](format.raw/*51.36*/("""
            """),format.raw/*52.13*/("""<h2>"""),_display_(/*52.18*/messages("totp.enabled.title")),format.raw/*52.48*/("""</h2>
            <a href=""""),_display_(/*53.23*/controllers/*53.34*/.routes.TotpController.disableTotp),format.raw/*53.68*/("""">
                <input type="button" class="btn btn-primary" value='"""),_display_(/*54.70*/messages("totp.disable")),format.raw/*54.94*/("""'/>
            </a>
        """)))}/*56.11*/else/*56.16*/{_display_(Seq[Any](format.raw/*56.17*/("""
            """),_display_(/*57.14*/totpDataOpt/*57.25*/ match/*57.31*/ {/*58.17*/case Some((totpForm, credentials)) =>/*58.54*/ {_display_(Seq[Any](format.raw/*58.56*/("""
                    """),format.raw/*59.21*/("""<h2>"""),_display_(/*59.26*/messages("totp.enabling.title")),format.raw/*59.57*/("""</h2>
                    <h2>"""),_display_(/*60.26*/messages("totp.shared.key.title")),format.raw/*60.59*/("""</h2>
                    <img src=""""),_display_(/*61.32*/credentials/*61.43*/.qrUrl),format.raw/*61.49*/(""""/>
                    <h2>"""),_display_(/*62.26*/messages("totp.recovery.tokens.title")),format.raw/*62.64*/("""</h2>
                    <ul>
                    """),_display_(/*64.22*/for(scratchCodePlain <- credentials.scratchCodesPlain) yield /*64.76*/ {_display_(Seq[Any](format.raw/*64.78*/("""
                        """),format.raw/*65.25*/("""<li>"""),_display_(/*65.30*/{
                            scratchCodePlain
                        }),format.raw/*67.26*/("""</li>
                    """)))}),format.raw/*68.22*/("""
                    """),format.raw/*69.21*/("""</ul>
                    """),_display_(/*70.22*/helper/*70.28*/.form(action = controllers.routes.TotpController.enableTotpSubmit())/*70.96*/ {_display_(Seq[Any](format.raw/*70.98*/("""
                        """),_display_(/*71.26*/helper/*71.32*/.CSRF.formField),format.raw/*71.47*/("""
                        """),_display_(/*72.26*/b4/*72.28*/.text(totpForm("verificationCode"), Symbol("_hiddenLabel") -> messages("totp.verification.code    "), Symbol("placeholder") -> messages("totp.verification.code"), Symbol("autocomplete") -> "off", Symbol("class") -> "form-control input-lg")),format.raw/*72.267*/("""
                        """),_display_(/*73.26*/b4/*73.28*/.hidden(totpForm("sharedKey"))),format.raw/*73.58*/("""
                        """),_display_(/*74.26*/helper/*74.32*/.repeat(totpForm("scratchCodes"), min = 1)/*74.74*/ { scratchCodeField =>_display_(Seq[Any](format.raw/*74.96*/("""
                            """),_display_(/*75.30*/b4/*75.32*/.hidden(scratchCodeField("hasher"))),format.raw/*75.67*/("""
                            """),_display_(/*76.30*/b4/*76.32*/.hidden(scratchCodeField("password"))),format.raw/*76.69*/("""
                            """),_display_(/*77.30*/b4/*77.32*/.hidden(scratchCodeField("salt"))),format.raw/*77.65*/("""
                        """)))}),format.raw/*78.26*/("""
                        """),format.raw/*79.25*/("""<div class="form-group">
                            <div>
                                <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*81.124*/messages("totp.verify")),format.raw/*81.147*/("""</button>
                            </div>
                        </div>
                    """)))}),format.raw/*84.22*/("""
                """)))}/*86.17*/case None =>/*86.29*/ {_display_(Seq[Any](format.raw/*86.31*/("""
                    """),format.raw/*87.21*/("""<h2>"""),_display_(/*87.26*/messages("totp.disabled.title")),format.raw/*87.57*/("""</h2>
                    <a href=""""),_display_(/*88.31*/controllers/*88.42*/.routes.TotpController.enableTotp),format.raw/*88.75*/("""">
                        <input type="button" class="btn btn-primary" value='"""),_display_(/*89.78*/messages("totp.enable")),format.raw/*89.101*/("""'/>
                    </a>
                """)))}}),format.raw/*92.14*/("""
        """)))}),format.raw/*93.10*/("""
        """),format.raw/*94.9*/("""</div>
    </div>
""")))}),format.raw/*96.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,totpInfoOpt:Option[GoogleTotpInfo],totpDataOpt:Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,totpInfoOpt,totpDataOpt)(request,messages)

  def f:((models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,totpInfoOpt,totpDataOpt) => (request,messages) => apply(user,totpInfoOpt,totpDataOpt)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-21T11:52:16.291628100
                  SOURCE: C:/Users/Rudi/Documents/STUDIUM/5.Semester/WT/seed/app/views/home.scala.html
                  HASH: a4722f114c0d7ce579217360b9103542595d5c6d
                  MATRIX: 28->1|65->33|106->69|149->107|188->141|218->166|257->200|335->273|447->345|905->407|1167->586|1200->610|1276->581|1307->654|1338->659|1387->699|1427->701|1460->707|1631->851|1681->880|1789->961|1802->965|1881->1023|2155->1270|2198->1292|2252->1318|2314->1353|2327->1357|2376->1385|2517->1499|2559->1520|2613->1546|2675->1581|2688->1585|2736->1612|2877->1726|2919->1747|2973->1773|3035->1808|3048->1812|3096->1839|3237->1953|3275->1970|3329->1996|3391->2031|3404->2035|3449->2059|3792->2375|3825->2399|3865->2401|3907->2415|3939->2420|3990->2450|4046->2479|4066->2490|4121->2524|4221->2597|4266->2621|4317->2654|4330->2659|4369->2660|4411->2675|4431->2686|4446->2692|4457->2712|4503->2749|4543->2751|4593->2773|4625->2778|4677->2809|4736->2841|4790->2874|4855->2912|4875->2923|4902->2929|4959->2959|5018->2997|5099->3051|5169->3105|5209->3107|5263->3133|5295->3138|5390->3212|5449->3240|5499->3262|5554->3290|5569->3296|5646->3364|5686->3366|5740->3393|5755->3399|5791->3414|5845->3441|5856->3443|6117->3682|6171->3709|6182->3711|6233->3741|6287->3768|6302->3774|6353->3816|6413->3838|6471->3869|6482->3871|6538->3906|6596->3937|6607->3939|6665->3976|6723->4007|6734->4009|6788->4042|6846->4069|6900->4095|7112->4279|7157->4302|7288->4402|7326->4439|7347->4451|7387->4453|7437->4475|7469->4480|7521->4511|7585->4548|7605->4559|7659->4592|7767->4673|7812->4696|7892->4759|7934->4770|7971->4780|8022->4801
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|14->10|17->11|21->13|21->13|24->11|26->15|28->17|28->17|28->17|29->18|32->21|32->21|34->23|34->23|34->23|41->30|41->30|42->31|42->31|42->31|42->31|45->34|45->34|46->35|46->35|46->35|46->35|49->38|49->38|50->39|50->39|50->39|50->39|53->42|53->42|54->43|54->43|54->43|54->43|62->51|62->51|62->51|63->52|63->52|63->52|64->53|64->53|64->53|65->54|65->54|67->56|67->56|67->56|68->57|68->57|68->57|68->58|68->58|68->58|69->59|69->59|69->59|70->60|70->60|71->61|71->61|71->61|72->62|72->62|74->64|74->64|74->64|75->65|75->65|77->67|78->68|79->69|80->70|80->70|80->70|80->70|81->71|81->71|81->71|82->72|82->72|82->72|83->73|83->73|83->73|84->74|84->74|84->74|84->74|85->75|85->75|85->75|86->76|86->76|86->76|87->77|87->77|87->77|88->78|89->79|91->81|91->81|94->84|95->86|95->86|95->86|96->87|96->87|96->87|97->88|97->88|97->88|98->89|98->89|100->92|101->93|102->94|104->96
                  -- GENERATED --
              */
          