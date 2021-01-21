// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Rudi/Documents/STUDIUM/5.Semester/WT/seed/conf/routes
// @DATE:Thu Jan 21 11:52:15 CET 2021


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
