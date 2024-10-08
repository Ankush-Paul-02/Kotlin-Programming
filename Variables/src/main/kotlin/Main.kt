package com.devmare

fun main() {

    var name: String = "Ankush"
    name = "Paul"

    val age: Int = 22
    // age = 24  // 'val' cannot be reassigned.

    println("Hello $name, $age")

    val maxIntegerValue: Int = Int.MAX_VALUE
    println(maxIntegerValue)

    val maxLongValue: Long = Long.MAX_VALUE
    println(maxLongValue)
    val maxDoubleValue: Double = Double.MAX_VALUE
    println(maxDoubleValue)
}