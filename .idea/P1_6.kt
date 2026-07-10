fun main() {
    print("Enter first number:");
    var number1=readln().toInt();
    print("Enter second number:");
    var number2=readln().toInt();
    println(add(number1,number2));
    println(sub(number1,number2));
    println(mul(number1,number2));
    println(div(number1,number2));
}
fun add(number1: Int, number2: Int): Int {
    return number1 + number2;
}
fun sub(number1: Int, number2: Int): Int {
    return number1 - number2;
}
fun mul(number1: Int, number2: Int): Int {
    return number1 * number2;
}
fun div(number1: Int, number2: Int): Int {
    return number1 / number2;
}