package com.example.practice

// class는 기본적으로 final, 상속, 오버라이드 등으로 사용하려면 open 키워드 사용해야함
class Human0 {}
// class Human (val name : String) { 로 생략 가능
class Human constructor(name : String) {
    val name = name
    fun eatingCake() {
        println("This is so Yummyyy~~~")
    }
}

// 같은 파일 내에서도 상속등으로 사용하고 싶을 때 open 해줘야 사용 가능함
open class Human1 (val name : String = "Anonymous") {
    // 부 생성자 constructor
    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age} years old")
    }

    init { // 주 생성자의 일부
        println("New Human has been born!!")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean : Human1() {
    override fun singASong() {
        super.singASong()
        println("라라라")
        println("my name is : ${name}")
    }
}

fun main() {
    val human = Human("Jooyi")
    human.eatingCake()
    println("This human's name is ${human.name}")

    val stranger = Human1() // default 값 존재할 경우 초기값 입력하지 않아도 에러나지 않음
    val mom = Human1("Kuri", 52)

    val korean = Korean()
    korean.singASong()
}