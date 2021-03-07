import kotlin.math.sqrt
import kotlin.test.todo


fun quantZTest() {
    println("Enter population mean: ")
    var mu = readLine()!!
    println("Enter population standard deviation: ")
    var sigma = readLine()!!
    println("Enter sample mean: ")
    var smean = readLine()!!
    println("Enter sample size: ")
    var n = readLine()!!

    var zScore = (smean.toDouble() - mu.toDouble()) / (sigma.toDouble() * sqrt(n.toDouble()))

    println("Z-score: " + zScore)
}

fun oneProp() {
    println("Enter population proportion: ")
    var p = readLine()!!
    println("Enter sample proportion: ")
    var phat = readLine()!!
    println("Enter sample size: ")
    var n = readLine()!!

    var zScore = (phat.toDouble() - p.toDouble() / sqrt((p.toDouble() * (1.0 - p.toDouble())) / n.toDouble()))

    println("Z-score: " + zScore)
}

fun twoProp() {
    println("Enter first sample proportion: ")
    val phat1 = readLine()!!
    println("Enter first sample size: ")
    val n1 = readLine()!!
    println("Enter second sample proportion: ")
    val phat2 = readLine()!!
    println("Enter second sample size: ")
    val n2 = readLine()!!

    val x1 = phat1.toDouble() * n1.toDouble()
    val x2 = phat2.toDouble() * n2.toDouble()
    val phat = (x1 + x2) / (n1.toDouble() + n2.toDouble())

    val zScore = (phat1.toDouble() - phat2.toDouble()) / sqrt((phat * (1.0 - phat)) * ( 1.0 / n1.toDouble() + 1.0 / n2.toDouble()))

    println("Z-score: " + zScore)
}

// decides which z test to run
fun zTestDirector() {
    println("For quantitative enter 1, for categorical enter 2: ")
    var type = readLine()
    if (type == "1") {
        quantZTest()
    } else {
        println("For one proportion enter 1, for two proportions enter 2: ")
        var prop = readLine()
        if (prop == "1") {
            oneProp()
        } else {
            twoProp()
        }
    }

}

fun oneTTest() {
    println("Enter population mean: ")
    val mu = readLine()!!
    println("Enter sample mean: ")
    val smean = readLine()!!
    println("Enter sample size: ")
    val n = readLine()!!
    println("Enter sample standard deviation: ")
    val s = readLine()!!

    val tScore = (smean.toDouble() - mu.toDouble()) / (s.toDouble() / sqrt(n.toDouble()))

    println("T-score: " + tScore)
}

fun pairedTest() {

}

fun independentTest() {

}

// decides which t test to run
fun tTestDirector() {
    println("For one sample enter 1, for two samples enter 2: ")
    var sample = readLine()
    if (sample == "1") {
        oneTTest()
    } else if (false) {
        println("For a paired test enter 1, for an independent test enter 2: ")
        var type = readLine()
        if (type == "1") {
            pairedTest()
        } else {
            independentTest()
        }
    }
}



fun main() {
    println("Welcome!")
    var num: String?
    do {
        println("\nWhich test would you like to run?")
        println("1) Z-test")
        println("2) T-test")
        println("3) Quit")
        println("Please enter a number: ")
        num = readLine()


        when(num) {
            "1" -> zTestDirector()
            "2" -> tTestDirector()
            "3" -> println("Goodbye!")
            else -> {
                println("Something went wrong.")
            }
        }
    } while(num != "3")


}




