package oops

class User{
    var userId:String ="defaultValue"
        get() {
            println("getting value")
            return field
        }
        set(value) {
            println("setting value $value")
            if (value.isEmpty()) {
                field = value
            }
        }

    var userName: String = ""
        set(userName) {
            field = userName
        }
        get() = field

}

fun main(){
    val user1 = User()
    println(user1.userId)
    user1.userId = "aghioahgoa"
}