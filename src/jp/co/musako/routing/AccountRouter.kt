package jp.co.musako.routing

import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.thymeleaf.ThymeleafContent

fun Route.accountRouter() {

    // Register the available routes "/account" here
    route("/account") {
        get {
            call.respondText { "account routing success" }
        }
    }

    route("/sample") {
        get {
            call.respond(ThymeleafContent("sample", mapOf("text" to "contents")))
        }
    }
}