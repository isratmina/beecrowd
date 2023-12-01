import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    var a = read.nextInt()
    var b = read.nextInt()
    var c = read.nextInt()

//    val maiorAB = ((a+b)+((a*b*s)*(a-b)))/2
    var maiorAB = (a + b + Math.abs(a - b)) / 2
    var max = (maiorAB + c + Math.abs(maiorAB - c)) / 2

    println("$max eh o maior")
}
