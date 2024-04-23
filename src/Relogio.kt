import java.awt.Robot
import java.awt.event.KeyEvent

class Relogio {

    val robot = Robot()

    fun relogio(){
        robot.keyPress(KeyEvent.VK_WINDOWS)
        robot.keyRelease(KeyEvent.VK_WINDOWS)

        Thread.sleep(2000)

        val frase = "relogio"

        for(char in frase.toCharArray()){
            val keyCode = KeyEvent.getExtendedKeyCodeForChar(char.toInt())
            robot.keyPress(keyCode)
            robot.keyRelease(keyCode)
            Thread.sleep(50)
        }
        Thread.sleep(5000)

        robot.keyPress(KeyEvent.VK_ENTER)
        robot.keyRelease(KeyEvent.VK_ENTER)

        Thread.sleep(5000)

    }
}