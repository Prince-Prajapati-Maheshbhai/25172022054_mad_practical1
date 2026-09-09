open class Car(var model:String){
    var price:Double=0.0
    constructor(p: Double,m: String):this(m){price=p}
}
fun main(){
    val c1=Car(12000.0,"BMW M4 comp")
    println("model:${c1.model}")
    println("Prise:${c1.price}")

    val c2=Car(10000.0,"Suzuki")
    println("model:${c2.model}")
    println("Prise:${c2.price}")
}
class Suzuki(m: String):Car(m){
     fun main()
    { 
        val c1=Car(12000.0,"alto")
        println("Model:${c1.model}")
        println("Price:${c1.price}")
        val c2=Suzuki("BMW")
        println("Model:${c2.model}")
        println("Price:${c2.price}")
    }
}
