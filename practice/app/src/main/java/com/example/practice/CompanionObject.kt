package com.example.practice

interface IdProvider {
    fun getId() : Int
}


// 다른 곳에서 객체 생성하지 못하도록 private constructor
class Book private constructor(val id: Int, val name:String) {
    // companion object - java 에서 static 같은 역할
//    companion object {
    // 이름 지정 및 인터페이스 상속받기 가능
    companion object BookFactory: IdProvider {

        override fun getId(): Int {
            return 444
        }

        val myBook = "new Book"

//        fun create() = Book(0, "animal farm")
        fun create() = Book(getId(), myBook)
    }
}

fun main() {
//    val book = Book.Companion.create()
    val book = Book.create()
    val bookId = Book.BookFactory.getId() // == Book.getId()
    println("${book.id} ${book.name}")
}