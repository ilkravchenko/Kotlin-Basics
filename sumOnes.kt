fun sumOnes(n: Int = 5): Int {
    var currentNumber = 1
    var sum = 0

    for (i in 1..n) {
        sum += currentNumber
        currentNumber = currentNumber * 10 + 1
    }

    return sum
}

fun main(){
    println(sumOnes())
}
