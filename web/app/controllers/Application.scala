package controllers

import play.api.mvc.{Action, Controller}

import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller {

  def index = Action {
    Ok(views.html.index(s"Hello Random Person"))
  }
}
