package controllers

import play.api.mvc.{Action, Controller}

import play.api.libs.json._

object Samples extends Controller {
  def getGuid(guid: String) = Action {
    Ok(Json.toJson(guid))
  }
}
