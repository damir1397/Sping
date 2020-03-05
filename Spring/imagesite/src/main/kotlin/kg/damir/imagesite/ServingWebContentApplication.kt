package kg.damir.imagesite

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
private open class ServingWebContentApplication
    fun main(args: Array<String>) {
        SpringApplication.run(ServingWebContentApplication::class.java, *args)
    }
