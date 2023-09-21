fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

fun sumSimple(): Int {
    val numbers = mutableListOf<Int>()
    var currentNumber = 1

    while (numbers.size < 5) {
        if (isPrime(currentNumber)) {
            numbers.add(currentNumber)
        }
        currentNumber++
    }
	
    return numbers.sum()
}


fun main(){
    val result = sumSimple()
    println("Сума перших п'яти простих чисел: $result")
}
