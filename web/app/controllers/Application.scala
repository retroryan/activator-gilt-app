package controllers

import play.api.mvc.{Action, Controller}

import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller {
  val client = apidoc.ApiDoc.SampleClient

  def index = Action.async {
    for {
      json <- client.getGuid("abc")
      name = json \ "name"
    } yield Ok(views.html.index(s"Hello ${name}"))
  }
}
