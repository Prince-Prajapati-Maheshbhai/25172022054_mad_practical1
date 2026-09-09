class Matrix(
    private val data: Array<IntArray>,
    private val noOfRow: Int,
    private val noOfCol: Int
) {


    operator fun plus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }


    operator fun minus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }


    operator fun times(other: Matrix): Matrix {

        val result = Array(noOfRow) { IntArray(other.noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until noOfCol) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(result, noOfRow, other.noOfCol)
    }


    override fun toString(): String {

        var output = "(${noOfRow} x ${noOfCol} Matrix):\n"

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                output += "${data[i][j]}\t"
            }
            output += "\n"
        }
        return output
    }
}

fun main() {

    // 3 x 2 Matrix
    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        ),
        3, 2
    )

    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        ),
        3, 2
    )

    println("************* Addition *************")
    println("Matrix 1:")
    println(secondMatrix1)

    println("Matrix 2:")
    println(secondMatrix)

    val add = secondMatrix1 + secondMatrix
    println("Addition:")
    println(add)

    println("************* Subtraction *************")
    println("Matrix 1:")
    println(secondMatrix1)

    println("Matrix 2:")
    println(secondMatrix)

    val sub = secondMatrix1 - secondMatrix
    println("Subtraction:")
    println(sub)

    // 2 x 3 Matrix
    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6)
        ),
        2, 3
    )


    val second = Matrix(
        arrayOf(
            intArrayOf(7, 8),
            intArrayOf(9, 10),
            intArrayOf(11, 12)
        ),
        3, 2
    )

    println("************* Multiplication *************")
    println("Matrix 1:")
    println(firstMatrix)

    println("Matrix 2:")
    println(second)

    val mul = firstMatrix * second
    println("Multiplication:")
    println(mul)
}