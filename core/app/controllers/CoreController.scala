package controllers

import play.api.mvc.{Action, Controller}

object CoreController extends Controller {

  def index = Action {
    Ok("Core index controller")
  }

}