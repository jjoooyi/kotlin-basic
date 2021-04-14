package com.example.practice

fun main() {
    helloWorld()
    println(add(4, 5))

    //3. String Template
    val name = "Jooyi"
    val lastName = "Park"
    println("my name is $name")
    println("my name is ${name + lastName}hi")

    println("this is 2\$a")

}
//1. 함수
fun helloWorld() : Unit {
    println("Hello World")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}
// 단일 표현식 함수 - 반환형의 타입 추론 가능, 생략 가능
fun add2(a: Int, b: Int, c: Int) = a + b + c

//2. val vs var
// val = value, 상수 변하지 않는 값
// var = variable, 변수 변할 수 있는 값
fun hi() {
    val a : Int = 10
    var b : Int = 9
    b = 100

    // 타입 자동 추론
    val c = 100
    var d = 100
    var name = "jooyi"
    // var name : String = "jooyi" 같은 의미

    // 선언만 할 때는 변수 형 지정해줘야 함
    var e : String
}