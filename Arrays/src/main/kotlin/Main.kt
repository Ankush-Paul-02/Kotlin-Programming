package com.devmare

fun findMax(nums: Array<Int>): Int {
    var max = 0
    for (num in nums) {
        max = maxOf(max, num)
    }
    return max
}

fun main(args: Array<String>) {
    val names: Array<String> = arrayOf(
        "John",
        "Peter",
        "Alice",
    )

    for (name in names) {
        println(name)
    }

    names.sort()
    for (name in names) {
        println(name)
    }

    names[0] = "Ankush"
    for (name in names) {
        println(name)
    }

    val arr = arrayOf(
        1,
        2,
        'C',
        "Ankush"
    )

    for (x in arr) {
        println(x)
    }

    val findMax = findMax(arrayOf(1, 2, 3))
    println(findMax)
}