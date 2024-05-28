package src

import java.util.Scanner

const val BOT_NAME = "Karn"
const val BIRTH_YEAR = "2024"
const val ADULT_AGE_MINIMUM = 18
const val ADULT_AGE_MAXIMUM = 64
const val ZERO = 0

fun main() {
    // Create a Scanner object to read user input
    val scanner = Scanner(System.`in`)

    // Bot greeting
    println("Hello! My name is $BOT_NAME.")
    println("I was created in $BIRTH_YEAR.")

    val adultMessage = "You are an adult"
    val minorMessage = "You are a minor"
    val seniorMessage = "You are a senior"

    scanner.use {
        when (it.nextInt()) {
            in 0..< ADULT_AGE_MINIMUM -> println(minorMessage)
            in ADULT_AGE_MINIMUM .. ADULT_AGE_MAXIMUM -> println(adultMessage)
            else -> println(seniorMessage)
        }
    }

    // Below was my solution, but I like the one above from community
//    if (age in adultLowerBound..adultUpperBound) {
//        println(adultMessage)
//    } else if (age < adultLowerBound) {
//        println(minorMessage)
//    } else {
//        println(seniorMessage)
//    }

    for (i in 1..5) {
        println("i = $i")
    }
}