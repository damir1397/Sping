package kg.damir.imagesite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class ImagesiteApplication

fun main(args: Array<String>) {
	runApplication<ImagesiteApplication>(*args)
	val context = ClassPathXmlApplicationContext("applicationContext.xml")

	val musicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)//находим id из applicationContext.xml
	println(musicPlayer.name)
	println(musicPlayer.phone)
	musicPlayer.listMusic?.forEach{
		println(it.song())
	} //вывел список Music  который добавил конструкторе в applicationContext.xml

	context.close()

}
