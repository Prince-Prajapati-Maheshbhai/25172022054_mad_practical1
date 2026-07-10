fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    var factorial = 1L

    if (number < 0) {
        println("Factorial is not defined for negative numbers.")
    } else {
        for (i in 1..number) {
            factorial *= i
        }
        println("Factorial of $number is $factorial")
    }
}