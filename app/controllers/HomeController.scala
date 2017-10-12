package controllers

import javax.inject._

import models.Hotel
import org.mongodb.scala.{Document, MongoClient, MongoCollection, MongoDatabase, Observer}
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc)
{

  def test = Action{
    Hotel.findAll
    Ok("Revise la consola papo")
  }
  def insert = Action{
    val hotel: Hotel = Hotel(5, "InsertTest3")
    Hotel.insert(hotel)
    Ok("Ingresado")
  }
  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
