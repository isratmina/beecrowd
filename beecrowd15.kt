import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var X = scan.nextInt()
    val Y = scan.nextDouble()

    var consumption = X / Y
    println("${"%.3f".format(consumption)} km/l")
}

