package main.kotlin.io.thelandscape.tfidfserver

/**
 * Created by michael on 7/17/17.
 */
import spark.Spark.*

fun main(args: Array<String>) {
    get("/hello") { req, res -> "Hello World, I'm a Kotlin Server made by Michael!" }
}