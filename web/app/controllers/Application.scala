package controllers

import play.api.mvc.{Action, Controller}

import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller {
  val client = apidoc.ApiDoc.SampleClient

  def index = Action {
    Ok(views.html.index("Hello Play Framework"))
  }

  def remote = Action.async {
    for {
      json <- client.get("abc")
    } yield Ok(json)
  }
}
