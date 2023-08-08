import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives.{complete, path}
import akka.http.scaladsl.server.Route
import utils.ActorSupport

object LotteryApp extends ActorSupport{
  def main(args: Array[String]): Unit = {

    val routes: Route = path("test") {
      complete("ok")
    }


    val bindingFuture = Http().bindAndHandle(routes,"localhost", 8080)
    println(s"Server online at http://localhost:8080/")
  }
}
