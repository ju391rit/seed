// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lin/slay-auth/conf/routes
// @DATE:Thu Jan 21 12:31:17 CET 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
