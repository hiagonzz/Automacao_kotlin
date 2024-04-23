import java.awt.MouseInfo

class Position {


    fun getPositionMouse(){
        val mouseInfo = MouseInfo.getPointerInfo()
        val point = mouseInfo.location

        val mouseX = point.x
        val mouseY = point.y

        println("Position X ={${mouseX}} , Position Y = {${mouseY}}"  )
    }
}