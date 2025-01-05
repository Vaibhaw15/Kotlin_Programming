fun main(){
//    println("Enter name")
//    val name  = readln()
//    print("Hello, $name")
//    readLine()
//    readlnOrNull()
//    println("Enter number")
//    val number1 = readln().toInt()
//    println("number is ${number1 + 3}")


    //take a number grom user

//    println("Enter a number")
//   val number:Int = readln().toInt()
//    if(number > 0){
//        // True block
//        println("$number is positive")
//    }else{
//        // false block
//        println("$number is negative")
//    }

//    if(number > 0){
//        // True block
//        println("$number is positive")
//    }else if(number < 0){
//        // false block
//        println("$number is negative")
//    }else{
//        println("Number is zero")
//    }


    println("Enter first number")
    val number1:Int = readln().toInt()
    print("Enter Second Number")
    val number2:Int = readln().toInt()

//    if(number1 > number2){
//        println("Number $number1 is max")
//    }else{
//        println("Number $number2 is max")
//    }

    val max = if(number1 > number2){
        number1
    }else{
        number2
    }

    println("Number $max is maximum")


}