import java.awt.Robot
import java.awt.event.KeyEvent

class Edge {

    val robot = Robot()

    fun edge() {
        robot.keyPress(KeyEvent.VK_WINDOWS)
        robot.keyPress(KeyEvent.VK_R)


        robot.keyRelease(KeyEvent.VK_WINDOWS)
        robot.keyRelease(KeyEvent.VK_R)

        Thread.sleep(2000)

        robot.keyPress(KeyEvent.VK_ENTER)
        robot.keyRelease(KeyEvent.VK_ENTER)

        Thread.sleep(3000)


        val frase = "start msedge"

        for (char in frase.toCharArray()) {
            val keycode = KeyEvent.getExtendedKeyCodeForChar(char.toInt())
            robot.keyPress(keycode)
            robot.keyRelease(keycode)
            Thread.sleep(50)
        }

        robot.keyPress(KeyEvent.VK_ENTER)
        robot.keyRelease(KeyEvent.VK_ENTER)


        Thread.sleep(8000)


        val frase2 = "dio entrar"

        for (char in frase2.toCharArray()) {

            val keyCode = KeyEvent.getExtendedKeyCodeForChar(char.toInt())
            robot.keyPress(keyCode)
            robot.keyRelease(keyCode)
            Thread.sleep(50)
        }
        Thread.sleep(2000)


        robot.keyPress(KeyEvent.VK_ENTER)
        robot.keyRelease(KeyEvent.VK_ENTER)

        Thread.sleep(8000)


        val mouseX = 342
        val mouseY = 290

        robot.mouseMove(mouseX, mouseY)
        robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK)
        robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK)



        Thread.sleep(6000)


        robot.keyPress(KeyEvent.VK_CONTROL)
        robot.keyPress(KeyEvent.VK_T)

        robot.keyRelease(KeyEvent.VK_CONTROL)
        robot.keyRelease(KeyEvent.VK_T)

        Thread.sleep(2000)

        val frase3 = "udemy"


        for (char in frase3.toCharArray()) {
            val keyCode = KeyEvent.getExtendedKeyCodeForChar(char.toInt())
            robot.keyPress(keyCode)
            robot.keyRelease(keyCode)
            Thread.sleep(50)

        }
        robot.keyPress(KeyEvent.VK_ENTER)
        robot.keyRelease(KeyEvent.VK_ENTER)

        Thread.sleep(3000)
    }

}