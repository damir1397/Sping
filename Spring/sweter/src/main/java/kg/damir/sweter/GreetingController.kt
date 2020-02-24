package kg.damir.sweter

import sun.security.x509.OIDMap.addAttribute


@Controller
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(@RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: Model): String {
        model.addAttribute("name", name)
        return "greeting"
    }

}