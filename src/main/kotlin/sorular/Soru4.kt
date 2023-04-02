package sorular

import kotlin.math.sqrt

class Soru4 {


    fun isPrime(number: Int): Boolean {
        if (number <= 1) {
            return false
        }
        for (i in 2..sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }
    fun getSumOfAllPrimes(n: Int): Int {
        println("Soru 4")
        var sum = 0
        for (i in 2..n) {
            if (isPrime(i)) {
                sum += i
            }
        }
        println(sum)
        return sum
    }
}