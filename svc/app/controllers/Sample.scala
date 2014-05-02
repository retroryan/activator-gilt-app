package controllers

import play.api.mvc.{Action, Controller}
import java.util.UUID

object Sample extends Controller {
  case class Sample(guid: String, name: String)

  val sampleObj = Sample(UUID.randomUUID().toString, "testing 1 2 3...")

  def get = Action {
    Ok(sampleObj)
  }
}
