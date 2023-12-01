import java.util.Scanner
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val R = scan.nextDouble()
    val pi = 3.14159

    val sphere = (4.0/3) * pi * (R * R * R)
    println("VOLUME = ${"%.3f".format(sphere)}")
}
