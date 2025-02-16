package oops

fun calculateArea(shape: Shape){
    //calculate Area
    shape.findArea()
}

fun main(){
    val shape: Shape = Circle()
    calculateArea(shape)
}
open class Shape{
    open fun findArea(){
        println("finding area of shape")
    }
}

 class Circle:Shape(){
    override fun findArea() {
        println("Finding area of circle")
    }
}

class Rectangle : Shape() {
    override fun findArea() {
        println("Finding area of rectangle")
    }
}