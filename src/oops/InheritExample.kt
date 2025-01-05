package oops

open class Samosa{
    var x= 40
    fun displayX(){
        println("X=$x")
    }
}

open class MeethaSamosa:Samosa(){
    var y = 50
    fun displayY() {
        println("Y = $y")
    }
}

class BekarSamosa: MeethaSamosa(){
    var bekarProp = "main to child hoon meethasamosa ka"
}

fun main(){
    val meethaSamosa = MeethaSamosa()
    meethaSamosa.displayX()
    meethaSamosa.displayY()

    val beakarSamosa = BekarSamosa()
    println(beakarSamosa.bekarProp)
    beakarSamosa.displayX()
    beakarSamosa.displayY()
}