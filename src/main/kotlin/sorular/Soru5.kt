package sorular

import kotlin.math.sqrt

class Soru5 {

    fun isPrime(number: Int): Boolean {
        println("Soru 5")
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
}