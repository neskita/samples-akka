lazy val presentation = project in file(".")

name := "presentation"

Common.settings

libraryDependencies ++= Dependencies.presentation

initialCommands := """|import com.esther.common._
                      |import com.esther.presentation._
                      |import com.esther.presentation.backend_
                      |import akka.actor._
                      |import akka.actor.ActorDSL._
                      |import akka.pattern._
                      |import akka.routing._
                      |import akka.util._
                      |import com.typesafe.config._
                      |import scala.concurrent._
                      |import scala.concurrent.duration._""".stripMargin
