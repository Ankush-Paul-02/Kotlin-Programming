package com.devmare

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter your alarm time: ")
    val alarm = scanner.nextInt()

    val printAlarm = printAlarm(alarm)
    print(printAlarm)

    val text: String? = null
//    println(text!!.length)

    val text2 = text ?: "Hello World"
    println(text2)
}

fun printAlarm(alarmTime: Int): String {
    return when (alarmTime) {
        12 -> "The alarm time is $alarmTime"
        7 -> "The alarm is $alarmTime"
        24 -> "The alarm is $alarmTime"
        30 -> "The alarm is $alarmTime"
        in 21..23 -> "The alarm is $alarmTime"
        else -> "The alarm time is $alarmTime"
    }
}