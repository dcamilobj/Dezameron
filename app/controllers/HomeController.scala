package controllers

import javax.inject._

import models.Hotel
import models.Hotel.collection
import org.mongodb.scala.{Document, MongoClient, MongoCollection, MongoDatabase, Observer}
import play.api._
import play.api.libs.json.Json
import play.api.mvc._
import models.Helpers._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc)
{

  def test = Action{
    Ok(Json.toJson(collection.find().results()))
  }

  //http://localhost:9000/v1/rooms?arrive_date=hola&leave_date=chao&city=05001&hosts=2&room_type=L
  def search(arrive_date: String, leave_date: String, city:String,
             hosts: Int, room_type:String)  =
    Action{
    Ok("No tengo json para devolver lindo")
  }

  def insert = Action{
    val hotel: Hotel = Hotel(8, "InsertTest4")
    collection.insertOne(hotel).results()
    Ok("Ingresado papo")
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
