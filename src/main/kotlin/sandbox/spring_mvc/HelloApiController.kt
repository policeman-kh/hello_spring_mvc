package sandbox.spring_mvc

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class HelloApiController {
    @GetMapping("/hello")
    fun hello(): Response {
        return Response("Hello")
    }

    data class Response(val message: String)
}