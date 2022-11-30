package programs

import kotlin.math.*

fun hypotinus(){
    println("please type first the g/b variable")
    val g = readln().toDouble()
    println("and then the h variable")
    val h = readln().toDouble()
    val result: Double = hypot(g, h)
    println("the answer is $result")
}
