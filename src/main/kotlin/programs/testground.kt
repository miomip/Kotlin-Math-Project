package programs

fun test(){
    var t = 1.0
    var i = t/4
    var k = i*6
    var p = k+3
    while (t < p){
        t -= 1
        i = t/4
        k = i*6
        p = k+3
        println("t:$t, i:$i, k:$k, p:$p")
    }
}