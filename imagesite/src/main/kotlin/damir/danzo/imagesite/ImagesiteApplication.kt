package damir.danzo.imagesite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class ImagesiteApplication

fun main(args: Array<String>) {
	runApplication<ImagesiteApplication>(*args)
	val context = ClassPathXmlApplicationContext("applicationContext.xml")

//      Music music = context.getBean("testMusic", Music.class);
//      MusicPlauyer musicPlauyer=new MusicPlauyer(music);

	val musicPlayer = context.getBean("musicBean", MusicPlayer::class.java)
	println(musicPlayer.name)
	println(musicPlayer.phone)

	context.close()
}
