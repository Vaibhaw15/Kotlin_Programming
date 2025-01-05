fun main(){
    println("Enter marks: ")
    val marks = readln().toInt()

//    if(marks <= 100 && marks >= 91){
//        println("Grade A")
//    }else if(marks <= 90 && marks >= 81){
//        println("Grade B")
//    }else if(marks <= 80 && marks >= 71){
//        println("Grade c")
//    }else{
//        println("Fail")
//    }

//   val grade:Char = if(marks in 91..100){
//        'A'
//    }else if(marks in 81..90){
//        'B'
//    }else if(marks in 71..80){
//      'C'
//    }else{
//        'F'
//    }
//

    val grade:Char = when(marks)
    {
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> {
            println("testing")
            'C'
        }
        else -> 'F'
    }
   print(grade)


}