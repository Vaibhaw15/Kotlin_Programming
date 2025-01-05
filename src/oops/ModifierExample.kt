package oops

class ModifierExample{
    private var userName:String = "vdfvdf"
    private fun display(){
        println(userName)
    }
    fun display2() {
    println(userName)
        display()
    }
}
fun main() {
    val example=ModifierExample()
    example.display2()

}