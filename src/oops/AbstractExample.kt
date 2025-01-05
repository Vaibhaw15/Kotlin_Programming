package oops

abstract class Animal{
    abstract val color:String

    //concrete methode
    fun eat(){
        println("Animal is eating")
    }

    //abstract methode
    abstract  fun speek()
}

class Cat: Animal(){
    override  val color:String = "Black"
    override fun speek(){
        println("Cat is speaking")
    }
}

fun main(){
    val animal : Animal=Cat()
    animal.eat()
    animal.speek()
}