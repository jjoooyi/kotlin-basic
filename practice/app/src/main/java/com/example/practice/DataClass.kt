package com.example.practice

data class Ticket(val companyName: String, val name: String, var data: String, var seatNumber: Int)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName: String, val name: String, var data: String, var seatNumber: Int)

fun main() {
    val ticketA = Ticket("KoreanAir", "Jooyi", "2021-04-18", 14)
    val ticketB = TicketNormal("KoreanAir", "Jooyi", "2021-04-18", 14)

    println(ticketA)
    println(ticketB)

}