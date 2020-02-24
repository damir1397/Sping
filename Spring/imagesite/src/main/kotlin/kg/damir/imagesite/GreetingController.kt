package kg.damir.imagesite

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(@RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: MutableMap<String, String>): String {
        model["name"] = name
        return "greeting"
    }

    @GetMapping
    fun index(model: MutableMap<String, String>): String {
        model["damir"] = "hello"
        return "index"
    }
}