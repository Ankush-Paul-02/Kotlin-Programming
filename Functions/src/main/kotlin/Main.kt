package com.devmare

fun add(
    x: Int,
    y: Int
): Int = x + y

fun printSum(x: Int, y: Int) {
    println("sum of $x and $y is ${x + y}")
}

fun info(
    name: String,
    skill: String,
    experience: Int
): String {
    return "$name - $skill - $experience"
}

fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    }
    return n * factorial(n - 1)
}

fun employee(
    id: Int,
    uuid: String = "emp" // default
): String {
    return "$id - $uuid"
}

fun main() {
    println(add(2, 3))
    printSum(2, 3)

    println(factorial(5))

    println(info("Ankush", "Java", 2))

    println(employee(1, "emp-xxx"))
}