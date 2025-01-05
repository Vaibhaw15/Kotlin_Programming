class User(
    val name:String,
    val phone:String,
    val address:String
){
    fun ramu(){
        println(name)
        println(phone)
        println(address)
    }
}

fun main(){

    //All No primitive Data Types/Reference Data Type/User Defined Data Type -- means all are Object
    val number1: Int = 34
    val number2 = 32
    val number3: Byte = 12
    val number4 :Short = 56
    val number5: Long = 34567777
    val marks:Float = 32.54F
    val marksInComputer:Double = 1232.46
    val ch:Char = 'A'
    val isActive:Boolean = false
    val userName:String = "My Name is Vaibhaw"
    val message:String = "I love kotlin"

    val favActivity:Array<String> = arrayOf("cricket","music","programming")
    println(favActivity[2])
    println(favActivity[1])

    favActivity[2] = "Listen Music"
    println(favActivity[2])
    println("number 1 is $number1")


    val user1:User = User(name = "Durgesh", phone = "4645754", address = "Kolkata")
    user1.ramu()
}

