package com.example.practice

fun main() {
    checkNum(1)
    forAndWhile()
}

//4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know") // 없어도 됨
    }

    // 변수로 값을 받을 때는 else 필수, 아닐 땐 없어도 됨, expression 으로 사용될 경우
    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when (score) {
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }

}

// Expression 표현식 vs Statement
// 표현식: 결과로 값을 만들어 내는것..?

//5. Array and List
// Array 크기 고정
// List
// 1. List (수정불가능, 인터페이스)
// 2. MutableList(수정가능) - ArrayList ...

fun array() {

    val array0 = arrayOfNulls<Int>(5)

    val array = arrayOf(1, 2, 3) // Array<Int>
    val list = listOf(1, 2, 3) // List<Int>

    val array2 = arrayOf(1, "d", 3.4f) // Array<Any>
    val list2 = listOf(1, "d", 3.4f) // List<Any>

    array[0] = 3
//    list[0] = 3
    var result = list.get(0) // : Int

    val arrayList = arrayListOf<Int>() // var 여도 되긴하지만 참조값은 변하지 않기 때문에 val 로 사용
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
//    arrayList = arrayListOf() val로 선언된 경우 재 할당할 수 없음

}

//6. 반복문 for / while
fun forAndWhile() {
    val students = arrayListOf("joyce", "jenny", "jenifer", "james")

    for (name in students) {
        println("${name}")
    }

    var sum = 0
    for (i in 1..10 step 2) {
        sum += i
    }
    for (i in 10 downTo 1) {

    }
    for (i in 1 until 100) { // 1~99, 1..100 = 1~100

    }
    println(sum)

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생: ${name}")
    }

    var index = 0
    while(index<10) {
        println("current index : ${index}")
        index++
    }


}