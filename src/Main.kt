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

    println("Please, remind me your name.")
    val userName = scanner.nextLine()
    println("What a great name you have, $userName!")

    val adultMessage = "You are an adult"
    val minorMessage = "You are a minor"
    val seniorMessage = "You are a senior"

    println("What is you age?")
    scanner.use {
        when (it.nextInt()) {
            in ZERO..< ADULT_AGE_MINIMUM -> println(minorMessage)
            in ADULT_AGE_MINIMUM .. ADULT_AGE_MAXIMUM -> println(adultMessage)
            else -> println(seniorMessage)
        }
    }

    for (i in 1..5) {
        println("i = $i")
    }
}