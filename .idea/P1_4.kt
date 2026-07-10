fun main(){
    print("Enter number:")
    val number=readln().toInt();

    println(
        if (number%2== 0)
            "Even"
        else
            "Odd"
    )

}