package test.build.dtse

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import test.build.dtse.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
