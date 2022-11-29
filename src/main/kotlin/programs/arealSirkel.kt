package programs

import kotlin.math.PI

fun arealSirkel(){
    println("please write the r variable")
    val x = readln().toDouble()
    println(PI * (x*x))
}