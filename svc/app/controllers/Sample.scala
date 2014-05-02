package controllers

import play.api.mvc.{Action, Controller}

import play.api.libs.json._
import apidoc.ApiDoc.JsonFormats._

object Sample extends Controller {
  def get(guid: String) = Action {
    val sampleObj = apidoc.ApiDoc.Sample(guid, "testing")
    Ok(Json.toJson(sampleObj))
  }
}
