package utils

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

trait ActorSupport {
  implicit val system = ActorSystem("Bynder-Lottery-App")
  implicit val materializer = ActorMaterializer()
  // needed for the future flatMap/onComplete in the end
  implicit val executionContext = system.dispatcher
}
