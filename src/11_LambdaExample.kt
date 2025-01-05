fun main(){
    val square = {x:Int -> x*x}
    val addition = {x:Int,y:Int -> x +y}

    val myVar = {
        println("Hi i am Lembda")
        print("sum of a and b is ${245 + 25}")
    }
    myVar()
    println(square(3))
    println("Addidtion using lambda function ${addition(4,6).toString()}")
}