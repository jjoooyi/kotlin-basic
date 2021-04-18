package com.example.practice

//1. Lambda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수 있다.
// 3) 마지막에 있는 코드 줄이 return 값으로 사용됨

// 람다의 기본정의
// val lambdaName : Type = {argumentList -> codeBody}
// Type (Input Type) -> (Output Type)

// Type 추론을 위해서 한곳에서는 타입을 명시해줘야 함
val square : (Int) -> (Int) = {number -> number * number}
val square1 = {number : Int -> number * number}

val nameAge = {name : String, age : Int ->
    "my name is ${name} i'm ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("Jooyi", 99))

    val a = "Jooyi said "
    val b = "Joy said "

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(97))
    println(calculateGrade(971))

    val lambda = {number : Double -> number == 4.3213}
    // val lambda : (Double) -> Boolean = {number : Double -> number == 4.3213}
    println(invokeLambda(lambda))

    // 람다 리터럴
    println(invokeLambda({true}))
    println(invokeLambda({it > 3.22}))
    // 마지막 파라미터가 람다식일 경우 사용!
    // it : 하나 들어간 인풋 파라미터 값
    println(invokeLambda { it > 3.22 })

    // 1. kotlin interface 가 아닌 자바 인터페이스여아 한다
    // 2. 그 인터페이스는 딱 하나의 메소드만 가져야 한다

}

// 확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    // String.(Int) 여기서 Int 는 파라미터! 입력된 파라미터가 한개일 경우 it 으로 지칭 가능, String 은 this 로, this 는 해당 함수를 call 하는 object(String)
    val introduceMyself : String.(Int) -> String = {
        "I am ${this} and ${it} years old"
    }
    return name.introduceMyself(age)
}

// 람다의 Return
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법

// 정의한 람다식을 매개변수로 사용하려는 함수
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2354)
}