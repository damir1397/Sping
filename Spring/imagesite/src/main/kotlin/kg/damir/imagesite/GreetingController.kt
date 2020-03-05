package kg.damir.imagesite

import kg.damir.imagesite.domain.Message
import kg.damir.imagesite.repos.MessageRepo
import org.hibernate.mapping.Collection
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.*

@Controller
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(@RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: MutableMap<String, String>): String {
        model["name"] = name
        return "greeting"
    }
private lateinit var messageRepo: MessageRepo
    @GetMapping
    fun index(model: MutableMap<String, String>): String {
        var message:Iterable<Message> = messageRepo.findAll()
        model["damir"] = "hello"
        return "index"
    }
    @PostMapping
    fun add(@RequestParam text:String,@RequestParam tag:String,model:MutableMap<String,MutableIterable<Message>>):String{
        val messageConstructor =Message(text,tag)
        messageRepo.save(messageConstructor)
        val messages:MutableIterable<Message> = messageRepo.findAll()
        model["messages"] = messages
        return "index"
    }
}