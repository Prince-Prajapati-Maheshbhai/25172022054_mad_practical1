fun main() {
    println("Array using arrayOf")
    val a1=arrayOf('A','B','C','D')
    println(a1.joinToString())
    println("Array using array<> and lembda function whithout perameter")
    val a2=Array<Int>(5){0}
    println(a2.joinToString())
    println("Array using array<> and lembda function with perameter")
    val a3=Array<Int>(5){i->i*i}
    println(a3.joinToString())
    println("Nested Array - towDarray")
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())
    println("Nested Array - threeDarray")
    val threeDArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(threeDArray.contentDeepToString())
    println("Array using IntArray")
    val a4= IntArray(5){0}
    println(a4.joinToString())
    println("Array using IntArrayof")
    val a5 = intArrayOf(5)
    println(a5.joinToString())
    println("enter the Array:")
    val arr = readln().toInt()
    val a6= arr.toInt()
    println(a6.toString())
}