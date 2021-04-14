package com.example.practice

fun main() {
    nullcheck()
    ignoreNulls("haha")

}

//7. Nullable / NonNull
fun nullcheck() {
    //NPE : NullPointerException, 자바에서는 runtime Exception, 코틀린에서는 compile time exception 처리
    var name = "Jooyi" // String 타입은 기본적으로 NonNull 타입임
    var nullName : String? = null // null 을 넣고 싶을때는 타입명 넣고 ? 함께 사용, 타입생략하면 안됨

    var nameInUpperCase = name.toUpperCase()
    var nullNameUpperCase = nullName?.toUpperCase() // 만약에 null 이 아니면 uppercase, null 이면 null 반환 "?" 연산자 사용

    // ?:  - 엘비스프레슬리 연산자, null 일 때 default 값 주고 싶을 때 사용
    val lastName : String? = null
    val fullName = name + " " + (lastName?: "No lastName")

    println(fullName)

}

fun ignoreNulls(str : String?) { // str nullable
    // !!  - nullable Type으로 지정되어있지만 null이 아닌것을 보증해줄게, 사용하는것 지양하는 게 좋음
    val mNotNull : String = str!! // nullable 아닌것을 보증
    val upper = mNotNull.toUpperCase()

    val email : String? = "jjoooyi@gmail.com"
    // email 이 null 이 아니면 let 함수 수행
    email?.let{
        println("my email is ${email}")
    }

}