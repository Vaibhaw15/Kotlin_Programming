//WAP to take a number from user and count the digit.

fun countDigit(number: Int):Int{
    var count = 0
    var num = number
    while(num >0){
        val r = num%10
        num /= 10
        count++
    }
    return  count
}


//WAP to take number from user and reverse

fun reverseNumber(number : Int):Int{
    var n:Int = number
    var rev:Int = 0
    while(n > 0){
        var r = n%10
        n /=10
        rev = rev * 10 + r
    }
    return  rev
}

//WAP to take number from user and check prime number
fun checkPrime(number : Int):Boolean{
    var isPrime = true
    for(i in 2..<number){
        if(number%i == 0){
            return false
        }
    }
    return  isPrime
}

fun main(){
//    println("Enter a number")
//    var n= readln().toInt()
//    println(countDigit(n))
//    println("Enter a number")
//    var n= readln().toInt()
//    println(reverseNumber(n))
    println(checkPrime(4))
}