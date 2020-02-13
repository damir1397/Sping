package kg.damir.imagesite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class ImagesiteApplication

fun main(args: Array<String>) {
	runApplication<ImagesiteApplication>(*args)
	val context = ClassPathXmlApplicationContext("applicationContext.xml")

	val musicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
	println(musicPlayer.name)
	println(musicPlayer.phone)

	context.close()

}
